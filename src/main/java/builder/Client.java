package builder;

import builder.builders.DefaultPrimaryPurchaseListBuilder;
import builder.builders.DefaultPurchaseListBuilder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        DefaultPurchaseListBuilder builder = new DefaultPurchaseListBuilder(new DefaultPrimaryPurchaseListBuilder());

        PurchaseList list = builder.newInstance().ownerName("김철수")
                .purchaseDate(LocalDate.of(2022,12,23))
                .costLimit(1000)
                .validate()
                .addItem(new Item("유과", 1000))
                .addItem(new Item("사과", 1500))
                .getList();

        MyPurchaseDirector director = new MyPurchaseDirector(builder);

        PurchaseList pastaRecipe = director.pastaRecipe();
        PurchaseList steakRecipe = director.steakRecipe();
    }
}
