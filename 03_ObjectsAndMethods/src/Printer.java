public class Printer {
    private static String queue = "";
    private String text;
    private String name;
    private int pages;
    private static int pagesCount;
    private static int documentsCount = 0;

    public void append(String text) {
        this.queue = queue + "Содержание документа: " + text + "\n";
        documentsCount++;
    }

    public void append(String text, String name) {
        this.queue = queue + "Содержание документа: " + text + ", " + "название документа: " + name + "\n";
        documentsCount++;
    }

    public void append(String text, String name, int pages) {
        this.queue = queue + "Содержание документа: " + text + ", " + "название документа: " + name + ", " +
                "количество страниц: " + pages + "\n";
        this.pagesCount = pagesCount + pages;
        documentsCount++;
    }

    public static int getPagesCount() {
        return pagesCount;
    }

    public static int getDocumentsCount() {
        return documentsCount;
    }

    public static String printInfo() {
        return "Всего документов распечатано - " + getDocumentsCount() + "\n" +
                "Всего страниц распечатано - " + getPagesCount();
    }

    public void print() {
        System.out.println(queue);
        queue = "";
    }

    public void clear() {
        System.out.println("Очередь печати очищена" + "\n");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("докладная");
        printer.append("расписка", "лист1");
        printer.append("заявление", "лист2", 2);
        printer.append("жалоба", "лист3", 1);
        printer.append("объявление", "лист4", 1);
        printer.append("призыв", "лист5", 6);
        System.out.println("Количество страниц на печать: " + getPagesCount());
        System.out.println("Количество документов на печать: " + getDocumentsCount());
        printer.print();
        printer.clear();
        System.out.println(printInfo());

    }
}
