import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            ArrayList<Integer> res = new ArrayList<>();
            int power = 1;

            while (n > 0) {
                int digit = n % 10;

                if (digit != 0) {
                    res.add(digit * power);
                }

                n /= 10;
                power *= 10;
            }

            System.out.println(res.size());

            for (int x : res) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
