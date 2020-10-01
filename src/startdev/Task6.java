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
        Random randItem = new Random();
        Random zub = new Random();
        int jArr[][] = new int[10][];
                
        for(int i = 0; i < jArr.length; i++){
            int zub2 = zub.nextInt(5)+5;        // генерируем длину элемента массива, чтобы получить зубчатый массив
            jArr[i] = new int[zub2];
                        
            for(int j = 0; j < zub2; j++ ){     // Заполняем строку массива случайными числами
                jArr[i][j] = randItem.nextInt(101);
            }
            
            
            
            System.out.print(i+1 + ") ");
            System.out.println(Arrays.toString(jArr[i]));
        }
        System.out.println("----- конец задачи 6 ------");
    }
}
