package com.file.test;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FindLongestWord {
    public static void main(String[] args) throws FileNotFoundException {
   	 
   	 System.out.println("longest word : " +findLongestWords());
   	 
    }

    public static String findLongestWords() throws FileNotFoundException {

      String longest_word = "";
      String current;
      Scanner sc = new Scanner(new File("C:\\Users\\Raja\\Desktop\\LCC.txt"));

      while (sc.hasNext()) {
         current = sc.next();
         
          if (current.length() > longest_word.length()) {
            longest_word = current;
          }
      }   
      sc.close();
      return longest_word;
   }
}
