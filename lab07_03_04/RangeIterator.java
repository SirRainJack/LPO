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
        return !Range.isEmptyRange(r.leftEdge()+i, r.rightEdge());
    }

    int next(){
        if(this.hasNext()) return r.leftEdge(i++);
        //eccezione da inserire!!
    }
}