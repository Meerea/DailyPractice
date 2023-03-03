package Assignments;

import java.util.HashSet;
import java.util.Set;


/*
TestData 1 - emails = ["test.email+alex@leetcode.com",
"test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
TestData 2 - emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
TestData 3- emails = ["one@leet+code.com","aab@leetcode.com","c@test@leetcode.com"]

Pseudocode:
1.Declare Set HashSet
2.Iterate using for each loop and split string input using '@'
3.Then Split using regex having '+'
4.Add in set by replacing '.' using replace method
5.Return the input size
 */

public class UniqueEmail {

    public int numUniqueEmails(String[] emails) {
        Set<String> normalized = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String[] local = parts[0].split("\\+");
            normalized.add(local[0].replace(".", "") + "@" + parts[1]);
        }
        return normalized.size();
    }
}

