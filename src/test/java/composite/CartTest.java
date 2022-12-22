package composite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void getPriceOfCart() {
        Cart cart = new Cart();
        Item apple = new Item("apple", 1000);
        Item banana = new Item("banana", 3000);

        cart.addItem(apple);
        cart.addItem(banana);

        Assertions.assertEquals(cart.getPrice(), apple.getPrice() + banana.getPrice());
    }

}