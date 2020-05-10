public class ComparisonOfTwoNumbers {

    public static void main(String[] args) {
        ComparisonNext roll = new ComparisonNext();
        System.out.println("Введите первое целое число: ");
        int imA = roll.getInput();
        System.out.println("Введите второе целое число: ");
        int imB = roll.getInput();
	if(imA>imB){
        System.out.println(imA + ">"+ imB);
    }else if(imA<imB){
        System.out.println(imA + "<"+imB);
    }else{
        System.out.println(imA + "="+imB);
    }

    }
}
