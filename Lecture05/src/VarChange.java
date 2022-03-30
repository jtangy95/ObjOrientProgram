// trace accesses to private Variables
class VarChange{
    private int valueToBeWatched ;
    private int countOfChange ; // trace # of changes
    private int readHistory ; // trace # of reads

    public void setValue(int value) {
        valueToBeWatched = value ;
        countOfChange++ ;
        System.out.println("This is change #"+ countOfChange);
    }
    public int getValue(){
        readHistory++;
        return valueToBeWatched;
    }

    public int getReadHistory(){
        return readHistory ;
    }
}