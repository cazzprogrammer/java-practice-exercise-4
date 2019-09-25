package com.stackroute.PE_4;

public class Replace {

    public void replaceLetter(String input)
    {
        String newString = input.replaceAll("d","f");
        newString = newString.replaceAll("l","t");
        System.out.println("Original String "+ input);
        System.out.println("New String after replacing "+ newString);
    }
}
