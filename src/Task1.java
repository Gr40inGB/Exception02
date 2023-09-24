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