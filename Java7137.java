import java.util.Scanner;

import java.util.Scanner;

public class Java7137 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = 1;
        int max;
        int num2 = 1;
        int x;
        System.out.println("Стоп симлов = любая буква");
        max = sc.nextInt();
        int i = 1;
        System.out.println(num1 + " " + num2);
        while (true) {
            i++;
            try {
                x = sc.nextInt();

            } catch (Exception e) {
                break;
            }
            if (x > max) {
                max = x;
                num1 = i;
                num2 = i;
            }
            if (max == x) {
                num2 = i;
            }
            System.out.println(num1 + " " + num2);
        }

        System.out.println(num1 + " " + num2);
    }
}