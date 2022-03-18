public class Lecture3 {

    public static void main(String[] args){
        // array declaration
        int[] arr = new int[5] ;
        // array initialization
        int[] studentAges = {21, 22, 25, 20, 24} ;

        // For-each loop example
        int maxAge = Integer.MIN_VALUE ; // -2^{31} = -2147483648
        for (int age : studentAges) {
            if (age > maxAge) {
                maxAge = age ; 
            }
        }
        System.out.println("The max age is " + maxAge) ;


        // Nested loop example
        for (int i = 5; i>0 ; i--){
            for (int j =0 ; j<i ; j++){
                // `System.out.print` does not break line. Compare it with `println`
                System.out.print("*") ;
            }
            System.out.println() ;
        }

        // The fence post problem Example : There is always one more fence post than there is fence spans.
        // How to print "c.o.m.p.u.t.e.r" ? There is no "." at the end.
        char[] chars = {'c', 'o', 'm', 'p', 'u', 't', 'e', 'r'} ;
        for (int i =0; i < chars.length - 1 ; i++){
            System.out.print(chars[i]+".") ;
        }
        System.out.println(chars[chars.length -1]) ;
        
        System.out.println(mulPlus(5,3,2)) ;
        
        
    }
    
    // Declaration order of functions does not matter in Java (It does matter in C programming.)
    public static int mulPlus(int i , int j , int k){
        return plus(i, j) * k ;
    }
    
    public static int plus(int i , int j ){
        return i+j ;
    }

}