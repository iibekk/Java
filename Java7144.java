import java.util.Scanner;

public class Java7144 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Стоп симлов = любая буква");
        int x;
        int counter = 0;
        while (true) {
            try {
                x = sc.nextInt();
                if (x == 1) {
                    System.out.println(counter);
                    x = sc.nextInt();
                    if (x == 2) {
                        System.out.println(counter);
                        x = sc.nextInt();

                        if (x == 3) {
                            System.out.println(counter);
                            x = sc.nextInt();

                            if (x == 4) {
                                System.out.println(counter);
                                x = sc.nextInt();
                                if (x == 5) {
                                    System.out.println(counter);
                                    x = sc.nextInt();
                                    if (x == 6) {
                                        counter++;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                break;
            }
            System.out.println(counter);
        }
    }
}