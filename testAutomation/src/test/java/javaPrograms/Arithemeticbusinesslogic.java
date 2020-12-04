package javaPrograms;

public class Arithemeticbusinesslogic {
    String action;
    double result;

    public Arithemeticbusinesslogic(String operationName){
        action=operationName;
    }
    public double execute(double operand1,double operand2) {
        if (action.equals("Addition")) {

            result = operand1 + operand2;
            return result;
        } else if (action.equals("Subtraction")) {
            result = operand1 - operand2;
            return result;
        } else if (action.equals("Division")) {
            result = operand1 / operand2;
            return result;
        } else {
            result = operand1 * operand2;
            return result;
        }

    }
}
