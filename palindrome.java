import java.util.Scanner;

class palindrome { 
    static boolean isPalindrome(int i) {
        String p = String.valueOf(i);
        int front = 0, back = p.length() - 1; 
        while (front < back) { 
            if (p.charAt(front) != p.charAt(back)) 
                return false; 
            front++; 
            back--; 
        } 
        return true; 
    } 
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter a string: ");
    	int p = input.nextInt();
        if (isPalindrome(p)) 
            System.out.printf("true\n"); 
        else
            System.out.printf("false\n"); 
    } 
} 
