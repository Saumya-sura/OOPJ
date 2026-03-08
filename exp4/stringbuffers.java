

public class stringbuffers {
        public static void main (String[] args) {
            StringBuffer sb = new StringBuffer("Hello");
            sb.append(" World");
            System.out.println(sb.toString());
            sb.insert(3,"java");
            System.out.println(sb.toString());
            sb.reverse();
            System.out.println(sb.toString());
        }
}
