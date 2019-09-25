package com.stackroute.PE_4;

public class Transpose {

    public void transposeWord(String input)
    {
        String newString[] = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        String ouput = "";
        for(int i=0;i<newString.length;i++)
        {
            stringBuilder.append(newString[i]);
            stringBuilder.reverse();
            ouput = ouput+stringBuilder.toString()+" ";
            stringBuilder.setLength(0);
        }
        System.out.println("Input :" + input);
        System.out.println("Output: "+ ouput);
    }
}
