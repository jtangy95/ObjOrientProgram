// Comparable<T> interface Example

class Undergraduate implements Comparable<Undergraduate> {
    String name ;
    private final double gpa ;
    Undergraduate(String name , double gpa) {
        this.name = name ;
        this.gpa = gpa ;
    }
    double getGpa() {
        return gpa ;
    }
    public int compareTo(Undergraduate another){
        double diff = gpa - another.getGpa() ;
        return diff > 0 ? 1 : (diff < 0 ? -1 : 0) ;
    }
    @Override
    public String toString(){
        return name + " : " + gpa ;
    }
}
