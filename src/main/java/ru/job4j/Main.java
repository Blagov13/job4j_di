package ru.job4j;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.annotation.Man;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.job4j.annotation");
        Man man = context.getBean(Man.class);
        man.print();
    }
}