public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        double square = Math.PI * Math.pow(radius, 2);
        return Math.abs(square);
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        double volume = (double) 4 / 3 * Math.PI * Math.pow(radius, 3);
        return Math.abs(volume);
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (!isTrianglePossible(a, b, c)) {
            return -1;
        }
        double p = (a + b + c) / 2;
        double triangleSquare = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return triangleSquare;
    }
}

