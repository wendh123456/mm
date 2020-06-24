package cn.wendh;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionsdemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("g");list.add("r");list.add("y");list.add("o");list.add("p");list.add("l");list.add("m");list.add("k");
        list.add("i");list.add("j");list.add("x");list.add("z");list.add("v");list.add("n");list.add("q");list.add("t");
        list.add("j");list.add("x");list.add("s");list.add("u");list.add("d");list.add("e");list.add("f");list.add("h");


        Collections.sort(list);
        System.out.println(list);

    }
}
