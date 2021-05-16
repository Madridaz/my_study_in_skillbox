ppackage ru.skillbox;

import ru.skillbox.FedExList;

public class Main {

  public static void main(String[] args) {
    Dimensions dimensions = new Dimensions(3, 3, 3);
    System.out.println("объем груза - " + dimensions.getVolume());
    System.out.println();

    // создание объекта с информацией о грузе и вывод в консоль
    FedExList list = new FedExList(dimensions, 10.5, "ул. Ленина, 5", true, "A500s98", false);
    System.out.println(list);
    System.out.println();

    // создание копии объекта
    FedExList listCopy = new FedExList(dimensions, 10.5, "ул. Ленина, 5", true, "A500s98", false);

    // изменение веса первоначального объекта и вывод результата в консоль
    list.setWeight(100.5);
    System.out.println("теперь стало: " + list);
    System.out.println();

    // изменение адреса первоначального объекта и вывод результата в консоль
    list.setDeliveryAddress("ул. Кукуева");
    System.out.println("теперь стало: " + list);
    System.out.println();

    // вывод в консоль копии объекта - параметры не изменились после изменения параметров
    // первоначального объекта
    System.out.println(listCopy);
  }
}
