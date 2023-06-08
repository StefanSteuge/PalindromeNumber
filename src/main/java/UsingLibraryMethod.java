public class UsingLibraryMethod {

    public static void checkPalindrome (String s) {

        String reverse = new StringBuffer(s).reverse().toString();
        if (s.equals(reverse))
            System.out.println("Yes, it's a palindrome");

        else
            System.out.println("No, it's not a palindrome");
    }

    public static void main(String[] args) {

        try {
            checkPalindrome("mam");
        }catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
