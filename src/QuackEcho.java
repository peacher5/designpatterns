import quack.Quackable;

public class QuackEcho implements Quackable {
    private Quackable ducks;

    public QuackEcho(Quackable ducks) {
        this.ducks = ducks;
    }

    @Override
    public void quack() {
        ducks.quack();
        System.out.print("Echo: ");
        ducks.quack();
    }
}
