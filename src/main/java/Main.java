import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter iterations: ");
        int n = sc.nextInt();
        while (n<1){
            System.out.print("Enter positive iterations: ");
            n = sc.nextInt();
        }
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        TimeTestCompare comp=new TimeTestCompare(linkedList,arrayList,n);

        System.out.println();
        String str= comp.Compare();
        System.out.println(str);

    }
}
