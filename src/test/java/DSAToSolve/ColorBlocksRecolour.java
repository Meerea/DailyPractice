package DSAToSolve;

import org.junit.jupiter.api.Test;

public class ColorBlocksRecolour {

    @Test
    public void test1(){
    String blocks = "WBBWWBBWBW";
    int k = 7;
    minimumRecolors(blocks, k);
    }

    @Test
    public void test2(){
        String blocks = "WBBWWBBWBW";
        int k = 7;
        minimumRecolors(blocks, k);
    }

    public int minimumRecolors(String blocks, int k) {
        int counter=0, index=0;
        int minimumCount= Integer.MAX_VALUE;
        while(index<k){
            if(blocks.charAt(index)=='W'){
                counter++;
            }
            index++;
        }
        minimumCount=Math.min(minimumCount,counter);
        for(;index<blocks.length();index++){
            if(blocks.charAt(index-k)=='W'){
                counter--;
            }
            else if(blocks.charAt(index)=='W'){
                counter++;
            }
            minimumCount=Math.min(minimumCount,counter);
        }
        return counter;

    }
}

