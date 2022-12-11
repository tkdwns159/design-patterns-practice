package builder.builders;

import builder.PurchaseList;

import java.time.LocalDate;
import java.util.Objects;

public class DefaultPrimaryPurchaseListBuilder implements PrimaryPurchaseListBuilder {

    private PurchaseList purchaseList;

    @Override
    public DefaultPrimaryPurchaseListBuilder newInstance() {
        this.purchaseList = new PurchaseList();
        return this;
    }

    @Override
    public PrimaryPurchaseListBuilder purchaseDate(LocalDate localDate) {
        this.purchaseList.setPurchaseDate(localDate);
        return this;
    }

    @Override
    public PrimaryPurchaseListBuilder ownerName(String name) {
        this.purchaseList.setOwnerName(name);
        return this;
    }

    @Override
    public PrimaryPurchaseListBuilder costLimit(int limit) {
        this.purchaseList.setCostLimit(limit);
        return this;
    }

    @Override
    public SecondaryPurchaseListBuilder validate() {
        if(this.purchaseList.getCostLimit() == 0 ||
        this.purchaseList.getOwnerName().isEmpty() ||
                Objects.isNull(this.purchaseList.getPurchaseDate())) {
            throw new IllegalStateException();
        }

        return new DefaultSecondaryPurchaseListBuilder(this.purchaseList);
    }
}
