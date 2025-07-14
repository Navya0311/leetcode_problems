import java.util.Set;
import java.util.HashSet;

class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels.add(c);
        }

        char[] arr = s.toCharArray(); 
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            
            while (left < right && !vowels.contains(arr[left])) {
                left++;
            }

            
            while (left < right && !vowels.contains(arr[right])) {
                right--;
            }

           
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers
            left++;
            right--;
        }

        return new String(arr); // Convert char array back to string
    }
}
