import human.Human;

import java.util.function.Function;
import java.util.function.ToLongFunction;
import java.util.stream.Stream;

public class LambdaTests {
    public static void main(String[] args) {
        Human john = new Human("John", 1000);
        Human igor = new Human("Igor", 1500);
        Human mark = new Human("Mark", 800);

        Stream<Human> humans = Stream.of(john, igor, mark);

        double avg = humans
                .mapToLong(human -> human.getSalary())
                .average()
                .getAsDouble();

        System.out.println("avg = " + avg);

        //Промежуточные методы
        //Терминальные
        /*
            //name - John
            //salary - 1000

            //name - Igor
            //salary - 1500

            //name - Mark
            //salary - 800
         */

        //1) Преобразовать Human -> Integer (взять salary)
        //2) Применить операцию AVG (поиск среднего) над массивом полученных чисел
    }
}
