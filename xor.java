import java.util.*;
class xor{
    public static void main(String[]args){
        int[] nums={0,4,6,7,8};
        int[] key={0,5,7,3,2};
        int[] result =new int[5];
        for(int i=0;i<5;i++){
            result[i]=nums[i]^key[i];
        }
        System.out.println(Arrays.toString(result));
    }
}