package coding_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoArrayWithoutDuplicate {

    public static void mergeArrayWithoutDuplicate(){

        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2= new HashSet<>(Arrays.asList(1,2,5,6,7));
        set1.addAll(set2);

        System.out.println(set1);
    }

    public static void op2(){

        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {3, 4, 5, 6};

       Set<Integer> result=Stream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).collect(Collectors.toSet());

        System.out.println(result);
    }

     static void  main(String[] args){
         mergeArrayWithoutDuplicate();
         op2();
    }
}
