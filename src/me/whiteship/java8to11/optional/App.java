package me.whiteship.java8to11.optional;

import me.whiteship.java8to11.optional.OnlineClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> optional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        optional.ifPresent(oc-> System.out.println(oc.getTitle()));
        //OnlineClass onlineClass = optional.orElse(createNewClasses());
//        OnlineClass onlineClass = optional.orElseGet(App::createNewClasses);
//        optional.orElseThrow(IllegalStateException::new);

        Optional<Progress> flatProgress = optional.map(OnlineClass::getProgress);

        System.out.println(flatProgress.isPresent());


    }

    private static OnlineClass createNewClasses() {
        return new OnlineClass(10, "New Class", false);
    }
}
