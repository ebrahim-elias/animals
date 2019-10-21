import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class SaveRetrieve {
    private static final String FNAME = "./animals.csv";  //using the dynamic path
    private static final String FNAME2 ="./swimmers.csv";
     private List<Animal> list;
     private List<Animal> swimmerList;
     private BufferedWriter writer;
    /**
     * The method is to save the actual list to text file
     * @param list from type list of task
     */
    void saveToFile(List<Animal> list)  {
        try {
            // Create a file object.
            File file = new File(FNAME2);
            // Create a file writer object with the file.
            FileWriter fileWriter = new FileWriter(file);
            // Create a file object with the file writer.
            writer = new BufferedWriter(fileWriter);
            // Prepare list items to be stored in the file.
            if (list != null) {
                for (Animal animal : list) {
                    String message = animal.toString();
                    writer.write(message + " \n");
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * retrieving the list of animals from the CSV file
     * @return list from type ToDoList
     */

    public List<Animal> retrieveFromFile() {
       list = new ArrayList<>();

        Animal animal = null;
        try (FileReader reader = new FileReader(FNAME);
             BufferedReader br = new BufferedReader(reader)) {
            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");
                List<String> al = Arrays.asList(str);
                // tacking out the values from the list by index
                String type = al.get(0);
                String name = al.get(1);
                String year = al.get(2);
                int yearOfB = yearConverter(year);
                if (yearOfB > 0) { // if the year is bigger an 0 it will be added to the list
                    switch (type) {
                        case"german shepherd":
                        case "golden retriever":
                            animal = new Dog(type, name, yearOfB);
                            break;
                        case"chicken":
                        case"parakeet":
                            animal = new Bird(type, name, yearOfB);
                            break;
                        case"duck":
                            animal = new Duck(type, name, yearOfB);
                        case "dolphin":
                        case"great white shark":
                            animal = new Fish(type, name, yearOfB);
                        case"bengal cat":
                            animal = new Cat(type, name, yearOfB);
                        case"arabian horse":
                            animal = new Horse(type, name, yearOfB);
                    }
                    list.add(animal);
                } else System.err.println(line); // if it is not a number print error message with witch line
            }return list;

            } catch(IOException e){
                System.err.format("IOException: %s%n", e);
            }
        return list;
        }
    /**
     *it will convert the year if it is valid or not by returning it after pars to int or print error
     * message and return -1 if not.
     * @param year the year from csv file as string
     * @return the year as an int if its valid, or -1 if it is not
     */
    private int yearConverter(String year) {
            int yearOfB = -1;
            try {
                yearOfB = Integer.parseInt(year);
            } catch (NumberFormatException e) {
                System.err.println("Check number");
            }
            return yearOfB;
        }

    /**
     * sort the list of animals by name
     * @param list of animals
     */
    public void filterByName(List<Animal> list){
        list.stream().sorted(Comparator.comparing(Animal::getName))
        .forEach(System.out::println);
    }

    /**
     * sort the list of animals by type
     * @param list of animals
     */
    public void filterByType(List<Animal> list){
        list.stream().sorted(Comparator.comparing(Animal::getType))
                .forEach(System.out::println);
    }

    /**
     * sort the list of animals by year of birth
     * @param list of animals
     */
    public void filterByYearOfBirth(List<Animal> list){
        list.stream().sorted(Comparator.comparing(Animal::getYearOfBirth))
                .forEach(System.out::println);
    }

    /**
     * ort the list of animals by year of birth and return a new list of it
     * @param list the old list
     * @return the new list sorted by year of birth
     */
     public List<Animal> sortByYearOfBirth(List<Animal> list){
       return list.stream().sorted(Comparator.comparing(Animal::getYearOfBirth)).collect(Collectors.toList());
     }

    /**
     * create a new list from the old list but with only the elements that extends the swimming interface
     * @param list the old list
     * @return a new swimmer list
     */
     public List<Animal> swimmerL(List<Animal> list){
         swimmerList = new ArrayList<>();
         for(Animal an : list){
             if (an instanceof Swimmer){
                 swimmerList.add(an);
             }
         }
         return swimmerList;
     }
    }

