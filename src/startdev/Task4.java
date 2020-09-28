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
public class Task4 {
    public void run(){
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим \nего значения в цикле");
        int myArr[] = new int[10];
        Random random = new Random();
        int randItem;
        for(int i = 0; i < myArr.length; i++){
            do {
                randItem = random.nextInt(101);
            } while (randItem %2 != 0);
            myArr[i] = randItem;
            System.out.print(i+1);
            System.out.println(") i = " + myArr[i]);            
        }
        
        System.out.println("----- конец задачи 4 ------");
    }
}
