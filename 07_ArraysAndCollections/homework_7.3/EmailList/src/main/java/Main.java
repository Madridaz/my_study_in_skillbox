import java.util.Scanner;
import java.util.TreeSet;
public class Main {
  public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

  /* TODO:
      Пример вывода списка Email, после ввода команды LIST в консоль:
      test@test.com
      hello@mail.ru
      - каждый адрес с новой строки
      - список должен быть отсортирован по алфавиту
      - email в разных регистрах считается одинаковыми
         hello@skillbox.ru == HeLLO@SKILLbox.RU
      - вывод на печать должен быть в нижнем регистре
         hello@skillbox.ru
      Пример вывода сообщения об ошибке при неверном формате Email:
      "Неверный формат email"
  */

  public static void main(String[] args) {
    EmailList emailList = new EmailList();
    
    System.out.println("Enter your email");
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      String input = scanner.nextLine();
   if(input.matches("ADD\\s([A-Za-z0-9-+_]{2,20})@([A-Za-z0-9-+_]{2,7}).([a-z0-9]{2,6})")) {
    String s = input.replace("ADD ", "");
     
     emailList.add(s); 
    System.out.println("email added"); 
   }
   else if(input.contains("LIST")) {
     emailList.getSortedEmails();   
   }
   
   else {
     System.err.println(WRONG_EMAIL_ANSWER);
   }           
  }
 }
}
