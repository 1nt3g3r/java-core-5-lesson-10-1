package human;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class HumanGenerator {
    public Collection<Human> generate(int count) {
        Random random = new Random();

        List<String> firstNames = List.of("John", "Mark", "Bill", "Larry", "Igor");
        List<String> lastNames = List.of("Gates", "Mask", "Petrov", "Koline", "Javov");

        Collection<Human> result = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String firstName = firstNames.get(random.nextInt(firstNames.size()));
            String lastName = lastNames.get(random.nextInt(lastNames.size()));

            String fullName = firstName + " " + lastName;

            int salary = 500 + random.nextInt(1001);

            result.add(new Human(fullName, salary));
        }

        return result;
    }
}
