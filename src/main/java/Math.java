public class Math {
    public double myPow(double x, int n) {
        double res = x;
        while (n-- > 1) {
            res *= x;
        }
        return res;
    }

    public static void main(String[] args) {
        Math math = new Math();
        System.out.println(math.myPow(2.1, 3));
    }
}
