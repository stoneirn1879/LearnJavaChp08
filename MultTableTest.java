import java.util.Scanner;

public class MultTableTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int f;

        for (n = -5; n <= 25; n = n + 1) {
            for (f = -5; f <= 25; f = f + 1) {
                System.out.print((n * f) + "\t");
            }
            System.out.println("");


        }
    }

}
