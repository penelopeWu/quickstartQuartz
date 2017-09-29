package com.penelope.quickstart;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SchedulerException {
        ApplicationContext context = new ClassPathXmlApplicationContext("quartz-context.xml");
    }
}
