package com.stackroute.PE_4;

public class FIndWord {

    public void findWord(String input)
    {
        System.out.println("Input: "+input);
        System.out.println(" Is Harry here? "+ input.matches("(?i).*harry*."));
    }
}
