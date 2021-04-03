import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        int n=0;
        // Get n from the user.

        //System.out.print("Give a number and I will calculate its harmonic series for you!");
        try {
            while (n<=0) {
                System.out.println("Give a natural number and I will calculate its harmonic series for you!");
                n = console.nextInt();
            }
            int i = 1;
            double j;
            double harmsum = 0;
            do {
                j = (double) 1 / i;
                //System.out.println("j="+j);
                harmsum = harmsum + j;
                //System.out.println("hamsum:" + harmsum);
                i++;
                //System.out.println("i="+i);
            } while (i <= n);

            System.out.println("When n = " + n + ", the harmonic series sum = " + harmsum);
        } catch (Exception e) {
        System.out.println("Try giving a non zero, natural number");
        }
    }
}
