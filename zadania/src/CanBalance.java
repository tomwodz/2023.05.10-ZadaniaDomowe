/*Array-3 > canBalance
        prev  |  next  |  chance

        Given a non-empty array, return true if there is a place to split the array
        so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

        canBalance([1, 1, 1, 2, 1]) → true
        canBalance([2, 1, 1, 2, 1]) → false
        canBalance([10, 10]) → true*/
public class CanBalance {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 1};
        int[] nums2 = {2,1,1,2,1};
        int[] nums3 = {10,10};
        System.out.println(canBalance(nums));
        System.out.println(canBalance(nums2));
        System.out.println(canBalance(nums3));
    }
    public static boolean canBalance(int[] nums) {
        int counter = 0;
        while(counter < nums.length){
            int sumLeft = 0;
            int sumRight = 0;
            for(int i = 0; i < counter; i++){
                sumLeft = sumLeft + nums[i];
            }
            for(int i = counter; i < nums.length; i++){
                sumRight = sumRight + nums[i];
            }
            if(sumLeft == sumRight){return true;}
            counter++;
        }
        return false;
    }
}
