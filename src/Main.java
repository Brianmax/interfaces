import poo.Calculadora;
import poo.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("George", "Maxi", 25);
        Person person2 = new Person("Miguel", "Zegarra", 25);
        Person person3 = new Person("Fiorela", "Revilla", 35);
        System.out.println("+++++++++++++++");
        String name = person1.getName();
        System.out.println(name);
        System.out.println(person1.getLastname());
        System.out.println(person1.getAge());
        System.out.println("+++++++++++++++");
        person1.setName("Andres");
        person1.setLastname("Ubaldo");
        person1.setAge(-3);
        System.out.println("+++++++++++++++");
        System.out.println(person1.getName());
        System.out.println(person1.getLastname());
        System.out.println(person1.getAge());
        System.out.println("+++++++++++++++");
        Person person4 = new Person("Juan", "Mendez", 45);

        Person person5 = new Person();

        Person person6 = new Person("Nicolas", "Brody");
        //person1.sayHi();

        //person2.sayHi();

        //person3.sayHi();


        //person1.sayHiToSomeone("Juan");

        Calculadora calculadora1 = new Calculadora();

        int respuestaSuma = calculadora1.suma(4,3);

        System.out.println(respuestaSuma);

        // implementar el metodo multiplicacion

    }
}