public class CalcPr {
    private static long arg1;
    private static long arg2;

    public static void main(String[] args) {
        System.out.println("Калькулятор");

        long summa = summa(10, 6);
        System.out.println(summa);
        long otherSumma = summa(9, 98);
        System.out.println(otherSumma);
        long yetAnotherSumma = summa(10, 100);
        System.out.println(yetAnotherSumma);

        long resultOfMinus = minus(50, 299);
        System.out.println(resultOfMinus);

        long result = multiplyAndSumma(1);
        System.out.println(result);

        long resultOfMultiply = multiply(5, 100);
        System.out.println(resultOfMultiply);

        long resultOfDivide = divide(21, 7);
        System.out.println(resultOfDivide);

        long resultOfSpeed = speed(10, 1);
        System.out.println(resultOfSpeed+" км/ч");

    }
    /* пояснения
    * @param resultOfSpeed произведение километров и часов
     */
    private static long speed(int arg1, int arg2) {
        return arg1 * arg2;
    }

    private static long divide(int arg1, int arg2) {
        long divide = arg1 / arg2;
        return divide;
    }

    private static long multiply(int arg1, int arg2) {
        long multiply = arg1 * arg2;
        return multiply;
    }

    public static long summa(int arg1, int arg2) {
        long result = arg1 + arg2;
        return result;
    }

    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static long multiplyAndSumma(int arg1) {
        long result = (3 * arg1) + 15;
        result = result - 18;
        return result;
    }
}