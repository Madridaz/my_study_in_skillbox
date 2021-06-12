import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {

  HashMap<String, Set<String>> contacts = new HashMap<>();

  public void addContact(String name, String phone) {
    // проверьте корректность формата имени и телефона
    // если такой номер уже есть в списке, то перезаписать имя абонента
    Set<String> phones = new TreeSet<>();
    if (phones.contains(phone)) {
      contacts.put(name, phones);
      System.out.println("Контакт перезаписан");
      return;
    }

    phones.add(phone);
    contacts.put(name, phones);
    System.out.println("Контакт сохранен");
  }

  public boolean presentPhone(HashMap<String, Set<String>> contacts, String phone) {
    for (Set<String> phones : contacts.values()) {
      if (phones.contains(phone)) {
        return true;
      }
    }
    return false;
  }

  public String getNameByPhone(String phone) {
    // формат одного контакта "Имя - Телефон"
    // если контакт не найдены - вернуть пустую строку
    Set<String> phones = new HashSet<>();
    for (String name : contacts.keySet()) {
      phones.addAll(contacts.get(name));
      System.out.println("есть");

    }

    return "";
  }

  public Set<String> getPhonesByName(String name) {
    // формат одного контакта "Имя - Телефон"
    // если контакт не найден - вернуть пустой TreeSet
    TreeSet<String> info = new TreeSet();

    if (contacts.get(name) != null) {
      System.out.println(name + " " + contacts.get(name));
    } else {
      System.out.println(
          "Такого имени в телефонной книге нет."
              + "\n"
              + "Введите номер телефона для абонента: "
              + name);
      Scanner scanner = new Scanner(System.in);
      String number = scanner.nextLine();
      addContact(name, number);
    }

    return new TreeSet<>();
  }

  public Set<String> getAllContacts() {
    // формат одного контакта "Имя - Телефон"
    // если контактов нет в телефонной книге - вернуть пустой TreeSet
    final Set<String> names = contacts.keySet();
    for (String name : names) {
      final Set<String> phones = contacts.get(name);
      final String joinPhone = String.join(", ", phones);
      System.out.println(name + " - " + joinPhone);
    }
    return new TreeSet<>();
  }
}