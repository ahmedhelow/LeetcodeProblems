package LT1_Two_Sum;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void test1() {
        Solution tester = new Solution();
        assertArrayEquals(new int[]{0, 1}, tester.twoSum(new int[]{2,7,11,15}, 9));
    }

    @org.junit.jupiter.api.Test
    void test2() {
        Solution tester = new Solution();
        assertArrayEquals(new int[]{1, 2}, tester.twoSum(new int[]{3,2,4}, 6));
    }

    @org.junit.jupiter.api.Test
    void test3() {
        Solution tester = new Solution();
        assertArrayEquals(new int[]{0, 1}, tester.twoSum(new int[]{3, 3}, 6));
    }
}