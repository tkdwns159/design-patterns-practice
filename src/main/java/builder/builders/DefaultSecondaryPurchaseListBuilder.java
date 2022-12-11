package builder.builders;

import builder.Item;
import builder.PurchaseList;

public class DefaultSecondaryPurchaseListBuilder implements SecondaryPurchaseListBuilder {

    private PurchaseList purchaseList;

    public DefaultSecondaryPurchaseListBuilder(PurchaseList purchaseList) {
        this.purchaseList = purchaseList;
    }

    private DefaultSecondaryPurchaseListBuilder(){
    }

    @Override
    public SecondaryPurchaseListBuilder addItem(Item item) {
        this.purchaseList.addItem(item);
        return this;
    }

    @Override
    public SecondaryPurchaseListBuilder storeName(String name) {
        this.purchaseList.setStoreName(name);
        return this;
    }


    @Override
    public PurchaseList getList() {
        return this.purchaseList;
    }
}
