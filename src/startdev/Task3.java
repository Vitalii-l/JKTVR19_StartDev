/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;
import java.util.Random;

/**
 *
 * @author user
 */
public class Task3 {
    public void run(){
        System.out.println("----- Задача 3 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int myArr[] = new int[10];
        Random random = new Random();
        int sumAll = 0;
        int maxItem = 0;
        int minItem = 100;
        for(int i = 0; i < myArr.length; i++){
            int randItem = random.nextInt(101);
            myArr[i] = randItem;
            sumAll = sumAll+myArr[i];
            System.out.print(i+1);
            System.out.println(") i = " + myArr[i]);
            
            if (myArr[i] < minItem) minItem = myArr[i];
            if (myArr[i] > maxItem) maxItem = myArr[i];            
        }
        
        System.out.println("Сумма всех чисел массива: " + sumAll);
        System.out.println("min = " + minItem);
        System.out.println("max = " + maxItem);
        System.out.println("----- конец задачи 3 ------");
    }
}
