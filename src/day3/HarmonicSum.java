package day3;

public class HarmonicSum {
    public static void main(String[] args) {
        HarmonicSum.leftToRight();
        HarmonicSum.rightToLeft();
    }
        public static void leftToRight() {
            int N = 50000;
            double sum = 0.0;

            for(int i = 1; i < N; i++) {

               sum += (double)(1)/i;
                }
            System.out.println("Left To Right " +sum);
            }

    public static void rightToLeft() {
        int N = 50000;
        double sum = 0.0;

        for(int i = N; i >=1; i--) {

            sum += (double)(1)/i;
        }
        System.out.println("Right To Left " + sum);
    }
}
