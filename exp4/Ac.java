// Access Modifiers in Java
public class Ac{
    public int pubVar = 10;
    protected int protVar = 20;
    int defVar = 30; // default
    private int privVar = 40;

    public void disp(){
        System.out.println(pubVar);
        System.out.println(protVar);
        System.out.println(defVar);
        System.out.println(privVar);

    }
    public static void main (String[] args){
        Ac obj = new Ac();
        obj.disp();
    }
}