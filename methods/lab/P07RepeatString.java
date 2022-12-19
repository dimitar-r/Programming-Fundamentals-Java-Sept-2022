package methods.lab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(n, input));
    }
    public static String repeatString(int n, String text){
        String result = "";
        for (int i = 1; i <= n; i++) {
            result += text;
        }
        return result;
    }
}
