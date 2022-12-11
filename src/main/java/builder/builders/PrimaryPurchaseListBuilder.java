package builder.builders;

import java.time.LocalDate;

public interface PrimaryPurchaseListBuilder extends PurchaseListBuilder {

    PrimaryPurchaseListBuilder ownerName(String name);
    PrimaryPurchaseListBuilder purchaseDate(LocalDate localDate);
    PrimaryPurchaseListBuilder costLimit(int limit);
    SecondaryPurchaseListBuilder validate();

}
