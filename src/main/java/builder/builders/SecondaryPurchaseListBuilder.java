package builder.builders;

import builder.Item;
import builder.PurchaseList;

public interface SecondaryPurchaseListBuilder {

    SecondaryPurchaseListBuilder addItem(Item item);

    SecondaryPurchaseListBuilder storeName(String name);

    PurchaseList getList();
}
