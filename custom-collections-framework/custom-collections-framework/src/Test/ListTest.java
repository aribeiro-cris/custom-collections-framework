package Test;

import Implementations.ListImp;

public class ListTest {

    public static void main(String[] args) {

        ListImp list = new ListImp();

        //Testing isEmpty;
        System.out.println(list.isEmpty());
        //Testing add;
        System.out.println(list.add(43));
        //Testing isEmpty
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(43));
        //Testing add;
        System.out.println(list.add(5));
        //Testing get;
        System.out.println(list.get(1));
        //Testing length;
        System.out.println(list.size());
        //Testing remove;
        System.out.println(list.remove(5));
        //Testing length;
        System.out.println(list.size());
        //Testing add
        System.out.println(list.add(68));
        //Add again
        System.out.println(list.add(12)); // list = 43, 68, 12
        //contains from the data that we did remove and from a data that exists;
        System.out.println(list.contains(5));
        System.out.println(list.contains(43));
        //Testing indexOf
        System.out.println(list.indexOf(12));
        //add
        System.out.println(list.add(50));
        //add
        System.out.println(list.add(44)); //list = 43, 68, 12, 50, 44
        //sublist
        System.out.println(list.indexOf(44));

        //Testing sublist
        System.out.println("Sublist Testing : ");
        ListImp sublist = (ListImp) list.sublist(1,3);
        //get
        System.out.println(sublist.get(0)); //returns 68
        System.out.println(sublist.get(1)); //returns 12
        System.out.println(sublist.get(2)); //returns null, because is index exclusive

        //clear
        list.clear();
        //length again;
        System.out.println(list.size());
    }
}
