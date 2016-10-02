import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void sumTwo() {
        int[] result = twoSum(new int[]{0, 3, 2, 0}, 0);
        System.out.println(result);
    }

    @Test
    public void addTwoNumbers() {
        LinkedList num1 = new LinkedList();
        num1.insert(3);
        num1.insert(4);
        num1.insert(2);
        num1.printList();
        LinkedList num2 = new LinkedList();
        num2.insert(4);
        num2.insert(6);
        num2.insert(5);
        num2.printList();
        LinkedList result = addTwoLists(num1, num2);
        result.printList();
    }

    @Test
    public void reverseInteger() {
        assertEquals(321, reverse(123));
        assertEquals(109, reverse(901000));
        assertEquals(0, reverse(1534236469));
    }

    public int reverse(int num) {
        int x = num;
        int reverse = 0;

        while (x != 0) {
            int div = x / 10;
            int mod = x % 10;
            reverse = reverse * 10 + mod;
            x = div;
        }

        System.out.println(reverse);
        return x;
    }

    public LinkedList addTwoLists(LinkedList num1, LinkedList num2) {
        if (num1.getSize() > num2.getSize()) {
            int addPadding = num1.getSize() - num2.getSize();
            for (int i = 0; i < addPadding; i++) {
                num2.insert(0);
            }
        } else if (num1.getSize() < num2.getSize()) {
            int addPadding = num2.getSize() - num1.getSize();
            for (int i = 0; i < addPadding; i++) {
                num1.insert(0);
            }
        }

        LinkedList result = new LinkedList();
        int decimal = 0;

        while (num1.getSize() > 0) {
            LinkedList.Node node1 = num1.delete();
            LinkedList.Node node2 = num2.delete();

            int sum = node1.getValue() + node2.getValue() + decimal;

            if (sum > 9) {
                int first = sum / 10;
                int second = sum % 10;
                result.insert(second);
                decimal = first;
            } else {
                result.insert(sum);
                decimal = 0;
            }
        }

        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        int offset = 0;
        for (int j = 0 + offset; j < nums.length; j++) {
            for (int i = 1 + offset; i < nums.length; i++) {
                int sum = nums[j] + nums[i];
                if (sum == target) {
                    return new int[]{j, i};
                }
            }
            offset++;
        }

        return null;
    }
}
