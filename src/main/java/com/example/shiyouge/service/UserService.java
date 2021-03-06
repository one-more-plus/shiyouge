package com.example.shiyouge.service;

import com.example.shiyouge.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 得到用户的肥料数量
     * @param userId 用户ID
     * @return 肥料数量
     */
    public int getFertilizerQuantityOfUser(String userId){
        return userMapper.getTheFertilizerQuantityOfUser(userId);
    }

    /**
     * 得到用户的自习总时长
     * @param userId 用户ID
     * @return 自习总时长
     */
    public int getStudyTimeTotalOfUser(String userId){
        return userMapper.getTheStudyTimeTotalOfUser(userId);
    }

    /**
     * 得到用户的今日自习时长
     * @param userId 用户ID
     * @return 今日自习时长
     */
    public int getStudyTimeTodayOfUser(String userId){
        return userMapper.getTheStudyTimeTodayOfUser(userId);
    }

    /**
     * 得到用户的本周自习时长
     * @param userId 用户ID
     * @return 本周自习时长
     */
    public int getStudyTimeWeekOfUser(String userId){
        return userMapper.getTheStudyTimeWeekOfUser(userId);
    }

    /**
     * 得到用户的自习时房间号
     * @param userId 用户ID
     * @return 自习时房间号
     */
    public int getStudyRoomIdOfUser(String userId){
        return userMapper.getTheStudyRoomIdOfUser(userId);
    }

    /**
     * 根据用户ID更新用户的学习总时长
     * @param userId 用户ID
     * @param studyTimeIntotal 用户学习总时长
     */
    public void updateStudyTimeTotalOfUser(String userId, int studyTimeIntotal){
        userMapper.uptateTheStudyTimeTotalOfUser(userId, studyTimeIntotal);
    }

    /**
     * 根据用户ID更新用户的今日学习时长
     * @param userId 用户ID
     * @param studyTimeToday 用户今日学习时长
     */
    public void updateStudyTimeTodayOfUser(String userId, int studyTimeToday){
        userMapper.uptateTheStudyTimeTodayOfUser(userId, studyTimeToday);
    }

    /**
     * 根据用户ID更新用户的今日学习时长
     * @param userId 用户ID
     * @param studyTimeWeek 用户今日学习时长
     */
    public void updateStudyTimeWeekOfUser(String userId, int studyTimeWeek){
        userMapper.uptateTheStudyTimeWeekOfUser(userId, studyTimeWeek);
    }

    /**
     * 通过用户ID得到昵称
     * @param userId 用户ID
     * @return 用户昵称
     */
    public String getNickNameByUserId(String userId){
        return userMapper.getTheNickNameByUserId(userId);
    }

    /**
     * 所有用户今日学习时长清0
     */
    public void setAllStudyTimeTodayToZero(){
        userMapper.setAllTheStudyTimeTodayToZero();
    }

    /**
     * 所有用户本周学习时长清0
     */
    public void setAllStudyTimeWeekToZero(){
        userMapper.setAllTheStudyTimeWeekToZero();
    }

    /**
     * 今日前10
     * @return 前10的用户ID
     */
    public List<String> getTodayTop10(){
        return userMapper.getTheTodayTop10();
    }

    /**
     * 本周前10
     * @return 前10的用户ID
     */
    public List<String> getWeekTop10(){
        return userMapper.getTheWeekTop10();
    }
}
