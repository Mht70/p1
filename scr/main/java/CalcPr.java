public class CalcPr {
    int arg1, arg2;

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
    }

    /**
     * Метод будет складывать два аргумента и возвращать результат этой операции
     *
     * @param arg1 первый аргумент
     * @param arg2 второй аргумент
     * @return результат сложения двух чисел
     */
    public static long summa(int arg1, int arg2) {
         /* В этой переменной будет храниться результат сложения двух чисел
         Результат вычисления должен быть совместим по типу с аргументами,
         над которыми осуществляется операция сложения
         Еще одна строка */
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

