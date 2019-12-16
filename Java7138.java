import java.util.Scanner;


public class Java7138 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Стоп симлов = любая буква");
        boolean b = false;
        int i = 0;
        int num = 0;
        int x;
        while (true) {
            i++;
            try {
                x = sc.nextInt();

            } catch (Exception e) {
                break;
            }
            if ((x == 0) && (!b)) {
                num = i;
                b = true;
                System.out.println(num);
            }


        }
        if (b) {
            System.out.println(num);
        } else {
            System.out.println("0");
        }
    }
}