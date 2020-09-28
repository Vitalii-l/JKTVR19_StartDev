/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author user
 */
public class Task6 {
    public void run(){
        System.out.println("----- Задача 6 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        Random rndItem = new Random();
        int jArr[][] = new int[10][];
        int jArrFirst = 5;
        int jArrLast = 9;
        int jArrFirstCycle = 5;
                
        for(int i = 0; i < jArr.length; i++){
            jArr[i] = new int[jArrFirst];
            for(int j = 0; j < jArrFirstCycle; j++ ){
                jArr[i][j] = rndItem.nextInt(101);
            }
            jArrFirst++;
            jArrFirstCycle++;
            System.out.print(i+1 + ") ");
            System.out.println(Arrays.toString(jArr[i]));
        }
        System.out.println("----- конец задачи 6 ------");
    }
}
