package javaCodePractice.set.givenByjava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetMain {
    public static void main(String[] args) {

        run(new HashSet<String>());
        run(new LinkedHashSet<String>());
        run(new TreeSet<String>());

    }
    static void run(Set<String> set){
        System.out.println("set = " + set.getClass());
        set.add("lol");
        set.add("valorant");
        set.add("AOs");
        set.add("1");
        set.add("2");
        System.out.println("set = " + set);
    }
}
