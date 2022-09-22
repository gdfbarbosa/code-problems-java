package io.gdfbarbosa.algorithms.math;

import lombok.extern.slf4j.Slf4j;

/**
 * Solution uses bit manipulation flipping bits using XOR operator.
 * <a href="https://leetcode.com/problems/number-complement/">476. Number Complement</a>
 */
@Slf4j
public class NumberComplement {
    public final static Integer PADDING_SIZE = 10;

    public int findComplement(int num) {
        log.info("num = {}", num);
        int todo = num, bit = 1;
        while (todo != 0) {
            log.info("num  = {}", formatNumber(num));
            log.info("bit  = {}", formatNumber(bit));
            log.info("todo = {}", formatNumber(todo));
            num = num ^ bit;
            bit = bit << 1;
            todo = todo >> 1;
        }
        log.info("num  = {}", formatNumber(num));
        log.info("bit  = {}", formatNumber(bit));
        log.info("todo = {}", formatNumber(todo));
        return num;
    }

    private static String formatNumber(int num) {
        return String.format("%" + PADDING_SIZE + "s", Integer.toBinaryString(num)).replace(' ', '0');
    }
}
