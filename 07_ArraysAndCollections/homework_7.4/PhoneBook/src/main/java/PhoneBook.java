import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {

  Map<String, Set<String>> contacts = new HashMap<>();

  public boolean isPhone(String input) {
    return input.matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
  }

  public boolean isName(String input) {
    return input.matches("[A-ZА-ЯЁ]{1}[a-zа-яё]+");
  }

  public void addContact(String phone, String name) { //работает
    // проверьте корректность формата имени и телефона
    // если такой номер уже есть в списке, то перезаписать имя абонента
    if (name.isEmpty() || phone.isEmpty()) {
      return;
    }
    if (!isPhone(phone)) {
//        "\\d{11}")) {
      System.out.println("Введен неправильный номер");
      return;
    }
    if (!isName(name)) {
      System.out.println("Введено неправильное имя");
      return;
    }

    Set<String> phones = getPhonesByName(name);
    phones.add(phone);
    String nameByPhone = getNameByPhone(phone);
    if (!"".equals(nameByPhone)) {
      contacts.remove(nameByPhone.substring(0, nameByPhone.indexOf(" ")));
    }
    contacts.put(name, phones);
    System.out.println("Контакт сохранен!");
  }

  public String getNameByPhone(String phone) {
    // формат одного контакта "Имя - Телефон"
    // если контакт не найдены - вернуть пустую строку
    for (String name : contacts.keySet()) {
      for (String phones : contacts.get(name)) {
        if (phones.contains(phone)) {
          return name + " - " + phone;
        }
      }
    }
    return "";
  }

  public Set<String> getPhonesByName(String name) {
    // формат одного контакта "Имя - Телефон"
    // если контакт не найден - вернуть пустой TreeSet
    if (contacts.containsKey(name)) {
      Set<String> allPhones = contacts.get(name);
      String outPut = name + " - " + String.join(", ", allPhones);
      Set<String> contact = new TreeSet<>();
      contact.add(outPut);
      return contact;
    }
    return new TreeSet<>();
  }

  public void printOneContact(Set<String> contactAndNumber, String name) {
    Set<String> onlyPhones = new TreeSet<>();
    for (String one : contactAndNumber) {
      String deleteName = one.replace(name + " - ", "");
      onlyPhones.add(deleteName);
    }
    System.out.println(name + " - " + String.join(", ", onlyPhones));
  }

  public Set<String> getAllContacts() { //разобраться с выводом в консоль и зачем TreeSet тут?
    // формат одного контакта "Имя - Телефон"
    // если контактов нет в телефонной книге - вернуть пустой TreeSet
    if (contacts.isEmpty()) {
      return Collections.emptySet();
    }
    final TreeSet<String> allContact = new TreeSet<>();
    for (Entry<String, Set<String>> entry : contacts.entrySet()) {
      final Set<String> phones = contacts.get(entry.getKey());
      allContact.add(entry.getKey() + " - " + String.join(", ", phones));
    }
    return allContact;
  }

}
