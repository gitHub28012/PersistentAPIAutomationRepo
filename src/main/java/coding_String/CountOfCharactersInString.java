package coding_String;

public class CountOfCharactersInString {

    public static void approach_1(String input){

        char[] inputs = input.toCharArray();
        for (int i=0;i<inputs.length;i++){
            int count=1;
            if (inputs[i]=='0') continue;
            for (int j=i+1;j<inputs.length;j++){
                if (inputs[i]==inputs[j]){
                    count++;
                    inputs[j]= '0';
                }
            }
            System.out.println(inputs[i] + " -> " + count);
        }
    }

    public static void main(String [] args){
        approach_1("aaabbbcccdddd");
    }

}
