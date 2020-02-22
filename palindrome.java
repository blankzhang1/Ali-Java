import java.util.Scanner;

class palindrome { 
    static boolean isPalindrome(String str) { 
        int front = 0, back = str.length() - 1; 
        while (front < back) { 
            if (str.charAt(front) != str.charAt(back)) 
                return false; 
            front++; 
            back--; 
        } 
        return true; 
    } 
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
    	String pString = input.next();
        if (isPalindrome(pString)) 
            System.out.printf("The string \"%s\" is a palindrome\n",pString); 
        else
            System.out.printf("The string \"%s\" is not a palindrome\n",pString); 
    } 
} 
