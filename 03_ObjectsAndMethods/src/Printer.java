public class Printer {
    private static String queue = "";
    private String text;
    private String name;
    private int pages;
    private static int pagesCount = 0;
    private static int documentsCount = 0;

    public void append(String text) {
        this.queue = queue + "Содержание документа: " + text + "\n";
    }

    public void append(String text, String name) {
        this.queue = queue + "Содержание документа: " + text + ", " + "название документа: " + name + "\n";
    }

    public void append(String text, String name, int pages) {
        this.queue = queue + "Содержание документа: " + text + ", " + "название документа: " + name + ", " +
                "количество страниц: " + pages + "\n";
    }

    public void print() {
        System.out.println(queue);
        queue = "";
    }

    public void clear() {
        System.out.println("Очередь печати очищена");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("докладная");
        printer.append("расписка", "лист1");
        printer.append("заявление", "лист2", 10);
        printer.append("жалоба", "лист3", 50);
        printer.append("объявление", "лист4", 2);
        printer.print();
        printer.clear();

    }


}
