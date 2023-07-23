package me.whiteship.java8to11.streamapi;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppExample {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(6, "The Java, Test", true));
        javaClasses.add(new OnlineClass(7, "The Java, Code manipulation", true));
        javaClasses.add(new OnlineClass(8, "The Java, 8 to 11", false));

        System.out.println("spring 으로 시작하는 수업");
        List<OnlineClass> test1 = springClasses.stream()
                .filter(item -> item.getTitle().startsWith("spring"))
                .collect(Collectors.toList());
        test1.stream().forEach(item-> System.out.println(item.getTitle()));

        System.out.println("closed 되지 않은 수업");
        springClasses.stream()
                .filter(Predicate.not(OnlineClass::isClosed))
                .forEach(item -> System.out.println(item.getTitle()));

        System.out.println("수업 이름만 모아서 스트림 만들기");
        List<String> collect = springClasses.stream().map(OnlineClass::getTitle).collect(Collectors.toList());
        collect.stream().forEach(item -> System.out.println(item));

        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
        List<List<OnlineClass>> myList = new ArrayList<>();
        myList.add(springClasses);
        myList.add(javaClasses);

        myList.stream().flatMap(List::stream)
                .map(OnlineClass::getTitle)
                .collect(Collectors.toList())
                .stream().forEach(System.out::println);

        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 10개 까지만");
        Stream.iterate(10, index -> index + 1) // 이 코드에서 speed란 몇부터 시작할지 정하는것이다.
                .skip(10)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("자바 수업 중에 Test가 들어있는 수업이 있는지 확인");
        boolean anyTest = javaClasses.stream().anyMatch(item -> item.getTitle().contains("Test"));
        System.out.println("java Classes Any Test ? ::: " + anyTest);

        System.out.println("스프링 수업 중에 제목에 spring이 들어간 것만 모아서 List 만들기");
        springClasses.stream()
                .map(OnlineClass::getTitle)
                .filter(item -> item.contains("spring"))
                .forEach(System.out::println);

    }
}
