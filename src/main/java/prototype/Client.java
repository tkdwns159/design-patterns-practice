package prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Fruit apple = new Fruit("apple");
        Basket basket = new Basket(2);
        basket.addFruit(apple);

        Basket newBasket = (Basket) basket.clone();

        System.out.println(basket.equals(newBasket));
    }
}
