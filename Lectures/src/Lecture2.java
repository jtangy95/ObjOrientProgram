import java.util.Scanner;

public class Lecture2 {

    public static void main(String[] args){
        // + operator runs from the left to the right
        System.out.println("The answer is : " + 2 + 3 + "!") ;
        System.out.println(2 + 3 + " is the answer !") ;

        // Console input

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in) ;
        // Read user input
        System.out.println("Enter username");
        String userName = scanner.nextLine() ;
        // Output 
        System.out.println("User name is : " + userName) ;
        // Read user input
        System.out.println("Insert the coin");
        int coin = scanner.nextInt() ;
        // Output
        System.out.println("You have just inserted " + coin + " coins") ;

        // One way to swap values in two variables
        // prone to possible overflow
        int first = 100 , second = 200 ;
        first = first + second ;
        second = first - second ;
        first = first - second ;
        System.out.println("first is " + first + " and second is " + second) ;

        // double is default type for floating numbers
        // int is default type for integers
        double pi = 3.14 ;
        System.out.println(pi) ;

        double fiveOverTwo = 5 / 2 ;
        System.out.println(fiveOverTwo) ; // Output is 2
        int five = 5 ;
        double two = 2 ;
        System.out.println(five/two) ; // Output is 2.5 as desired

        // Bitwise operators

        // Initial values
        int a = 5;
        int b = 7;

        // bitwise AND &
        // 0101 & 0111 = 0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise OR |
        // 0101 | 0111 = 0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise XOR ^
        // 0101 ^ 0111 = 0010 = 2
        // if corresponding bits are different, it gives 1, else it shows 0
        System.out.println("a^b = " + (a ^ b));

        // bitwise NOT ~
        // ~0101 = 1010
        // will give 2's complement of 1010 = -6
        System.out.println("~a = " + ~a);

        // Signed Left & Right Shift Operator << and >>
        int c = 5 ;  // binary number 101
        System.out.println(c << 2) ; // binary number 10100 = decimal number 20
        System.out.println(20 >> 2) ;

        // Short Circuit Evaluation of logical operators && and ||
        int denominator = 0 ;
        double numerator = 100 ;
        if (denominator !=0 && numerator / denominator == 1){
            System.out.println("Prevents division by zero") ;
        }

        // prefix and postfix result of increment operator ++ and --
        int x1 = 1, y1 = 1;
        int prefixResult = x1 + ++y1 ;
        System.out.println("Prefix result is : " + prefixResult) ;
        System.out.println("y1 is " + y1) ;

        int x2 = 1, y2 = 1;
        int postfixResult = x2 + y2++ ;
        System.out.println("Postfix result is : " + postfixResult) ;
        System.out.println("y2 is " + y2) ;

    }
}