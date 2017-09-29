package com.penelope.quickstart.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * Created with IDEA by penelopeWu
 * Date:2017/9/28 22:40
 */
public class Job1 implements Job {
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("this is job1 executing...");
    }
}
