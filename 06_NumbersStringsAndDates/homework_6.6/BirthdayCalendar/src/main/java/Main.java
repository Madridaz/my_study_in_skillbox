import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

  public static void main(String[] args) {
    int day = 05;
    int month = 03;
    int year = 1986;

    System.out.println(collectBirthdays(year, month, day));

  }

  public static String collectBirthdays(int year, int month, int day) {
    int age = 0;

    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy - EEEE");
    GregorianCalendar dateOfBirth = new GregorianCalendar(year, month - 1, day);
    GregorianCalendar currentDate = new GregorianCalendar();
    int totalYears = currentDate.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

    for (int i = 0; i <= totalYears; i++) {
      System.out.println(age + " - " + format.format(dateOfBirth.getTime()));
      age += 1;
      dateOfBirth.add(Calendar.YEAR, 1);
    }
    return "";
  }
}
