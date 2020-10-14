package com.lingpeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecKill {
    private long secKillId;
    private String name;
    private int number;
    private Date startTime;
    private Date endTime;
    private Date createTime;
}
