package com.stackroute.PE_4;

public class Occurrence {

    public void countoccurrence(String input, String letter)
    {
        String newString = input.toLowerCase().replaceAll(letter,"");
        System.out.println("The Occurrence of: " + letter+" is"+ (input.length()-newString.length()));
    }

}
