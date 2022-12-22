package composite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CartTest {

    @Test
    void getPriceOfCart() {
        Cart cart = new Cart();
        Item apple = new Item("apple", 1000);
        Item banana = new Item("banana", 3000);
        House house = new House("타워팰리스", 2000000);

        cart.addCalculable(apple);
        cart.addCalculable(banana);
        cart.addCalculable(house);

        Assertions.assertEquals(cart.getPrice(), apple.getPrice() + banana.getPrice() + house.getPrice());

        Cart bigCart = new Cart();
        bigCart.addCalculable(apple);
        bigCart.addCalculable(cart);

        Assertions.assertEquals(bigCart.getPrice(), apple.getPrice() + cart.getPrice());
    }

}