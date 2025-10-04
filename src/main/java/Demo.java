import ua.edu.ucu.apps2025.lab4.Character;
import ua.edu.ucu.apps2025.lab4.CharacterFactory;

import java.lang.reflect.InvocationTargetException;

public class Demo {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println("Hello, world!");

        Character randomCharacter = CharacterFactory.createRandomCharacterWithReflection();
        System.out.println(randomCharacter);

        for(int i = 0; i < 10; i++) {
            System.out.println(CharacterFactory.createRandomCharacterWithReflection());
        }
    }
}
