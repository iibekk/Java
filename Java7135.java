import java.util.Scanner;

public class Java7135 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double x;
        int n = 0;
        double Summ = 0;
        System.out.println("Стоп симлов = любая буква");
        while (true){
            try{
                x = sc.nextDouble();

            }
            catch(Exception  e){
                break;
            }
            n++;
            Summ+=x;
            System.out.println(Summ/n);
        }
        System.out.println(Summ/n);
    }
}