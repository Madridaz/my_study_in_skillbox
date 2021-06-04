import java.text.DecimalFormat;
import java.util.Arrays;

public class Hospital {

  static float min = 32.0f;
  static float max = 40.0f;


  public static float[] generatePatientsTemperatures(int patientsCount) {
    float[] array = new float[patientsCount];

    for (int i = 0; i < array.length; i++) {
      array[i] = (float) Math.round((Math.random() * (max - min) + min) * 10) / 10;
    }
    return array;
  }


  public static String getReport(float[] temperatureData) {
    float sum = 0.0f;
    int healthy = 0;
    for (int i = 0; i < temperatureData.length; i++) {
      sum += temperatureData[i];
      if (temperatureData[i] >= 36.2 && temperatureData[i] <= 36.9) {
        healthy++;

      }
    }

    float average = (float) Math.round(sum/ temperatureData.length * 100) / 100;
    String temp = "";
    for (int j = 0; j < temperatureData.length; j++) {
      temp = temp + temperatureData[j];
      if (j < temperatureData.length - 1) {
        temp = temp + " ";
      }
    }

    String report =
        "Температуры пациентов: "
            + temp
            + "\nСредняя температура: "
            + average
            + "\nКоличество здоровых: "
            + healthy;
    return report;
  }
}


