public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    private static int allPriceCount = 0;
    private static int allItemsCount = 0;

    public static int getAllPriceCount() {
        return allPriceCount;
    }

    public static int getAllItemsCount() {
        return allItemsCount;
    }

    public static double averageItemPrice() {
        return getAllPriceCount() / getAllItemsCount();
    }

    public static double averageBasketPrice() {
        return getAllPriceCount() / getCount();
    }

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
        allPriceCount = allPriceCount + price;
        allItemsCount = allItemsCount + count;
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт., цена - " + price;
        totalPrice = totalPrice + count * price;

    }

    public void add(String name, int price, double weight) {
        add(name, price, 1);
        this.totalWeight = totalWeight + weight;
        allPriceCount = allPriceCount + price;
        allItemsCount = allItemsCount + count;
    }

    public void add(String name, int price, int count, double weight) {
        add(name, price, 1);
        this.totalWeight = totalWeight + weight;
        allPriceCount = allPriceCount + price * count;
        allItemsCount = allItemsCount + count;
    }

    public double weight() {
        return totalWeight;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items + "\n" + "Общий вес: " + totalWeight);

        }
    }
}
