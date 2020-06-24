package cn.wendh;

import java.util.HashSet;
import java.util.StringTokenizer;

public class Hashsetdemo1 {
    public static void main(String[] args) {
        HashSet<Stutent> stuSet = new HashSet<>();
        Stutent stu = new Stutent("zhang", 12);
        stuSet.add(stu);
        stuSet.add(new Stutent("dfsa",22));
        stuSet.add(new Stutent("颤三",11));
        stuSet.add(new Stutent("颤三",11));

        for (Stutent stu2 : stuSet) {
            System.out.println(stu2);
        }



    }
}
