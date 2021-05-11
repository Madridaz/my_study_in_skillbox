public class Arithmetic {
    private int a;
    private int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int summ() {
        return a + b;
    }

    public int minus() {
        return a - b;
    }

    public int multiplicatoin() {
        return a * b;
    }

    public int average() {
        return (a + b)/2;
    }

    public int min() {
        return Math.min(a,b);
    }

    public int max() {
        return Math.max(a,b);
    }

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(14, 2);
        System.out.println(arithmetic.summ());
        System.out.println(arithmetic.minus());
        System.out.println(arithmetic.multiplicatoin());
        System.out.println(arithmetic.average());
        System.out.println(arithmetic.min());
        System.out.println(arithmetic.max());
    }

}
