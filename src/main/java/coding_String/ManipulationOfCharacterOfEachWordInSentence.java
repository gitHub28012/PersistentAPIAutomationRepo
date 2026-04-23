package coding_String;

import java.util.Arrays;

public class ManuplationOfCharacterOfEachWordInSentence {

    public static void firstCharacterInSentenceUsingStream(String sentence){

        Arrays.stream(sentence.split(" "))
                .filter(word->!word.isEmpty())
                .map(word->Character.toUpperCase(word.charAt(0)))
                .forEach(System.out::println);
    }

    public static void main(String[] args){
        firstCharacterInSentenceUsingStream("I love automation testing");
    }
}
