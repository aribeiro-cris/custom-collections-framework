package Test;

import Implementations.SetImp;

public class SetTest {

    public static void main(String[] args) {
        SetImp set = new SetImp<>();

        //Testing isEmpty
        System.out.println(set.isEmpty());
        //Testing add
        System.out.println(set.add(12));
        System.out.println(set.add(3));
        System.out.println(set.add(34));
        System.out.println(set.add(6));
        System.out.println(set.add(90));
        //Testing adding a dupplicate number
        System.out.println(set.add(6));
        //Testing isEmpty
        System.out.println(set.isEmpty());
        //Testing size
        System.out.println(set.size());
        //Testing contains
        System.out.println(set.contains(3));
        //Testing clear
        set.clear();
        System.out.println(set.isEmpty());
    }
}
