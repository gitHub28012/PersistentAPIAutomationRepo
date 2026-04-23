package coding_String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstring {

    public static String longestUniqueSubString(String input) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        int startIndex = 0;

        for (int right = 0; right < input.length(); right++) {

            while (set.contains(input.charAt(right))) {
                set.remove(input.charAt(left));
                left++;
            }

            set.add(input.charAt(right));

            int windowLength = right - left + 1;

            if (windowLength > maxLength) {
                maxLength = windowLength;
                startIndex = left;
            }
        }

        String result = input.substring(startIndex, startIndex + maxLength);
        return result + " -- " + maxLength;
    }

    public static void main(String[] args){

        String[] testCases = {

                "abcabcbb",      // Expected: "abc" (length 3)

                "bbbbb",         // Expected: "b" (length 1)

                "pwwkew",        // Expected: "wke" or "kew" (length 3)

                "abcdefgh",      // Expected: "abcdefgh" (length 8)

                "",              // Expected: "" (length 0)

                "au",            // Expected: "au" (length 2)

                "dvdf",          // Expected: "vdf" (length 3)

                "tmmzuxt"        // Expected: "mzuxt" (length 5)
        };

        for (String testCase:testCases){
            System.out.println(longestUniqueSubString(testCase));
        }

    }
}
