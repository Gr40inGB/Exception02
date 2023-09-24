public class Task3 {
//    Задание 3

    public static void main(String[] args) throws Exception {
        int a = 90;
        int b = 3;
        if (b != 0) System.out.println(a / b);
        printSum(23, 234);
        int[] abc = {1, 2};
        int wrongIndex = 3;
        if (wrongIndex > 0 && wrongIndex < abc.length) abc[3] = 9;
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
