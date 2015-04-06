import java.util.ArrayList;
import java.util.List;

/**
 * Created by n1kropol on 06.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        List<String> s = new ArrayList<String>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        print(s);
        //a
        //b
        //c
        //d
        List<String> f = new ArrayList<String>();
        f.add("a");
        f.add("b");
        f.add("c");
        f.add("d");
        System.out.println(isListsEqual(s, f));
        //true
        f.add("d");
        System.out.println(isListsEqual(s, f));
        //false
        s.add("b");
        System.out.println(isListsEqual(s, f));
        //false
        List<String> s1 = new ArrayList<String>();
        List<String> s2 = new ArrayList<String>();
        System.out.println(isListsEqual(s1, s2));
        //true
        String[] a = {"a", "b", "c", "d", "b"};
        print(a);
        //abcdb
        System.out.println(isEqual(a, s));
        //true
    }
    public static void print(List<String> l) {
        // Тут дописать тело функции.
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
    public static void print(String[] a) {
        // Тут дописать тело функции.
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

    }
    // Тут дописать недостающие функции.
    public static boolean isListsEqual(List<String> first, List<String> second){

        if (first.size() == second.size()) {
            for (int i = 0; i < first.size(); i++)
                if (!first.get(i).equals(second.get(i)))
                    return false;
            return true;
        }
        return false;
    }

    public static boolean isEqual(String[] array, List<String> list){
        if (array.length == list.size()) {
            for (int i = 0; i < array.length; i++)
                if (!array[i].equals(list.get(i)))
                    return false;
            return true;
        }
        return false;
    }
}
