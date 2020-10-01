/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class StartDev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Введите номер задачи 1-7: ");
        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();
        
        do {
            switch (task) {
                 case 1: 
                     Task1 task1 = new Task1();
                     task1.run(); break;
                 case 2:
                    Task2 task2 = new Task2();
                    task2.run(); break;
                 case 3: 
                     Task3 task3 = new Task3();
                     task3.run(); break;
//                 case 4: min = -5; max = 12; n = 30; mon = "April"; break;
//                 case 5: min = 0; max = 17; n = 31; mon = "May"; break;
//                 case 6: min = 5; max = 20; n = 30; mon = "June"; break;
//                 case 7: min = 10; max = 30; n = 31; mon = "July"; break;
//                 case 8: min = 10; max = 35; n = 31; mon = "August"; break;
                 
             }
        } while (true);
        
        
        
        
       
       
       
       
       
       
       Task4 task4 = new Task4();
       task4.run();
       
       Task5 task5 = new Task5();
       task5.run();
       
       Task6 task6 = new Task6();
       task6.run();
       
       Task7 task7 = new Task7();
       task7.run();
    }
    
}
