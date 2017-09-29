package com.penelope.quickstart.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created with IDEA by penelopeWu
 * Date:2017/9/29 13:58
 */
public class ScheduledJob extends QuartzJobBean {

    private AnotherBean anotherBean;

    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        anotherBean.printMessage();
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }
}
