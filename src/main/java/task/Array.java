package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {

    public static void getNumbersMultipleThree (){
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int number;
        do {
            System.out.println("Введите число. Для окончания ввода введите 0");
            while (!scanner.hasNextInt()){
                System.out.println("Некорректные данные. Введите число. Для окончания ввода введите 0");
                scanner.next();
            }
            number = scanner.nextInt();
            list.add(number);
        }
        while (number != 0);

        System.out.println("Первоначальный числовой массив " + list);
        System.out.print("Числа, кратные 3 : ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0){
                System.out.print(list.get(i) + " ");
            }
        }
    }

    public static void main(String[] args) {
        getNumbersMultipleThree();
    }
}
