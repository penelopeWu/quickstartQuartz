package com.penelope.quickstart.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created with IDEA by penelopeWu
 * Date:2017/9/28 23:45
 */
public class Job3 extends QuartzJobBean{

    private AnotherBean anotherBean;

    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("this is job3 executing...");
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }
}
