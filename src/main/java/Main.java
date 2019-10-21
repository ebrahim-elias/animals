import java.util.List;

public class Main {
    public static void main(String[] args) {
        SaveRetrieve  c = new SaveRetrieve();
        List<Animal> list = c.retrieveFromFile();
        c.filterByName(list);

        List<Animal> swimmerByTOB =  c.swimmerL(c.sortByYearOfBirth(list));
        c.saveToFile(swimmerByTOB);
    }
}
