
public class Palindrome {
	public static boolean checkPalindrome(String str){
        for (int i =0 ;i<str.length();i++) {
            if(str.charAt(i) == str.charAt(str.length()-1))
                   System.out.println("palindrome");
        }
        return true;  
    }
    public static void main(String[] args) {
        String str = "radar";
        if(checkPalindrome(str))
            System.out.println("The string is a palindrome!");
        else
            System.out.println("The string is not a palindrome!");
    }
}
