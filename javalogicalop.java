public class javalogicalop {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND (&&)
        System.out.println("a && b = " + (a && b)); 

        // Logical OR (||)
        System.out.println("a || b = " + (a || b)); 

        // Logical NOT (!)
        System.out.println("!a = " + (!a));        
        System.out.println("!b = " + (!b));        

        // Combined usage
        boolean result = (a && !b) || (b && a);
        System.out.println("(a && !b) || (b && a) = " + result); 

        // Difference from bitwise & and |
        System.out.println("a & b = " + (a & b));   
        System.out.println("a | b = " + (a | b));   

        // Short-circuit demo
        int x = 10;
        int y = 5;
        if (x > 0 || ++y > 10) { 
            System.out.println("Short-circuit OR: y = " + y); 
        }
        if (x > 0 | ++y > 10) { 
            System.out.println("Bitwise OR on booleans: y = " + y); 
        }
    }
}
