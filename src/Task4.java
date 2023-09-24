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
