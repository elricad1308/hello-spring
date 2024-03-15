package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static java.lang.System.out;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        Person person = context.getBean(Person.class);

        out.println(p.getName());
        out.println(person.getPet());
    }
}