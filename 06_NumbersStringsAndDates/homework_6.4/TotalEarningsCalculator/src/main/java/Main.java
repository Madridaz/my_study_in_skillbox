public class Main {

  public static void main(String[] args) throws NumberFormatException {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    String newText = text.replaceAll(",","");
    String[] words = newText.split(" ");

    int salary[] = new int[words.length];

    for (int i = 0; i < words.length; i++) {
      try {
        salary[i] = Integer.parseInt(words[i]);
      } catch (NumberFormatException e) {

      }
     } 
         
    int sum = 0;
    for (int element : salary)
    sum += element;
    
      
      System.out.println(sum);
    
    }
  }

