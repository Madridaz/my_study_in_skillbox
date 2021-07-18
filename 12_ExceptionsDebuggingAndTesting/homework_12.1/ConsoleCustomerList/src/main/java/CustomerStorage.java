import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {

  private final Map<String, Customer> storage;

  public CustomerStorage() {
    storage = new HashMap<>();
  }

  public void addCustomer(String data) {
    final int INDEX_NAME = 0;
    final int INDEX_SURNAME = 1;
    final int INDEX_EMAIL = 2;
    final int INDEX_PHONE = 3;
    final int currentSize = 4;

    String[] components = data.split("\\s+");
    if (components.length != currentSize) {
      throw new IllegalArgumentException("Строка data имеет неверный формат");
    } else if (!components[2]
        .matches("[a-z]+@[a-z]+\\.[a-z]+")) {
      throw new IllegalArgumentException("Формат email неверный");
    } else if (!components[3]
        .matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")) {
      throw new IllegalArgumentException("Формат номера неверный");
    }

    String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
    storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
  }

  public void listCustomers() {
    storage.values().forEach(System.out::println);
  }

  public void removeCustomer(String name) {
    if (name.isEmpty()) {
      throw new IllegalArgumentException("Неверный формат строки remove");
    }
    storage.remove(name);
  }

  public Customer getCustomer(String name) {
    return storage.get(name);
  }

  public int getCount() {
    return storage.size();
  }
}