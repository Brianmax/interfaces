package interfaces;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        arrayList.add(4);
        linkedList.add(4);

        arrayList.add(2);
        linkedList.add(2);

        System.out.println(arrayList);
        System.out.println(linkedList);

        System.out.println(arrayList.get(0));
        System.out.println(linkedList.get(0));

        Vehiculo vehiculo =  new Carro();
    }
}
