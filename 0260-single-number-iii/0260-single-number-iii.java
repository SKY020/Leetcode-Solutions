public class Solution {
    public int[] singleNumber(int[] nums){
        int xor = 0;
        for(int num: nums){
            xor^=num;
        }
        int elwithLowestBitSet = Integer.lowestOneBit(xor);
    
        int[] ans = new int[2];
    
        for(int num: nums){
            if((elwithLowestBitSet & num) == 0){
                ans[0] ^= num;
            }
               else{
                   ans[1] ^= num;
               }
               }
               return ans;
               }
               }