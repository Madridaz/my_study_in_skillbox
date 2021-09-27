public class Main {
    private static final String head = "Добро пожаловать в виртуальный банк JAVA Transfer" + "\n";

    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        String operationOne = "1, 2, 30000";
        String operationTwo = "3, 4, 1000000";
        String operationThree = "5, 10, 40000";
        String operationFour = "6, 7, 50000";
        System.out.println(head);

        TestOperation testOperation = new TestOperation(bank, operationOne);
        TestOperation testOperation1 = new TestOperation(bank, operationTwo);
        TestOperation testOperation2 = new TestOperation(bank, operationThree);
        TestOperation testOperation3 = new TestOperation(bank, operationFour);

        testOperation.start();
        testOperation.join();

        testOperation1.start();
        testOperation1.join();

        testOperation2.start();
        testOperation2.join();

        testOperation3.start();
        testOperation3.join();

    }
}

