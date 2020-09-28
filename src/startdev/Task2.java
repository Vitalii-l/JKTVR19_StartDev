/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task2 {
    public void run(){
        System.out.println("----- Задача 2 ------");
        System.out.println("Загадано число от 5 до 10: ");
        System.out.println("Отгадай: ");
        
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        Random random = new Random();
        int pcNum = random.nextInt(6)+5;
        
        if (userNum == pcNum){
            System.out.println("Ты выиграл");
        } else {
            System.out.println("Ты ты проиграл");
            System.out.print("Число компьютера: ");
            System.out.println(pcNum);
        }
                
        System.out.println("----- конец задачи 2 ------");
    }
   
}
