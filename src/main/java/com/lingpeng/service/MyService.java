package com.lingpeng.service;

import com.lingpeng.dao.SecKillDao;
import com.lingpeng.entity.SecKill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class MyService {
    @Autowired
    SecKillDao secKillDao;

    public int queryById(long secKillId){
        System.out.println("service"+secKillId);
        String startStr = "2015.11.1 03:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        try {
            Date start = sdf.parse(startStr);
            System.out.println(start);
            return secKillDao.reduceNumber(1000,new Date());
        }catch (Exception e){
            e.printStackTrace();
        }
        return 1002;
    }
}
