package builder;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class PurchaseList {
    private String ownerName;
    private LocalDate purchaseDate;

    @Getter(AccessLevel.PRIVATE)
    @Setter(AccessLevel.PRIVATE)
    private List<Item> itemList = new ArrayList<>();
    private String storeName;
    private int costLimit;

    public PurchaseList() {
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }
}
