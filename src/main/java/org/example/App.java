package org.example;

import org.example.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext.xml");

        Person person = context.getBean("personId", Person.class);
        System.out.println(person);
        System.out.println(person.getAnimal());
        person.animalPlus();
        person.animalMinus();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        Person person1 = context.getBean("personId1", Person.class);
        System.out.println(person1);
        System.out.println(person1.getAnimal());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        Person person2 = context.getBean("personId2", Person.class);
        System.out.println(person2);
        System.out.println(person2.getAnimal());
        person2.animalPlus();
        person2.animalMinus();
    }
}
