import java.util.Scanner;

public class PowTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int factor = 0;

        for (num = 1; num <= 10; num = num + 1) {
            for (factor = 1; factor <= 8; factor = factor + 1) {
                System.out.print((num * factor) + "\t");
            }
            System.out.println("");
        }
    }
}
