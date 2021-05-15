public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 50, 2, 1.7);
        basket.add("meat", 100, 2, 2.3);
        basket.add("apple", 50, 1.7);
        basket.add("potato", 100);
        basket.print("Корзина 1");

        System.out.println();

        Basket basket1 = new Basket();
        basket1.add("sugar", 100, 2, 1.5);
        basket1.add("soap", 10, 2, 2.5);
        basket1.add("milk", 50, 2, 1.5);
        basket1.print("Корзина 2");

        System.out.println();

        Basket basket2 = new Basket();
        basket2.add("sugar", 100, 5, 1.5);
        basket2.print("Корзина 3");

        System.out.println();
        System.out.println("Общая стоимость всех товаров всех корзин: " + Basket.getAllPriceCount());
        System.out.println("Общее количество всех товаров всех корзин: " + Basket.getAllItemsCount());
        System.out.println("Средняя стоимость товара по всем корзинам: " + Basket.averageItemPrice());
        System.out.println("Средняя стоимость корзины: " + Basket.averageBasketPrice());

    }
}
