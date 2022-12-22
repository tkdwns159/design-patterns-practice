package composite;

public class House implements Calculable{
    private final String name;
    private final int price;

    public House(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
