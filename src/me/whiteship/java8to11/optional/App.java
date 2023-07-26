package me.whiteship.java8to11.optional;

import me.whiteship.java8to11.optional.OnlineClass;

import java.time.Duration;
import java.util.*;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> spring = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findAny();

        spring.orElseGet(App::createNewClasses);


    }

    private static OnlineClass createNewClasses() {
        return new OnlineClass(10, "New Class", false);
    }
}
