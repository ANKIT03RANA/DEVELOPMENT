package com.devspring;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Tomcat tom = new Tomcat();
        //tom.setPort(8080); //to change the port
        Context cont = tom.addContext("", null);
        Tomcat.addServlet(cont, "HelloServlet", new HelloServlet()); //servletname:HelloServlet, we can give any name here
        cont.addServletMappingDecoded("/hello", "HelloServlet"); //when "/hello" endpoint will hit it will take it to HelloServlet, servletname should be same as given above in addServlet i.e HelloServlet
        try {
            tom.start();
            tom.getServer().await(); // it will keep server running
        } catch (LifecycleException ex) {

        }
    }
}
