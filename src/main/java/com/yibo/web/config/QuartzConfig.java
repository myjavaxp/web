package com.yibo.web.config;

import com.yibo.web.job.EmployeeJob;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

@Configuration
public class QuartzConfig {
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(SimpleTriggerFactoryBean employeeTrigger) {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setTriggers(employeeTrigger.getObject());
        return schedulerFactoryBean;
    }

    @Bean
    public MethodInvokingJobDetailFactoryBean employeeJobDetail(EmployeeJob employeeJob) {
        MethodInvokingJobDetailFactoryBean jobDetailFactoryBean = new MethodInvokingJobDetailFactoryBean();
        jobDetailFactoryBean.setTargetObject(employeeJob);
        jobDetailFactoryBean.setTargetMethod("getEmployeeById");
        jobDetailFactoryBean.setConcurrent(false);
        return jobDetailFactoryBean;
    }

    @Bean
    public SimpleTriggerFactoryBean employeeTrigger(MethodInvokingJobDetailFactoryBean employeeJobDetail) {
        SimpleTriggerFactoryBean simpleTriggerFactoryBean = new SimpleTriggerFactoryBean();
        simpleTriggerFactoryBean.setJobDetail(employeeJobDetail.getObject());
        simpleTriggerFactoryBean.setStartDelay(10000L);
        simpleTriggerFactoryBean.setRepeatInterval(10000L);
        return simpleTriggerFactoryBean;
    }
}