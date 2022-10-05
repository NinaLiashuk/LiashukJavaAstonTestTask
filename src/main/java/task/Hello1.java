package task;

import java.util.Scanner;

public class Hello1 {
    
    public static void sayHello(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        if (scanner.hasNextLong() && scanner.nextLong() > 7){
            System.out.println("Привет");
        }
    }

    public static void main(String[] args) {
        sayHello();
    }
}
