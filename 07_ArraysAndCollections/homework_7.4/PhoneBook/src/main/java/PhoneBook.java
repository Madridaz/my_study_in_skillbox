import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {

  TreeMap<String, String> contacts = new TreeMap<>();

  public void addContact(String name, String phone) { //работает
    // проверьте корректность формата имени и телефона
    // если такой номер уже есть в списке, то перезаписать имя абонента
    contacts.put(name, phone);
    System.out.println("Контакт сохранен.");

  }

  public String getNameByPhone(String phone) {// выводит все пары а нужна искомая
    // формат одного контакта "Имя - Телефон"
    // если контакт не найдены - вернуть пустую строку
    if (contacts.containsValue(phone)) {

      Set set = contacts.entrySet();
      for (Object element : set) {
        Map.Entry mapEntry = (Map.Entry) element;
        System.out.println(mapEntry.getKey() + " - " + mapEntry.getValue());
      }
    }
    return "";
  }

  public Set<String> getPhonesByName(String name) { //работает, но вывод в консоль не тот!
    // формат одного контакта "Имя - Телефон"
    // если контакт не найден - вернуть пустой TreeSet
    if (contacts.containsKey(name)) {
      System.out.println(contacts.ceilingEntry(name));
    } else {
      System.out.println("Такого имени в телефонной книге нет."
          + "\n"
          + "Введите номер телефона для абонента: " + name);
      Scanner scanner = new Scanner(System.in);
      String number = scanner.nextLine();
      addContact(name, number);
    }
    return new TreeSet<>();
  }

  public Set<String> getAllContacts() { //разобраться с выводом в консоль и зачем TreeSet тут?
    // формат одного контакта "Имя - Телефон"
    // если контактов нет в телефонной книге - вернуть пустой TreeSet
    TreeSet<String> allContacts = new TreeSet<>();
    System.out.println(contacts);

    return new TreeSet<>();
  }

}