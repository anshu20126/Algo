package string.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/fizz-buzz/?envType=featured-list&envId=top-interview-questions
public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
     List<String> result = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if (i%3==0){
                result.add("Fizz");
            } else if (i%5==0) {
                result.add("Buzz");
            } else if (i%3==0 && i%5==0) {
                result.add("FizzBuzz");
            }
            else result.add(Integer.toString(i));
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = fizzBuzz(n);
        System.out.println(result);
    }
}
