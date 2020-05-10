import java.util.Scanner;

public class ComparisonNext {
    Scanner sc = new Scanner(System.in);
    private int a;

    public int getInput() {
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }
        return a;
    }
}

