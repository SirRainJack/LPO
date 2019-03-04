package lab07_03_04;

import java.util.Iterator;
import java.util.NoSuchElementException;

// objects which iterate over intances of Range
class RangeIterator implements Iterator<Integer> {

//ATTRIBUTES:
    Range r;                 //basic range of the iteration
    int i= 0;                //index of the iteration


//CONSTRUCTOR:
    RangeIterator(Range r){
        this.range = r;     
    }

//METHODS:
    boolean hasNext(){
        return r.isEmpty(r.leftEdge()+i, r.rightEdge());
        //il metodo viene chiamato sull'istanza r e non sulla classe Range cosicche
        //in caso di modifica della classe del campo r il metodo resti funzionante
    }

    int next(){
        if(this.hasNext()) return r.leftEdge(i++);
        //eccezione da inserire!!
    }
}