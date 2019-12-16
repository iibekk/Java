import java.util.Scanner;
import java.util.ArrayList;

public class Java {
    public static void main(String[] args) {
        System.out.println("Стоп символ = любой символ");
        Scanner sc = new Scanner(System.in);
        int num;
        int counter = 0;
        boolean b = true;
        ArrayList<Integer> A = new ArrayList<>();
        while (true) {

            try {
                num = sc.nextInt();
            } catch (Exception e) {
                break;
            }
            if (b) {
                counter++;
                A.add(num * num);
                b = false;

            } else {

                for (int i = 0; i < A.size(); i++) {
                    if (num * num == A.get(i)) {
                        break;
                    }
                    if (i == A.size() - 1) {
                        counter++;
                    }
                }
                A.add(num * num);
            }
            System.out.println(counter);
        }

        System.out.println(counter);
    }
}