package hundreddayscodeforexperince.code;
//write a java program to count the no. of vowels in the given string
public class CountVovels {
    public static int count(String s){
       /* String s1 ="aeiouAEIOU";
        int count =0;
        for (int i = 0; i <s.length() ; i++) {
            for (int j = 0; j <s1.length() ; j++) {
                if (s.charAt(i)==s1.charAt(j)){
                    count++;
                }
            }
        }
        return count;*/
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
       String s = "the vowels to count in string is to compare string  for aeiou chars";
       System.out.println(count(s));
    }
}
