import java.util.Scanner;


public class Java7142 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Стоп симлов = любая буква");
        int max_counter1 = 1;
        int max_counter2 = 1;
        int counter1 = 1;
        int counter2 = 1;
        int x;
        int num = sc.nextInt();
        while (true) {

            try {
                x = sc.nextInt();

            } catch (Exception e) {
                break;
            }
            if (x > num) {
                counter1++;
                if (counter2 > max_counter2) {
                    max_counter2 = counter2;
                }
                counter2 = 1;
                num = x;
            } else {
                if (x < num) {
                    counter2++;
                }
                if (counter1 > max_counter1) {
                    max_counter1 = counter1;
                }
                counter1 = 1;
                num = x;
            }
            if (counter1 > max_counter1) {
                max_counter1 = counter1;
            }
            if (counter2 > max_counter2) {
                max_counter2 = counter2;
            }
            if (counter1 > max_counter1) {
                max_counter1 = counter1;
            }
            if (max_counter1>max_counter2) {
                System.out.println(max_counter1);
            }
            else{
                System.out.println(max_counter2);
            }
        }
    }
}