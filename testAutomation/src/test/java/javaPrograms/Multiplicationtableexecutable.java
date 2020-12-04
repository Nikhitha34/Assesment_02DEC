package javaPrograms;
import java.util.Scanner;

public class Multiplicationtableexecutable {

    public static void main(String[] args){
        System.out.println("Enter a multiplicand");
        Scanner number=new Scanner(System.in);
        int multiplicand= number.nextInt();

        System.out.println("Enter a multiplier");
        int multiplier= number.nextInt();
        Multiplicationtablebusinesslogic execute=new Multiplicationtablebusinesslogic();
        execute.multiplication(multiplicand,multiplier);

    }

}

