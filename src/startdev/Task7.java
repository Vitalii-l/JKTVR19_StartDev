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
public class Task7 {
    public void run(){
        System.out.println("----- Задача 7 ------");
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        // посчитайте сколько раз в строке встречается введенная вами буква
        System.out.println("Введите букву: ");
        String letter = scanner.nextLine();
        String letterL = letter.toLowerCase();
        char letterChar = letter.charAt(0);
        
        String strL = str.toLowerCase();
        char[] strArr = strL.toCharArray();
        
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] == letterChar) {
                count++;
                    }
        }
        
      //System.out.println("Text: "+str);
        System.out.println("Буква \""+letter+"\" встречается в тексте "+ count + " раз");
        System.out.println("");
        System.out.println("----- конец задачи 6 ------");
    }
}
