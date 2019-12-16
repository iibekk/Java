import java.util.ArrayList;
import java.util.Scanner;


public class Java7141 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        System.out.println("Стоп симлов = любая буква");
        int x;
        boolean b = true;
        while (true) {
            try {
                x = sc.nextInt();
                A.add(x);
            } catch (Exception e) {
                break;
            }
            for (int i = 0; i < A.size(); i++) {
                for (int i1 = 0; i1 < A.size(); i1++) {
                    for (int i2 = 0; i2 < A.size(); i2++) {
                        if (A.get(i) * A.get(i1) == A.get(i2)) {
                            System.out.println(A.get(i) + " " + A.get(i1) + " " + A.get(i2));
                            b = false;
                        }

                    }
                }
            }
            if (b) {
                System.out.println("No");
            }
        }
    }
}