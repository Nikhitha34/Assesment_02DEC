package javaPrograms;
import java.util.Scanner;

public class Weekexecutable {

    public static void main(String[] args){
        Scanner day=new Scanner(System.in);
        System.out.println("Input a number");
        int number= day.nextInt();
        WeekbusinessLogic execute=new WeekbusinessLogic();
        execute.week(number);
    }

}
