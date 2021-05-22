public class Main {
    public static void main(String[] args) {

        System.out.println("Площадь круга равна: " + GeometryCalculator.getCircleSquare(20));
        System.out.println("Объем шара равен: " + GeometryCalculator.getSphereVolume(20));
        System.out.println("Возможен ли такой треугольник: " + GeometryCalculator.isTrianglePossible(3, 4, 5));
        System.out.println("Площадь треугольника: " + GeometryCalculator.getTriangleSquare(3, 4, 5));


    }
}
