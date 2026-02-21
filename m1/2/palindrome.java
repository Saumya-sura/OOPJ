import java.util.Scanner;
class palindrome{
    public static void main (String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n= sc.nextInt();
            int og=n,rev=0;
        
            while(n!=0){
                rev = rev*10+ n%10;
                n/=10;
            }    
            if(og==rev){
                System.out.println(og + " is a palindrome number.");
            }
            else{
                System.out.println(og + " is not a palindrome number.");
            }
    }
}