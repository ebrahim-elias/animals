/**
 * represent the animal with three fields for each the type,name and the year of birth
 */
public abstract class Animal {
    private String type;
    private String name;
    private int yearOfBirth;

    /**
     * constructor to initialize a new animal
     * @param type the breed of the animal
     * @param name the name of the animal
     * @param yearOfBirth in witch year has born
     */
    Animal(String type, String name, int yearOfBirth) {
        this.type = type;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    String getType() {
        return type;
    }

    String getName() {
        return name;
    }

    int getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * overrides the toString method to print the details of one animal
     * @return string with all the info in one line.
     */
    @Override
    public String toString(){
        return type+","+name+","+yearOfBirth;
    }
}
