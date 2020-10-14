package com.lingpeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessKilled {
    private long secKilledId;
    private long userPhone;
    private short state;
    private Date createTime;
    private SecKill secKill;
}
