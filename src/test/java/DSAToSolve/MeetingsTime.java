package DSAToSolve;

import org.junit.jupiter.api.Test;

/*Given an array of meeting time intervals consisting of start and end times [s1, e1], [s2, e2], ... , determine if a person could attend all meetings.

        For example,
        Given [ [0, 30], [5, 10], [15, 20] ],
        return false.
        TestData 1- [[0, 30], [5, 10], [15, 20] ]
        TestDatat 2-[0, 10, [20,30], [35, 45] ]
        TestData 3-[[15,30] ,[0,10]]
        TestData 4-[30, 10]]


 Pseudocode:
1.compare end time with start time of other meeting time
 If end time greater return false
Else continue with condition to check until length of all meetings
2. Return true , if all meeting met condition



 */
public class MeetingsTime {

    @Test
    public void test1(){
       int[][] time=  {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(timeInterval(time));
    }
    @Test
    public void test2(){
        int[][] time=  {{0, 10}, {10, 20}, {20, 30}};
        System.out.println(timeInterval(time));
    }
    @Test
    public void test3(){
        int[][] time=   {{0, 10,} ,{20,30}, {35, 45} };
        System.out.println(timeInterval(time));
    }
    public static boolean timeInterval(int[][] a) {

        for(int i = 0; i < a.length; i++) {
            int firstIndexStart = a[i][0], firstIndexEnd = a[i][1];
            for(int j = i + 1; j < a.length; j++) {
                if((a[j][0] < firstIndexStart && a[j][0] < firstIndexEnd) && (a[j][1] < firstIndexStart && a[j][1] < firstIndexEnd)) {
                    continue;
                }
                else if((a[j][0] > firstIndexStart && a[j][0] > firstIndexEnd) && (a[j][1] > firstIndexStart && a[j][1] > firstIndexEnd)) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

}
