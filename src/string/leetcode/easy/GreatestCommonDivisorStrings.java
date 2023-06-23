package string.leetcode.easy;
//https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75
public class GreatestCommonDivisorStrings {
    public static String gcdOfStrings(String str1, String str2) {
      StringBuilder sb = new StringBuilder();
      while (str2.length()<str1.length()){
          for (int i = 0; i <str1.length()-1 ; i++) {
              for (int j = 0; j <str2.length()-1 ; j++) {
                  if (str2.charAt(j)==str1.charAt(i)){
                      sb.append(str2.charAt(j));
                  }
                  else sb.append(str1.charAt(i));
              }

          }
      }
      return sb.toString();
    }

    public static void main(String[] args) {
       String str1 = "ABCABC", str2 = "ABC";
       String result = gcdOfStrings(str1,str2);
       System.out.println(result);
    }
}
