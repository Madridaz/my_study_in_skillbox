public class Main {

  public static void main(String[] args) throws InterruptedException {

    Acquaintance acquaintance = new Acquaintance();
    acquaintance.addUsers();

    while (true) {
      acquaintance.printUsers();
    }
  }
}


