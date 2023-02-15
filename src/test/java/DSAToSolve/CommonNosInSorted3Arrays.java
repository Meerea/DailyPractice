package DSAToSolve;
/*
Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order,
return a sorted array of only the integers that appeared in all three arrays.
Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
Output: [1,5]
Explanation: Only 1 and 5 appeared in the three arrays

constraint - all 3 arrays not the same length

Pseudocode:
1.Get the highest length out of 3 arrays using math function
2.Declare tree map (as to maintain insertion order)
3.Add All the array elements in map by specifying the condition until the length of each array
4.Add only if the keys of map having values=3
5.Add new Array and add those list of elements in array and return array
 */


import org.junit.jupiter.api.Test;

import java.util.*;

public class CommonNosInSorted3Arrays {

    @Test
    public void test1(){
       int[] arr1 = {1,2,3,4,5}, arr2 = {1,2,5,7,9}, arr3 = {1,3,4,5,8};
        System.out.println(Arrays.toString(findElementsInArrays(arr1,arr2,arr3)));
    }
    private int[] findElementsInArrays(int[] arr1,int[] arr2,int[] arr3){

        int size=Math.max(arr3.length,Math.max(arr1.length,arr2.length));
        Map<Integer,Integer> map= new TreeMap<>();
        for(int i=0;i<size;i++){
            if(arr1.length>i){
                map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
            }
            if(arr2.length>i){
                map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
            }
            if(arr3.length>i){
                map.put(arr3[i],map.getOrDefault(arr3[i],0)+1);
            }
        }
        List<Integer> l1= new ArrayList<>();
        for(Map.Entry<Integer,Integer> e1:map.entrySet()){
            if(e1.getValue()==3){
                l1.add(e1.getKey());
            }
        } System.out.println(l1);
            int[] result= new int[l1.size()];
            for(int i=0;i<l1.size();i++){
                result[i++] = l1.get(i);
            }
    return result;
    }
}

