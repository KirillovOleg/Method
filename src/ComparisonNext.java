import java.util.Scanner;

public class ComparisonNext {

    public int getInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Не корректный ввод. повторите ввод.");
            return getInput();
        }

    }

    public void ifComp(int imA, int imB) {

        if (imA > imB) {
            System.out.println(imA + " > " + imB);
        } else if (imA < imB) {
            System.out.println(imA + " < " + imB);
        } else {
            System.out.println(imA + " = " + imB);
        }
    }
}

