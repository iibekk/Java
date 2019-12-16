import java.util.Scanner;

public class Java7133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Стоп символ = S");
        int max = sc.nextInt();
        System.out.println("1");
        boolean b = true;
        int num;
        int counter = 1;
        while (true) {
            try {

                num = sc.nextInt();
                if (num == max) {
                    counter++;
                }
                if (num > max) {
                    counter = 1;
                    max = num;

                }


            } catch (Exception e) {
                break;
            }
            System.out.println(counter);

        }
        System.out.println(counter);
    }
}