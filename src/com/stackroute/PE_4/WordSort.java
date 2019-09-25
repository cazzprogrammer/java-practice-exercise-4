package com.stackroute.PE_4;

import java.util.Arrays;

public class WordSort {

    public void sortWordsOfParagraph(String input)
    {
        String newString[] = input.split("[\\s,.;:!{}\\[\\]]+");
        Arrays.sort(newString);

        System.out.println("Original String : "+input);
        System.out.println("Sorted : "+ Arrays.toString(newString));
    }
}
