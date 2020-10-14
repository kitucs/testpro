package com.lingpeng.dao;

import com.lingpeng.entity.SuccessKilled;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SuccessKilledDao {

    //插入购买成功明细，可过滤重复
    int insertSuccessKilled(long secKillId,long userPhone);

    //根据id查询SuccessKilled，并携带SecKill
    SuccessKilled queryByIdWithSecKill(long secKillId);
}
