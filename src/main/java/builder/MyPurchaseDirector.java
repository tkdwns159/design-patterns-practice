package builder;

import builder.builders.DefaultPurchaseListBuilder;

import java.time.LocalDate;

public class MyPurchaseDirector {
    private DefaultPurchaseListBuilder builder;

    public MyPurchaseDirector(DefaultPurchaseListBuilder builder) {
        this.builder = builder;
    }

    PurchaseList pastaRecipe() {
        return builder.newInstance()
                .ownerName("KIM")
                .purchaseDate(LocalDate.now())
                .costLimit(20000)
                .validate()
                .addItem(new Item("토마토 통조림", 3000))
                .addItem(new Item("마늘", 2000))
                .addItem(new Item("양파", 2000))
                .addItem(new Item("파스타 면", 3000))
                .addItem(new Item("다진 고기", 2000))
                .getList();
    }

    PurchaseList steakRecipe() {
        return builder.newInstance()
                .ownerName("YOUN")
                .purchaseDate(LocalDate.now())
                .costLimit(50000)
                .validate()
                .addItem(new Item("버터", 3000))
                .addItem(new Item("beef loin", 30000))
                .addItem(new Item("아스파라거스", 3000))
                .getList();
    }


}
