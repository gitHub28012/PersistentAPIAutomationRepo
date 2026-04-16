package coding_String;

import java.util.Arrays;

public class ReverseString {

    /**
     * if we pASS INput = Tanmay then output will be yanmnaT
     * @param input
     * @return
     */
    public static String approach1(String input){
        String output ="";
        for (int i=input.length()-1;i>=0;i--) {

             output+= input.charAt(i);

        }
        return  output;
    }

    public static void main (String [] args){

        String v1 = "abc de f";
        // yM eman si yamnat yamnaT
        //
        String[] words = v1.split(" ");
        Arrays.stream(words).forEach(word-> System.out.print(new StringBuilder(word).reverse().append(" ").toString()));
        System.out.println();
        System.out.println(approach1(v1));
    }

}
