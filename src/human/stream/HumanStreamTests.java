package human.stream;

import human.Human;
import human.HumanGenerator;

import java.util.List;
import java.util.stream.Collectors;

public class HumanStreamTests {
    public static void main(String[] args) {
        HumanGenerator generator = new HumanGenerator();

        //Get all humans with salary > 1000
//        List<Human> highSalaryPeople = generator
//                .generate(100)
//                .stream()
//                .filter(human -> human.getSalary() > 1000)
//                .filter(human -> human.getSalary() < 1100)
//                .peek(human -> System.out.println("After filter: " + human))
//                .collect(Collectors.toList());

        //Get humans with unique names
//        long count = generator
//                .generate(100)
//                .stream()
//                .distinct()
//                .peek(System.out::println)
//                .count();
//        System.out.println("count = " + count);

        //Sort by salary
//        List<Human> sorted = generator
//                .generate(10)
//                .stream()
//                .filter(h -> h.getSalary() > 1000)
//                .distinct()
//                .sorted((h1, h2) -> h1.getSalary() - h2.getSalary())
//                .peek(System.out::println)
//                .collect(Collectors.toList());

        //Find with max salary
//        List<Human> withMaxSalary = generator
//                .generate(10)
//                .stream()
//                .sorted((h1, h2) -> h2.getSalary() - h1.getSalary())
//                .skip(1)
//                .limit(1)
//                .peek(System.out::println)
//                .collect(Collectors.toList());
//        System.out.println(withMaxSalary);

        //Mark Koline -> MARK koline
        generator
                .generate(10)
                .stream()
                .map(human -> {
                    String[] nameParts = human.getName().split(" ");
                    String newName = nameParts[0].toUpperCase() + " " + nameParts[1].toLowerCase();

                    return new Human(newName, human.getSalary());
                })
                .map(human -> new Human(human.getName(), human.getSalary() * 2))
                .map(human -> human.getName() + ": " + human.getSalary())
                .filter(it -> it.toLowerCase().contains("a"))
                .filter(it -> it.charAt(it.length() - 1) == '2')
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
