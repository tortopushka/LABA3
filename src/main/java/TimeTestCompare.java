import java.util.List;
/**
 * this class is comparing time
 */
public class TimeTestCompare {
    /**
     * This field is needed for test1
     */
    TimeTest t1;
    /**
     * This field is needed for test2
     */
    TimeTest t2;
    /**
     * This field is count of iterations
     */
    int n;

    /**
     * constructor
     * @param linkedList list for compare
     * @param arrayList list for compare
     * @param n count of iterations
     */
    TimeTestCompare(List<Integer> linkedList, List<Integer>  arrayList, int n){
        t1=new TimeTest(linkedList);
        t2=new TimeTest(arrayList);
        this.n=n;
    }

    /**
     * this method return result of compare in string
     * @return string
     */
    @Override
    public String toString(){
        String str="";

        str+="------------------ ADDING ------------------"+System.lineSeparator();
        str+="              Add " + n + " elements       "+System.lineSeparator();
        str+="--------------------------------------------"+System.lineSeparator();
        str+="test add of linkedList | " + t1.testAdd(n) + " nanosecs"+System.lineSeparator();
        str+="--------------------------------------------"+System.lineSeparator();
        str+="test add of arrayList  | " + t2.testAdd(n) + " nanosecs"+System.lineSeparator();
        str+="--------------------------------------------"+System.lineSeparator();

        str+="------------------ GETTING -----------------"+System.lineSeparator();
        str+="              Get " + n + " elements       "+System.lineSeparator();
        str+="--------------------------------------------"+System.lineSeparator();
        str+="test get of linkedList | " + t1.testGet(n) + " nanosecs"+System.lineSeparator();
        str+="--------------------------------------------"+System.lineSeparator();
        str+="test get of arrayList  | " + t2.testGet(n) + " nanosecs"+System.lineSeparator();
        str+="--------------------------------------------"+System.lineSeparator();

        str+="----------------- DELETING -----------------"+System.lineSeparator();
        str+="            Delete " + n + " elements      "+System.lineSeparator();
        str+="--------------------------------------------"+System.lineSeparator();
        str+="test delete of linkedList | " + t1.testDelete(n) + " nanosecs"+System.lineSeparator();
        str+="--------------------------------------------"+System.lineSeparator();
        str+="test delete of arrayList  | " + t2.testDelete(n) + " nanosecs"+System.lineSeparator();
        str+="--------------------------------------------"+System.lineSeparator();

        return str;
    }
}
