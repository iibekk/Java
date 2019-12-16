

import java.util.Scanner;

public class Java7136 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x;
        int counter1 = 1;
        int max_counter = 1;
        System.out.println("Стоп симлов = любая буква");
        int x1 = sc.nextInt();
        while (true) {
            try {
                x = sc.nextInt();

            } catch (Exception e) {
                break;
            }
            if (x == x1) {
                counter1++;
            } else {
                if (counter1 > max_counter) {
                    max_counter = counter1;
                }
                counter1 = 1;
            }
            if (counter1 > max_counter) {
                max_counter = counter1;
            }
            x1 = x;
            System.out.println(max_counter);
        }
        System.out.println(max_counter);
    }
}