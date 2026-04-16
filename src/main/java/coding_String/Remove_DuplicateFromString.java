package coding_String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_DuplicateFromString {

    public static void approach_1(String input){
        //aaabbccdddee
        String[] input1 = input.split("");
        Arrays.stream(input1).distinct().forEach(output->System.out.print(new StringBuilder(output).toString()));
    }

    public static void approach_2(String input){
        //aaabbccdddee
        char[] inputs = input.toCharArray();
        Set<Character> set = new HashSet<>();

        for ( char characters:inputs){
            set.add(characters);
        }
       System.out.print(set);
    }


    public static void approach_3(String input){
        //aaabbccdddee
        char[] inputs = input.toCharArray();
        String output="";
        for (int i=0;i<inputs.length;i++){
            int count=1;
            if (inputs[i]=='o') continue;
            for (int j=i+1;j<inputs.length;j++){
                if (inputs[i]==inputs[j]){
                    count++;
                    inputs[j]='0';
                }
            }
               if (inputs[i]!='0'){
                   output+=inputs[i];
               }

        }
              System.out.print("Removed duplicate using brute force :- "+ output);
    }


    public static void approach_4(int [] arr){
        Set<Integer> lhset=new LinkedHashSet<>();
        for (int i=0;i<arr.length;i++) {
            lhset.add(arr[i]);
        }
        System.out.println(lhset);
    }


    public static void main(String [] args){
        int [] arr = {1,2,3,2,1,4};
        //approach_1("aaabbccdddee");
        //approach_2("aaabbccdddee");
        approach_3("aaabbccdddee");
        System.out.println();
        approach_4(arr);

    }

}
