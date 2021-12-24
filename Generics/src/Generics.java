import java.util.*;

public class Generics {
    //public static void print(List<? extends String> list) {
    public static void print(List<? super String> list) {
        list.add("Hello World!");
        System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Generics.print(list);

        List<String> list2 = Arrays.asList("Hello", "World");
        //List<> data = new ArrayList(list);  //raw
        List<Integer> data = new ArrayList(list);  //<--
        Integer intNumber = data.get(0);
        System.out.println(data);
    }
}

