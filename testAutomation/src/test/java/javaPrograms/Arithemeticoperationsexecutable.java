package javaPrograms;

public class Arithemeticoperationsexecutable {
        public static void main(String[] args) {
        String action = "Multiplication"; // Subtraction, Multiplication/Division
        Arithemeticbusinesslogic operations = new Arithemeticbusinesslogic(action);
        double operand1 = 60.00;
        double operand2 = 100.00;
        double result = operations.execute(operand1, operand2);
        System.out.println("The result is "+ result);
        //20.00
    }
}
