import java.util.Scanner;


public class Java7143 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Стоп симлов = любая буква");
        int x;
        int counter_1 =0;
        int counter_group =0;
        int num = sc.nextInt();
        while (true) {
            try {
                x = sc.nextInt();

            } catch (Exception e) {
                break;
            }
            if (x==1){
                counter_1++;
            }
            else{
                if (counter_1>1){
                    counter_group++;
                }
            }
            System.out.println(counter_group);
        }
    }
}