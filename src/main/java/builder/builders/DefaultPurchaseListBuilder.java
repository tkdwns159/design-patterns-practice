package builder.builders;

public class DefaultPurchaseListBuilder implements PurchaseListBuilder{

    private PrimaryPurchaseListBuilder builder;

    public DefaultPurchaseListBuilder(PrimaryPurchaseListBuilder builder) {
        this.builder = builder;
    }

    public PrimaryPurchaseListBuilder newInstance() {
        return builder.newInstance();
    }
}
