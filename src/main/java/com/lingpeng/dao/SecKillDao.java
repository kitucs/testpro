package com.lingpeng.dao;

import com.lingpeng.entity.SecKill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
public interface SecKillDao {
    //减库存
    //返回成功修改的行数

    int reduceNumber(@Param("secKillId") long secKillId, @Param("killTime")Date killTime);

    //查询指定id
    SecKill queryById(long secKillId);

    //根据偏移量查询商品列表
    List<SecKill> queryAll(int offset, int limit);

}
