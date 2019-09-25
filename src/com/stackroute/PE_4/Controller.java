package com.stackroute.PE_4;

public class Controller {

    public static void main(String args[])
    {
        //Occurrence occurrence = new Occurrence();
        //occurrence.countoccurrence("Java is java again java again","a");

        //Replace replace = new Replace();
        //replace.replaceLetter("Aman was able to duck the ball");

        //WordSort wordSort = new WordSort();
        //wordSort.sortWordsOfParagraph("Hello! My name is Dipankar Minj. My age is 22.");

        //Transpose  transpose = new Transpose();
        //transpose.transposeWord("a quick brown fox jumps over the lazy dog");

       // FIndWord fIndWord  = new FIndWord();
//        fIndWord.findWord("This is Harry");
//        fIndWord.findWord("This is Mary");

        MatcherWord matcherWord = new MatcherWord();
        matcherWord.findPositionOfOccurrence("She sells seashells by the seashore","se");
    }
}
