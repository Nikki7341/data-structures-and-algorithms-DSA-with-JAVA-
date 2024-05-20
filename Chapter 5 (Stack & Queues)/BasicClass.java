import java.io.*;
import java.util.*;


public class BasicClass {

    public static class Person{
        int age;
        String name;

        void saysHi(){
            System.out.println(name +" ["+age+"] says hi!");
        }

        // defalut constructor
        Person(){

        }

        // parametrized contructor 
        Person(int age,  String name){
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args){
        Person p1 = new Person(10, "A");
        p1.saysHi();
    }
}
