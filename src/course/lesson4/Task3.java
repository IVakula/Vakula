package course.lesson4;

import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {
        String[] inputEmailsArray = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        Task3 task3 = new Task3();
        System.out.println(task3.numUniqueEmails(inputEmailsArray));
    }

    public int numUniqueEmails(String[] emails) {
        HashSet <String> setEmails = new HashSet<>();
        for (String email : emails) {
            String[] partsEmail = email.split("@");
            partsEmail[0] = partsEmail[0].replaceAll("\\.", "");
            setEmails.add(partsEmail[0].split("\\+")[0] + "@" + partsEmail[1]);
        }
        return setEmails.size();
    }
}
