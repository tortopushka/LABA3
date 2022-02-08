import java.util.*;

/**
 * this class is counting the running time of functions
 */
public class TimeTest {

    /**
     * The field is collection type of list
     */
    List<Integer> collection;
    /**
     * constructor
     */
    TimeTest(List<Integer>list){
        collection=list;
    }
    /**
     * this function adds items to the collection
     * @param n count of elems
     * @return time
     */
    public long testAdd( int n){
        long start = System.nanoTime();
        for ( int i=0; i<n; i++)
            collection.add(i);
        long end = System.nanoTime();
        return end - start;
    }
    /**
     * this function gets items from the collection
     * @param n count of elems
     * @return time
     */
    public long testGet(int n){
        long start = System.nanoTime();
        for ( int i=0; i<n; i++)
            collection.get(i);
        long end = System.nanoTime();
        return end - start;
    }
    /**
     * this function deletes items from the collection
     * @param n count of elems
     * @return time
     */
    public long testDelete(int n){
        long start = System.nanoTime();
        for ( int i=n-1; i>0; i--)
            collection.remove(i);
        long end = System.nanoTime();
        return end - start;
    }



}

