package com.penelope.quickstart.jobs;

/**
 * Created with IDEA by penelopeWu
 * Date:2017/9/28 23:46
 */
public class AnotherBean {
    public void printMessage(){
        System.out.println("继承QuartzJobBean的作业类，通过AnotherBean传递数据。called by JobDetailFactoryBean using CronTriggerFactoryBean");
    }
}
