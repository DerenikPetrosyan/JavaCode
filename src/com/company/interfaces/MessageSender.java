package com.company.interfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MessageSender {
   private MessageSender(){

   }
   static {
      new MessageSender();
   }
    static {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }
        try {
            int a=10/0;
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }


}
