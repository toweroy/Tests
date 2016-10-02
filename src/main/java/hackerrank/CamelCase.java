package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/camelcase
 */
public class CamelCase {

    public static void main(String[] arg) {
        Scanner in = new Scanner(arg[0]);
        String input = in.next();
        char[] chars = input.toCharArray();
        int current = 1;

        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                current++;
            }
        }

        System.out.println(current);

        in.close();
    }
}
