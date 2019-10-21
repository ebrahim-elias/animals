import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class AnimalTest {
    SaveRetrieve c = new SaveRetrieve();
    List<Animal> list = new ArrayList<>();
    Animal animal1 = new Dog("dog","max",2010);
    Animal animal2 = new Fish("shark","rex",2014);
    Animal animal3 = new Horse("horse","speed",2015);


@Test
void filterlistbyname(){}
}
