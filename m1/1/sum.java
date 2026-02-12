class sum {
    public static void main (String [] args) {
        int n=11;
        int sum=0;
        int dig;
        while(n>0){
            dig = n%10;
            sum = sum + dig;
            n = n/10;
        }
        System.out.println("Sum of digits: " +sum);
    } 
}