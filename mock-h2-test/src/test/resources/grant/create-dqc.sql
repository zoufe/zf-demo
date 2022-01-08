
CREATE TABLE IF NOT EXISTS `alert_log` (
  `alert_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '告警ID',
  `quality_task_id` bigint(11)  COMMENT '任务ID',
  `quality_table_id` bigint(11)  COMMENT '表ID',
  `alert_time` datetime  COMMENT '告警时间',
  `alert_rule_count` bigint(11) DEFAULT '0' COMMENT '告警的规则总数',
  CONSTRAINT pk_alert_log PRIMARY KEY(`alert_id`)
);



CREATE ALIAS IF NOT EXISTS "DATE_FORMAT" FOR "com.example.mockh2test.H2Functions.dateFormat";




