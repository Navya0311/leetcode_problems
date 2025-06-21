import java.util.Stack;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> mono_stack = new Stack<>();
        int[] dup = new int[nums2.length];
        for (int index = nums2.length - 1; index >= 0; index--) {
           while(!mono_stack.isEmpty() && mono_stack.peek()<nums2[index]){
            mono_stack.pop();
           }
           if(mono_stack.isEmpty()){
            dup[index]=-1;
           }
           else{
            dup[index]=mono_stack.peek();
           }
           mono_stack.push(nums2[index]);
            System.out.print(dup[index] + " ");
        }
        for (int index = 0; index < nums1.length; index++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[index] == nums2[j]) {
                    nums1[index] = dup[j];
                    break;
                }
            }
        }
        return nums1;
    }
}