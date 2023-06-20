package com.archana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext ac = new ClassPathXmlApplicationContext("configure.xml");
    	
    	TestingShastra ts = (TestingShastra) ac.getBean("Archu");
    	ts.hello();
    }
}
