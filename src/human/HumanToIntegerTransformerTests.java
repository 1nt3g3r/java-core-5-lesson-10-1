package human;

public class HumanToIntegerTransformerTests {
    public static void main(String[] args) {
        Human human = new Human("John", 1000);

        HumanToIntegerTransformer transformer = h -> h.getSalary();

        System.out.println(transformer.transform(human));
    }
}
