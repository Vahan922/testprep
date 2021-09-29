package conditional;

public class ConditionalMain {
    public static void main(String[] args) {

        ConditionalEcercises exercisses = new ConditionalEcercises();
        int operant1 = (int) (Math.random() * 10);
        int operant2 = (int) (Math.random() * 10);
        String operatoe = args[0];
        double result = exercisses.calculator(operant1, operant2, operatoe);
        System.out.println(result);


        int number = (int) (Math.random() * 100);
        exercisses.prontNumber(number);
    }
}
