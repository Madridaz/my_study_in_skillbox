public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 50, 2);
        basket.add("meat", 100, 1, 2.3);
        basket.add("apple", 45, 1.7);
        basket.add("potato", 100, 5.5);
        basket.print("Корзина 1");


    }
}
