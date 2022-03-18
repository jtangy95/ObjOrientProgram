import java.util.Scanner ;

public class StudentIDChecker {
    static boolean isProperLength(String id){
        if ( id.length() != 10){
            System.out.println("The input length should be 10.");
            return false ;
        }
        else {
            return true ;
        }
    }
    static boolean hasProperDivision(String id){
        if(id.charAt(4) != '-'){
            // `id[4]` brings out error --> string is not an array in JAVA
            System.out.println("Fifth character should be \'-\'.");
            return false ;
        }
        else {
            return true ;
        }
    }
    static boolean hasProperDigits(String id){
        for(int i=0 ; i< id.length() ; i++){
            if(i==4){
                continue ;
            }
            if(id.charAt(i) < '0' || id.charAt(i) > '9'){
                System.out.println("Contains an invalid digit.");
                return false ;
            }
        }
        return true ;
    }

    static void validateStudentID(String id){
        if(isProperLength(id) && hasProperDivision(id) && hasProperDigits(id)){
            System.out.println(id + " is a valid student ID");
        }
        else{
            return ;
        }
    }
    /*  함수를 static으로 선언하는 이유는 뭔지 궁금합니다
     main 함수가 static이라, static method는 static method나 attribute에만 접근할수 있으니까
     static으로 선언하는것 같습니다 (static으로 안하면 에러가뜨네요) */

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your student id : ");
        String id = scanner.next() ;

        // str.equals() --> string의 주소가 아닌 content 비교
        while(!id.equals("exit")){
            validateStudentID(id);
            System.out.println();
            id = scanner.next() ;
        }

    }
}
