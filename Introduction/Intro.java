package org.senergy_edu.introduction;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Intro {
    public static List<String> task01(){
        short sh = 0b11001101;

        String a = Integer.toBinaryString(134);

        String b = String.valueOf(Integer.parseInt("11001101",2));
        String b2 = Integer.toString(sh,10);

        String c = String.valueOf((float)3840*2160*10/8/1024/1024);

        System.out.println(a);
        System.out.println(b);
        System.out.println(b2);
        System.out.println(c);

        List<String> result = Arrays.asList(a,b,c);

        return result;

    }

    public static void task04(){
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100,999);  // Генерация чисел от 100 до 999
        }

        System.out.println("Элементы массива:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("\nСумма элементов массива: " + sum);
    }


    public static void main(String[] args){
        task01();

    }
}
