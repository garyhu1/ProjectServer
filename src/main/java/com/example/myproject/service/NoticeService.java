package com.example.myproject.service;

import com.example.myproject.pojo.Notice;

public interface NoticeService {

    int addNotice(Notice notice, Integer groupId, Integer userId, Boolean allUser);
}
