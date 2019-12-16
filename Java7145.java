import java.util.Scanner;

public class Java7145 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Стоп симлов = любая буква");
        Boolean M = false;
        int x;
        int counter = 0;
        while (true) {
            try {
                x = sc.nextInt();
                if (M){                 //если уже присутствует 121212
                    while (M){
                        if (x == 1){
                            System.out.println(counter);
                            x = sc.nextInt();
                            if (x ==2){
                                counter++;
                                System.out.println(counter);
                                x = sc.nextInt();
                            }
                            else{
                                M = false;
                                break;
                            }
                        }
                        else {
                            M =false;
                            break;
                        }
                    }
                }
                if (x == 1) {
                    System.out.println(counter);
                    x = sc.nextInt();
                    if (x == 2) {
                        System.out.println(counter);
                        x = sc.nextInt();

                        if (x == 1) {
                            System.out.println(counter);
                            x = sc.nextInt();

                            if (x == 2) {
                                System.out.println(counter);
                                x = sc.nextInt();
                                if (x == 1) {
                                    System.out.println(counter);
                                    x = sc.nextInt();
                                    if (x == 2) {
                                        counter++;
                                        M =true;
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