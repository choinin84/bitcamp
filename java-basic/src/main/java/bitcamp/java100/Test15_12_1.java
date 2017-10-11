package bitcamp.java100;

public class Test15_12_1 {

    public static void main(String[] args) {

        int v = 87;
        System.out.println(v >> 1); // v / 2**1
        System.out.println(v >> 2); // v / 2**2
        System.out.println(v >> 3); // v / 2**3
        System.out.println(v >> 4); // v / 2**4

        v = -87;

        System.out.println(v >> 1); // v / 2**1
        System.out.println(v >> 2); // v / 2**2
        System.out.println(v >> 3); // v / 2**3
        System.out.println(v >> 4); // v / 2**4
    
        v = 87;

        System.out.println(v >>> 1); // v / 2**1
        System.out.println(v >>> 2); // v / 2**2
        System.out.println(v >>> 3); // v / 2**3
        System.out.println(v >>> 4); // v / 2**4
        
        v = -87;

        System.out.println(v >>> 1); 
        System.out.println(v >>> 2); 
        System.out.println(v >>> 3);        
        System.out.println(v >>> 4); 
        
        v = 5;

        System.out.println(v << 1); // v * 2**1
        System.out.println(v << 2); // v * 2**2
        System.out.println(v << 3); // v * 2**3
        System.out.println(v << 4); // v * 2**4
    
        v = -5;

        System.out.println(v << 1); // v * 2**1
        System.out.println(v << 2); // v * 2**2
        System.out.println(v << 3); // v * 2**3
        System.out.println(v << 4); // v * 2**4
        
        for (int i=0; i <40; i++) {
            System.out.printf("%s, %d\n", Integer.toBinaryString(v <<i), v <<i);
                  
        
        
        
        
        }
    
    }
}
