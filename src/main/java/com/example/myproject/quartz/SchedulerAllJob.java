package com.example.myproject.quartz;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

/**
 * Created by 赵亚辉 on 2017/12/18.
 */
@Component
public class SchedulerAllJob {

    @Autowired
    private SchedulerFactoryBean schedulerFactoryBean;

    /*
     * 此处可以注入数据库操作，查询出所有的任务配置
     */

    /**
     * 该方法用来启动所有的定时任务
     *
     * @throws SchedulerException
     */
    public void scheduleJobs() throws SchedulerException {
        Scheduler scheduler = schedulerFactoryBean.getScheduler();
        scheduleJob1(scheduler);
    }

    public void stop() throws SchedulerException {
        Scheduler scheduler = schedulerFactoryBean.getScheduler();
        scheduler.clear();
    }

    /**
     * 配置Job1
     * 此处的任务可以配置可以放到properties或者是放到数据库中
     *
     * @param scheduler
     * @throws SchedulerException
     */
    private void scheduleJob1(Scheduler scheduler) throws SchedulerException {
        /*
         *  此处可以先通过任务名查询数据库，如果数据库中存在该任务，则按照ScheduleRefreshDatabase类中的方法，更新任务的配置以及触发器
         *  如果此时数据库中没有查询到该任务，则按照下面的步骤新建一个任务，并配置初始化的参数，并将配置存到数据库中
         */
        JobDetail jobDetail = JobBuilder.newJob(ScheduledJob.class)
                .withIdentity("job1", "group1").build();
        // 每5s执行一次
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
                .withSchedule(scheduleBuilder).build();
        scheduler.scheduleJob(jobDetail, cronTrigger);
    }
}

