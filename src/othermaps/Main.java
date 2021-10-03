package othermaps;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.1, 7);
        stockList.addStock(temp);
        temp = new StockItem("car", 1213.3, 1);
        stockList.addStock(temp);
        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);
        temp = new StockItem("door", 81.6, 4);
        stockList.addStock(temp);
        temp = new StockItem("juice", 2.5, 36);
        stockList.addStock(temp);
        temp = new StockItem("phone", 99.99, 80);
        stockList.addStock(temp);
        temp = new StockItem("phone", 99.99, 10);
        stockList.addStock(temp);

        System.out.println(stockList);

//        for(String s : stockList.Items().keySet()){
//            System.out.println(s);
//        }

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "car", 1);
        sellItem(timsBasket, "spanner", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "juice", 4);
        sellItem(timsBasket, "cup", 12);
        sellItem(timsBasket, "bred", 10);
        System.out.println(timsBasket);

        System.out.println(stockList);


    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
