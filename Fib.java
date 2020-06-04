import java.util.Scanner;
public class Fib {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int f = 0;
        int e = 1;
        int fib = 0;


        for (int i = 0; i <20; i++) {

            fib = f + e;
            System.out.println(f + "+" + e + "=" + fib);
            f = e;
            e = fib;
        }


    }

}
