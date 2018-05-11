package com.binggou.engine.modules.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-05-11 16:02
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class QuartzEntity {

    private String jobName;//任务名称
    private String jobGroup;//任务分组
    private String description;//任务描述
    private String jobClassName;//执行类
    private String cronExpression;//执行时间
    private String triggerName;//执行时间
    private String triggerState;//任务状态

    private String oldJobName;//任务名称 用于修改
    private String oldJobGroup;//任务分组 用于修改

    public QuartzEntity() {
        super();
    }

}
