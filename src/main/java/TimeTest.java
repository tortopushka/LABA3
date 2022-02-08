import java.util.*;

public class TimeTest {

    List<Integer> collection;

    TimeTest(List<Integer>list){
        collection=list;
    }

    public long testAdd( int n){
        long start = System.nanoTime();
        for ( int i=0; i<n; i++)
            collection.add(i);
        long end = System.nanoTime();
        return end - start;
    }

    public long testGet(int n){
        long start = System.nanoTime();
        for ( int i=0; i<n; i++)
            collection.get(i);
        long end = System.nanoTime();
        return end - start;
    }

    public long testDelete(int n){
        long start = System.nanoTime();
        for ( int i=n-1; i>0; i--)
            collection.remove(i);
        long end = System.nanoTime();
        return end - start;
    }
}

