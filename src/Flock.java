import quack.Quackable;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (int i = 0; i < quackers.size(); i++) {
            Quackable quacker = quackers.get(i);
            if (i == 0) {
                quacker.quack();
                quacker.quack();
                quacker.quack();
            } else {
                quacker.quack();
            }
        }
    }
}
