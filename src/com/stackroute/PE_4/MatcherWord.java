package com.stackroute.PE_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherWord {

    public void findPositionOfOccurrence(String input,String word)
    {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find())
        {
            System.out.println("Pattern found from " + matcher.start() +
                    " to " + (matcher.end()-1));
        }
    }
}
