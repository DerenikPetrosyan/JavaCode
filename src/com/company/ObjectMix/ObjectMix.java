package com.company.ObjectMix;
import com.company.interfaces.MessageSender;

class Converter {

    public static void main(String[] args) {
        adultPerson(5);
        trowException();

    }
    public static void trowException() throws RuntimeException{
        int a=10/0;
    }
    public static void adultPerson(int age){
        if(age<18)
            throw new RuntimeException("The person is not an adult");
        else
            System.out.println("The person is an adult");
    }



}





