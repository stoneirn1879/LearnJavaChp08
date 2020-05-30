import java.util.Scanner;
public class Fib {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int f;
        int e;

        for (f = 0, e = 1; f < 60000000; f = f + e, e = e + f)
            System.out.println(f + " + " + e + " = " + (e + f));


    }

}
