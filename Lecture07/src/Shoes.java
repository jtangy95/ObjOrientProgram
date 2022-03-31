// equals() Example

class Shoes {
    String company ;
    String model ;
    int size ;
    Shoes(String company, String model, int size){
        this.company = company ;
        this.model = model ;
        this.size = size ;
    }
    String getCompany(){
        return company ;
    }
    String getModel(){
        return model ;
    }
    int getSize(){
        return size ;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true ;
        }
        else if(obj instanceof Shoes){
            Shoes shoesObj = (Shoes) obj ;
            return (company.equals(shoesObj.getCompany()) && model.equals(shoesObj.getModel()) && size == shoesObj.getSize() ) ;
            /* `equals()` returns the equality of two objects base on their attributes.
             `==` returns the equality of the object addresses.
             For exception, `==` and `equals()` are the same for primitive types */
        }
        else {
            return false ;
        }
    }
}

class DressShoes extends Shoes {
    String type ;
    DressShoes(String company, String model, int size, String type){
        super(company, model, size);
        this.type = type ;
    }
}
