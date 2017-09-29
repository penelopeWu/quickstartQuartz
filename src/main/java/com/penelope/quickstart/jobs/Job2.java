package com.penelope.quickstart.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created with IDEA by penelopeWu
 * Date:2017/9/28 23:36
 */
public class Job2 extends QuartzJobBean {
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("this is job2 executing...");
    }
}
