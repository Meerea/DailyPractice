package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AlternateSolution {

    @Test
    public void test1(){
        String s= "aBBBcdMOMkajleDAD";
        int k=3;
        System.out.println(findPals(s,k));
    }
    @Test
    public void test2(){
        String s="Asdsdba";
        int k=3;
        System.out.println(findPals(s,k));
    }
    @Test
    public void test3(){
        String s= "BSdsDba";
        int k=3;
        System.out.println(findPals(s,k));
    }
    public ArrayList<String> findPals(String s, int k)
    {
        ArrayList<String> list= new ArrayList<>();

        int p1=0,p2=p1+k;
        while(p1<p2 && p2<=s.length())
        {
            String temp=s.substring(p1,p2);
            if(isPalindrome(temp))
            {
                list.add(temp);
            }
            p1++;
            p2=p1+k;
        }
        return list;
    }
    public boolean isPalindrome(String temp)
    {
        int p1=0,p2=temp.length()-1;

        while(p1<p2)
        {
            if(temp.charAt(p1)!=temp.charAt(p2))
                return false;
            p1++; p2--;
        }
        return true;
    }
}



