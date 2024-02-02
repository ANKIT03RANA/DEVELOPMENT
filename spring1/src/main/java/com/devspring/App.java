package com.devspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" ); //Copied dependency from maven repository "spring context" so that we can use ApplicationContext. This is for xml based configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //This line creates container and we have to create spring.xml in resource folder and this file get executed and creates all objects which are mentioned there.
        Alien obj = (Alien)context.getBean("alien"); //context.getbean will give you plane object so you have to typecast it accordingly
        Alien obj1 = context.getBean("alien",Alien.class); //context.getbean will give you object with given type
        obj.code();

    }
}
