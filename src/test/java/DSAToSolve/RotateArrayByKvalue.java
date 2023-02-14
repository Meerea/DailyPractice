package DSAToSolve;

import org.junit.jupiter.api.Test;

public class RotateArrayByKvalue {

    @Test
    public void test1(){
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
    }

    public void rotate(int[] nums, int k) {

        if(k>nums.length){
            k=k%nums.length;}

        int i=nums.length-k, j=nums.length-1,temp;//nums =[-1]
//k =2

        while(i<j){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        int a=0,b=nums.length-k-1;
        while(a<b){
            temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;
            b--;
        }
        int x=0,y=nums.length-1;
        while(x<y){
            temp=nums[x];
            nums[x]=nums[y];
            nums[y]=temp;
            x++;
            y--;
        }

    }

}

