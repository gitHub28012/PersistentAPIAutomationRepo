package coding_String;

import java.util.HashSet;
import java.util.Set;

public class LastRepeatingCharacterInString {

    public static char lastRepeatingCharInString(String str){
        char result ='\0';
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                   return str.charAt(j);
                }
            }
        }
         return result;
    }

    public static char lastRepeatCharacterInString(String str){
            Set<Character> set = new HashSet<>();

            for (int i=str.length()-1;i>=0;i--){

                if(set.contains(str.charAt(i))){
                    return str.charAt(i);
                }

                set.add(str.charAt(i));
            }
        return '\0';
    }


     public static void main(String [] args){
        System.out.println(lastRepeatingCharInString("aabbbcbdab"));
         System.out.println(lastRepeatCharacterInString("aabbbcbdab"));
     }

}
