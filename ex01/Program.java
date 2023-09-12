package ex01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean isComposite = false;
        int iteration_count = 0;
        for (int i = 2; i < number; i++){
            iteration_count++;
            if (number % i == 0){
                isComposite = true;
                break;
            }
        }
        if (isComposite){
            System.out.println("false "+ iteration_count);
        } else{
            System.out.println("true "+ iteration_count);
        }
    }
}
