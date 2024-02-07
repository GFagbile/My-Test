package training2;

public class Calculationn {
    public static void main(String[] args) {

        int firstNumber = 200;
        int secondNumber = 100;

        String operator = "-";

        if (operator.equals("+")){
            System.out.println(firstNumber + secondNumber);
        }
        else if (operator.equals("*")) {
            System.out.println(firstNumber * secondNumber);

        }
        else if (operator.equals("/")) {
            System.out.println(firstNumber / secondNumber);

        } else if (operator.equals("-")) {
            System.out.println(firstNumber - secondNumber);

        }
        else{
            System.out.println("ENTER VALID DATA");
        }

    }
}
