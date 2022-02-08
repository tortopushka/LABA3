import java.util.List;

public class TimeTestCompare {

    TimeTest t1;
    TimeTest t2;
    int n;

    TimeTestCompare(List<Integer> linkedList, List<Integer>  arrayList, int n){
        t1=new TimeTest(linkedList);
        t2=new TimeTest(arrayList);
        this.n=n;
    }

    public String Compare(){
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
