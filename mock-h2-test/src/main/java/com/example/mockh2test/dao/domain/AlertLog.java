package com.example.mockh2test.dao.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@TableName("alert_log")
@Data
public class AlertLog {

    @TableId(value = "alert_id", type = IdType.AUTO)
    private Integer alertId;

    @TableField(value = "quality_task_id")
    private Integer qualityTaskId;

    @TableField(value = "quality_table_id")
    private Integer qualityTableId;

    @TableField(value = "alert_time")
    private String alertTime;

    @TableField(value = "alert_rule_count")
    private Long alertRuleCount;

}

