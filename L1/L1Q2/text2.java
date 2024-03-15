/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L1Q2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class text2 {
    
    public static void main (String[] args) {
        
        ArrayList <String> list = new ArrayList<>();
        ArrayList <String> newlist = new ArrayList<>();
        
        File file = new File ("C:/Users/saada/OneDrive/Desktop/Java/Data Structure/L1/text2.txt");
        int count = 0;
        
        try {
            
            Scanner s = new Scanner(file);
            String line;
            
            while (s.hasNext()) {
                
                line = s.next();
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        for (String word : list) {
            String newWord = "";
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) <= '9' && word.charAt(i) >= '0') {
                    count++;
                    newWord += word.charAt(i);
                }
                
                if (word.charAt(i) == ',' || word.charAt(i) == ' ')
                    i++;
                
            }
            newlist.add(newWord);
        }
        
        System.out.println("Number of characters: " + count);
        for (String word : newlist) {
            System.out.println(word);
        }
    }
}
