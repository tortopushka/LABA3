import java.util.*;
/**
 * @author Анастасия
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int task=1;

        while (task==1) {
            System.out.println("Введите количество элементов:  ");
            Scanner in = new Scanner(System.in);
            while (!in.hasNextInt()) {
                System.out.println("Введите число! ");
                in.next();
            }
            int n = in.nextInt();
            if (n < 1) {
                System.out.println("Введите число от 1 и больше!");
                while (!in.hasNextInt()) {
                    System.out.println("Введите число! ");
                    in.next();
                }
                n = in.nextInt();
            }

            TimeTestCompare compareLists = new TimeTestCompare(linkedList, arrayList, n);

            System.out.println();
            String str = compareLists.toString();
            System.out.println(str);
            System.out.println("Если хотите продолжить введите 1");
            while (!in.hasNextInt()){
                System.out.println("Введите любое число! ");
                in.next();
            }
            task = in.nextInt();
        }

    }
}
