public class Main {

  public static void main(String[] args) {
    PhysicalPerson physicalPerson = new PhysicalPerson();
    LegalPerson legalPerson = new LegalPerson();
    IndividualBusinessman individualBusinessman = new IndividualBusinessman();

    System.out.println();
    System.out.println("Работа с physicalPerson");
    System.out.println();

    physicalPerson.getAmount();
    physicalPerson.put(100);
    physicalPerson.getAmount();
    physicalPerson.take(50);
    physicalPerson.getAmount();
    physicalPerson.take(100);
    physicalPerson.getAmount();

    System.out.println();
    System.out.println("Работа с legalPerson");
    System.out.println();

    legalPerson.getAmount();
    legalPerson.put(100);
    legalPerson.getAmount();
    legalPerson.take(50);
    legalPerson.getAmount();
    legalPerson.take(100);
    legalPerson.getAmount();

    System.out.println();
    System.out.println("Работа с individualBusinessman");
    System.out.println();

    individualBusinessman.getAmount();
    individualBusinessman.put(900);
    individualBusinessman.getAmount();
    individualBusinessman.put(1000);
    individualBusinessman.getAmount();
    individualBusinessman.take(5000);
    individualBusinessman.take(1000);
    individualBusinessman.getAmount();
  }

}
