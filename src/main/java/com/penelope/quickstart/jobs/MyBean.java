package com.penelope.quickstart.jobs;

/**
 * Created with IDEA by penelopeWu
 * Date:2017/9/29 14:02
 */

public class MyBean {

    public void printMessage(){
        System.out.println("不继承QuartzJobBean的作业类。called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
    }
}
