import java.util.Scanner;


public class Java7140 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Стоп симлов = любая буква");
        int max1 = sc.nextInt();
        int max2 = sc.nextInt();
        int x;
        if (max2 > max1) {
            x = max1;
            max1 = max2;
            max2 =x;
            if (max2!=max1) {
                System.out.println(max2);
            }
            else{
                System.out.println("no");
            }
        }
        while (true) {

            try {
                x = sc.nextInt();

            } catch (Exception e) {
                break;
            }
            if ((x>max2)&&(x<max1)){
                max2 = x;
            }
            if (x>max1){
                max2 =max1;
                max1 =x;

            }
            if (max2!=max1) {
                System.out.println(max2);
            }
            else{
                System.out.println("no");
            }
        }
        System.out.println(max2);
    }
}