/**
 * sub class of a animal class witch represent the fish animal and extends a swimmer interface
 */
public class Fish extends Animal implements Swimmer{
    /**
     * constructor with the same fields in the super class animal
     * @param type the type
     * @param name the name
     * @param yearOfBirth the year of birth
     */

    public Fish(String type, String name, int yearOfBirth) {
        super(type, name, yearOfBirth);
    }
}
