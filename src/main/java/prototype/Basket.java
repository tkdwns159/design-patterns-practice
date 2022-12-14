package prototype;

import java.util.*;

public class Basket implements  Cloneable {
    private int size;
    Map<String, Fruit> fruits = new HashMap<>();

    public Basket(int size) {
        this.size = size;
    }

    public void addFruit(Fruit fruit) {
        fruits.put(fruit.getName(), fruit);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//       <shallow copy>
//        return super.clone();

//       <deep copy>
        Basket basket = new Basket(this.size);
        this.fruits.values().stream()
                .map(f -> new Fruit(f.getName()))
                .forEach(basket::addFruit);

        return basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return size == basket.size && Objects.equals(fruits, basket.fruits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, fruits);
    }
}
