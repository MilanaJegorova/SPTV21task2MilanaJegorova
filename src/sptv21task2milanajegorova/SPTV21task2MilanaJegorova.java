package sptv21task2milanajegorova;

import java.util.Scanner;


public class SPTV21task2MilanaJegorova {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> Введите число: ");
        int number = scanner.nextInt();
        int sum = Integer.parseInt(Integer.toString(number).substring(0,1))
                +Integer.parseInt(Integer.toString(number).substring(1,2))
                +Integer.parseInt(Integer.toString(number).substring(2,3));
        System.out.println("\nСумма всех чисел: " + sum);
        System.out.println("Число сотен: " + Integer.toString(number).substring(0,1));
        System.out.println("Число десятков: " + Integer.toString(number).substring(1,2));
        System.out.println("Число единиц: " + Integer.toString(number).substring(2,3));
        
    }
    
}
