public class Main {
    // Overloading to handle slightly different but closely related tasks
    static double absAdd(double a, double b){
        return Math.abs(a) + Math.abs(b) ;
    }
    static double absAdd(double[] array){
        double sum =0 ;
        for(double elem : array){
            sum = absAdd(sum, elem) ;
        }
        return sum ;
    }

    // Overloading to supply default values for the parameters
    static double power(double base, int n){
        if(n <=0){
            return 1;
        }
        return base * power(base, n-1) ; // recursion
    }
    static double power(double base){
        return power(base, 2) ;
    }

    public static void main(String[] args){
        Point p = new Point() ;
        p.move(3, 0 ) ;
        p.move(0.0, 4.1) ;
        System.out.println(p);

        double[] array1 = new double[] {1.0, 2.0, 3.0, -3.5, -4.5, 5.5, 2.5} ;
        System.out.println(absAdd(array1));

        // Overloading in order to supply additional info to the method
        /* public int indexOf(String str)
           public int indexOf(String str, int fromIndex)
         fromIndex : An int value, representing the index position to start the search from */

        String dna = "JimHalpert" + " PamBisleyHalpert" ;
        int first = dna.indexOf("Halpert") ;
        int second = dna.indexOf("Halpert", first + "Halpert".length()) ;
        System.out.println(first + " , " + second );

        System.out.println(power(2,10));
        System.out.println(power(3));

        RealPoint2D p1 = new RealPoint2D() ;
        p1.show() ;
        p1.move(1.45, 3.15) ;
        p1.show() ;
        System.out.println(p1.getX()) ;
        System.out.println(p1.getY()) ;

        Point2D p2 = new Point2D() ;
        p2.show() ;
        p2.move(3, 2) ;
        p2.show() ;
        System.out.println(p2.getX());
        System.out.println(p2.getY());





    }
}
