class overloading{
    void add(int a,int b){
        System.out.println("Sum of two integers: " + (a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Sum of three integers: " + (a+b+c));
    }

 public static void main (String [] args){
    overloading o1= new overloading();
    o1.add(5, 10);
    o1.add(5, 10, 15);
 }
}