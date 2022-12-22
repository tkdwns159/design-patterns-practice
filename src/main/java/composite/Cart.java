package composite;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Calculable {
    private List<Item> items = new ArrayList<>();

    @Override
    public int getPrice() {
        return items.stream().map(Item::getPrice).reduce(0, Integer::sum);
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
}
