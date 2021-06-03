import java.text.DecimalFormat;
import java.util.Arrays;

public class Hospital {

  static float min = 32.0f;
  static float max = 40.0f;
  static float sum = 0.0f;

  public static float[] generatePatientsTemperatures(int patientsCount) {
    // TODO: напишите метод генерации массива температур пациентов
    float[] array = new float[patientsCount];

    for (int i = 0; i < array.length; i++) {
      array[i] = (float) ((Math.random() * (max - min) + min));
      //System.out.println(array[i]);
      sum += array[i];
    }
    return array;
  }

  public static String getReport(float[] temperatureData) {
    /*
    TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
        а также температуры всех пациентов.
    */
    String temp = Arrays.toString(temperatureData);

    int healthy = 0;
    int sick = 0;
    for (int i = 0; i < temperatureData.length; i++) {
      if (temperatureData[i] >= 36.2 && temperatureData[i] <= 36.9) {
        healthy++;
      } else {
        sick++;
      }
    }
    double roundOff = (double) Math.round(sum / temperatureData.length * 100) / 100;
    String report =
        "Температуры пациентов: "
            + temp
            + "\nСредняя температура: "
            + roundOff/*sum / temperatureData.length*/
            + "\nКоличество здоровых: "
            + healthy;
    return report;
  }
}

//  chelovek v
//  telege podskazal
//  double value = 34.766674;
//System.out.format("%.3f",value);
