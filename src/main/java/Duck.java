/**
 * sub class of a animal class witch represent the duck animal and extends a swimmer interface
 */
public class Duck extends Animal implements Swimmer {
    /**
     * constructor with the same fields in the super class animal
     * @param type the type
     * @param name the name
     * @param yearOfBirth the year of birth
     */
    public Duck(String type, String name, int yearOfBirth) {
        super(type, name, yearOfBirth);
    }
}
