### TASK 1

```java
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getFloatWithException("Please input float (12.124) number: "));
        System.out.println(getFloatWithIf("Please input float (413.024) number: "));
    }

    public static float getFloatWithException(String welcome) {
        boolean inputError = true;
        float result = 0;
        while (inputError) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print(welcome);
                result = Float.parseFloat(scanner.next());
                inputError = false;
            } catch (Exception e) {
                System.out.println("Cannot convert to float. Try again. ");
            }
        }
        return result;
    }

    public static float getFloatWithIf(String welcome) {
        Scanner scanner = new Scanner(System.in);
        boolean inputError = true;
        float result = 0;
        while (inputError) {
            System.out.print(welcome);
            String temp = scanner.next();
            if (temp.matches("[\\d]*[.?]?[\\d]*")) {
                inputError = false;
                result = Float.parseFloat(temp);
            }
        }
        return result;
    }
}
```

### TASK 2

```java
public class Task2 {
    public static void main(String[] args) {
//        Задание 2
        int[] intArray = new int[]{13, 43, 2134, 1, 341, 41543}; // size = 6;
        int index = 8;
        int d = 0;
        if (d != 0) {
            if (index > 0 && index < intArray.length) {
                double catchedRes1 = intArray[index] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }
        }
    }
}

```
### TASK 3

```java
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

```
### TASK 4

```java
import java.util.Scanner;

public class Task4 {
    //    Разработайте программу, которая выбросит Exception,
    //    когда пользователь вводит пустую строку.
    //    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void main(String[] args) throws Exception {
        System.out.println(userInput("Please input string: "));
    }

    public static String userInput(String welcome) throws Exception {
        System.out.print(welcome);
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        if (data.isEmpty()) throw new Exception("Empty string is not allow!");
        return data;
    }
}

```