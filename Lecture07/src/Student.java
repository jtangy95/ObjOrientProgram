// toString() Example

class Student {
    String firstName ;
    String lastName ;
    int id ;
    double gpa ;
    Student(String firstName, String lastName, int id){
        this.firstName = firstName ;
        this.lastName = lastName ;
        this.id = id ;
    }
    @Override
    public String toString(){
        return String.format("%s %s : %d", firstName, lastName, id) ;
    }
}
