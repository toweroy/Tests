package hackerrank;

import java.util.Scanner;

/**
 * Created by richardtolman on 10/1/16.
 */
public class JavaLoops2 {

    public static void main(String[] arg) {
        Scanner in = new Scanner(arg[0]);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int pow = 1;
            int[] s = new int[n];
            int cb = 0;

            for (int j = 0; j < n; j++) {
                cb = cb + b * pow;
                s[j] = a + cb;
                pow = pow * 2;
            }

            for (int k = 0; k < n; k++) {
                System.out.print(s[k] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
