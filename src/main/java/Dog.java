/**
 * sub class of a animal class witch represent the Dog animal and extends a swimmer interface
 */
public class Dog extends Animal implements Swimmer{

    /**
     * constructor with the same fields in the super class animal
     * @param type the type
     * @param name the name
     * @param yearOfBirth the year of birth
     */

    Dog(String type, String name, int yearOfBirth) {
        super(type, name, yearOfBirth);

    }

}
