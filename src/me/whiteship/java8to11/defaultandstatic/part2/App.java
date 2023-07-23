package me.whiteship.java8to11.defaultandstatic.part2;

import java.sql.Array;
import java.util.*;

public class App {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Gwangmin");
        names.add("whiteship");
        names.add("toby");
        names.add("Foo");
        /*
        name.forEach(System.out::println);

        for (String s : name) {
            System.out.println(s);
        }

        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> stringSpliterator = spliterator.trySplit();
        while(spliterator.tryAdvance(System.out::println));
        System.out.println("==============================");
        while(stringSpliterator.tryAdvance(System.out::println));



        long k = name.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .count();
        System.out.println("result :: " + k);

        name.removeIf(s->s.startsWith("G"));
        name.forEach(System.out::println);

        Comparator<String> compareToIgnoreCase1 = String::compareToIgnoreCase;
        names.sort(compareToIgnoreCase1.reversed());
        names.forEach(System.out::println);

         */





    }
}
