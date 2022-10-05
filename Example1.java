package ArrayList;

import java.util.ArrayList;

public class Example1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        System.out.println("Initial size of al is " + al.size());

        al.add("Street");
        al.add("City");
        al.add("State");
        al.add("Country");
        System.out.println("Size of al after addition is " + al.size());
        System.out.println(al);

        al.remove(1);
        System.out.println(al);
    }
}
