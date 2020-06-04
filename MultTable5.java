import java.util.Scanner;

public class MultTable5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int f;

        for (n = -5; n <= 5; n = n + 1) {
            for (f = -5; f <= 5; f = f + 1) {

                if (((n * f) % 5) == 0) {
                    System.out.print((n * f) + "\n");
                }
                System.out.println("");


            }
        }
    }
}
