package lab07_03_04;

import java.util.Iterator;

public class Range implements Iterable<Integer> {

//ATTRIBUTES:
    private final int start, end;


//CONSTRUCTORS:

    //ranges from start (inclusive) to end (exclusive)
    public Range(int start, int end) {
        if(start <= end){
            this.start = start;
            this.end = end;
        }else{
            this.start = end;
            this.end = start;
        }
        
    }
    
    //ranges from 0 (inclusive) to end (exclusive)
    public Range(int end) {
        this(0,end);
    }


//METHODS:

    //STATIC:
        //valutazione di un intervallo (n,m)  vuoto||pieno
        static boolean isEmpty(int start, int end){
            return start < end;
        }

    boolean isEmpty(){
        return isEmpty(this.start, this.end);
    }

    int leftEdge(){
        return this.start;
    }

    int rightEdge(){
        return this.end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return RangeIterator(this);
    }

}
