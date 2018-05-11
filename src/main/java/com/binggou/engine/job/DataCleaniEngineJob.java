package com.binggou.engine.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.io.Serializable;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-05-11 16:41
 */
public class DataCleaniEngineJob implements Job,Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        System.out.println("哈哈哈，大吉大利、今晚吃鸡");
    }

}
