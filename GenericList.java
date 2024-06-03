import java.util.ArrayList;

public class GenericList<T> {
    private ArrayList<T> list;

    public GenericList() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public T get(int index) {
        return list.get(index);
    }

    public void print() {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        GenericList<Integer> intList = new GenericList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.print();

        GenericList<String> strList = new GenericList<>();
        strList.add("Hello");
        strList.add("World");
        strList.print();
    }
}
