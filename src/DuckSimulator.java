import quack.Quackable;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingEchoDuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Flock flock = new Flock();

        Quackable mallardDuck = duckFactory.createMallardDuck();
        flock.add(mallardDuck);

        Quackable redheadDuck = duckFactory.createRedheadDuck();
        flock.add(redheadDuck);

        Quackable duckCall = duckFactory.createDuckCall();
        flock.add(duckCall);

        Quackable rubberDuck = duckFactory.createRubberDuck();
        flock.add(rubberDuck);

        Quackable goose = new GooseAdapter(new Goose());
        flock.add(goose);

        Quackable pigeon = new PigeonAdapter(new Pigeon());
        flock.add(pigeon);

        System.out.println("-- Duck Simulator --");

        simulate(flock);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
