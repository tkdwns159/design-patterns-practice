package composite;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Calculable {
    private List<Calculable> calculables = new ArrayList<>();

    @Override
    public int getPrice() {
        return calculables.stream().map(Calculable::getPrice).reduce(0, Integer::sum);
    }

    public void addCalculable(Calculable calculable) {
        this.calculables.add(calculable);
    }
}
