package conditional;

public class ConditionalEcercises {   //skop


    public boolean isOdd(int number) {
        return number % 2 == 0;
    }

    public double calculator(double operant1, double operant2, String operatoe) {
        switch (operatoe) {
            case "add":
                return operant1 + operant2;
            case "subravt":
                return operant1 - operant2;
            case "multiplay":
                return operant1 * operant2;
            case "divide":
                return operant2 == 0 ? -1 : operant1 / operant2;
        }
        return -1;
    }

    public void prontNumber(int number) {
        System.out.println(number);

        if (number >= 0 && number < 10) {
            System.out.println("digith");


        } else if (number >= 10 && number < 100) {
            if (number % 2 == 0) {
                System.out.println("two-digit odd number");
            } else {
                System.out.println("two-digit even number");
            }
            System.out.println("Out of bounds");
        }
    }


}
