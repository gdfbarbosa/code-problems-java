package io.gdfbarbosa.algorithms.arrays;

/**
 * <a href="https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/">1491. Average Salary Excluding the Minimum and Maximum Salary</a>
 */
public class AverageSalaryExcludeMinMax {
    public double average(int[] salary) {
        if (salary.length <= 2) {
            return 0;
        }
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        long sum = 0;
        for (int sal : salary) {
            max = Math.max(max, sal);
            min = Math.min(min, sal);
            sum += sal;
        }
        double length = (salary.length - 2);
        return (sum-max-min) / length;

    }
}
