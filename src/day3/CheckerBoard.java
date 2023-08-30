package day3;

public class CheckerBoard {
    public static void main(String[] args) {
        int n = 7;
        for (int row = 1; row <= 7; ++row) {
            for (int col = 1; col <= 7; col++) {
                if (row % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }

    }
}

