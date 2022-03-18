import java.util.Scanner ;

public class Lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the number of elements : ");
        int num = scanner.nextInt() ;
//        System.out.println(num);

        String[] arr = new String[num];
        for(int i=0; i< num; i++){
            String input = scanner.next() ;
            arr[i] = input ;
        }

        for (String elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();

        for(int i=0 ; i< num; i++){
            System.out.print(arr[num-1-i] + " ");
        }
        System.out.println();
    }
}
