package human;

public class HumanToIntegerTransformerImpl implements HumanToIntegerTransformer {
    @Override
    public int transform(Human human) {
        return human.getSalary();
    }
}
