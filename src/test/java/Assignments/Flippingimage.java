package Assignments;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/*

TestData 1 - image = [[1,1,0],[1,0,1],[0,0,0]]
TestData 2 -image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]

Pseudocode:
1.Iterate using two for loop by i=0,until length of image j=0 until the half length of input image
2.using second for loop with i=0,j=0 until length of input image and add 1 if equals 1 else subtract -1
 */

public class Flippingimage {
    @Test
    public void test1(){
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.toString(flipImage(image)));
    }

    @Test
    public void test2(){
        int[][] image={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(Arrays.toString(flipImage(image)));
    }
    private int[][] flipImage(int[][] image){
        int n = image.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][n - j - 1];
                image[i][n - j - 1] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(image[i][j] == 1)
                    image[i][j] -= 1;
                else
                    image[i][j] += 1;
            }
        }
        return image;
    }
}

