package coding_String;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfEachWordInString {

    public static void approach_1(String input){
        String[] strArray = input.split(" ");
        for (int i=0;i<strArray.length;i++) {
            int count = 1;
            if (strArray[i] == "0") continue;

            for (int j = i + 1; j < strArray.length; j++) {

                if (strArray[i].equals(strArray[j])) {
                    count++;
                    strArray[j] = "0";
                }
            }
            System.out.println(strArray[i] + " :- count :- " + count);
        }
    }

    public static void approach_2(String input){

        String[] strArray = input.split(" ");
        int count =1;
        Map<String, Integer> map = new HashMap<>();
        for (String str:strArray){
            if (!map.containsKey(str)){
                map.put(str,count);
            }else {
                map.put(str, map.getOrDefault(str,count)+1);
            }
        }
          System.out.println(map);
    }

    public static void main (String[] args){
        approach_1("java is java and java is easy");
        approach_2("java is java and java is easy");
    }

}
