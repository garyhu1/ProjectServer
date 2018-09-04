package com.example.myproject.controller;

import com.example.myproject.constant.CommonConstant;
import com.example.myproject.pojo.Notice;
import com.example.myproject.pojo.Result;
import com.example.myproject.pojo.ResultUtil;
import com.example.myproject.service.NoticeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/shop")
@Api(description = "公告模块")
public class NoticeController {

    @Autowired
    public NoticeService noticeService;

    @RequestMapping(value = "/notice/addNotice", method = RequestMethod.POST)
    @ApiOperation(value = "新增公告")
    public Result<Object> addNotice(@ModelAttribute Notice notice, Integer groupId, List<Integer> userIds, Boolean allUser) {


        if (notice.getNoticeType() <= 0) {
            return new ResultUtil<Object>().setErrorMsg("请输入推送用户类型");
        }
        int result = 0;
        switch (notice.getNoticeType()) {
            case CommonConstant.AllUSER:
                result = noticeService.addNotice(notice, null, null, true);
                break;
            case CommonConstant.GROUP:
                result = noticeService.addNotice(notice, groupId, null, false);
                break;
            case CommonConstant.SINGLE:
                for (Integer userId : userIds) {
                    result = noticeService.addNotice(notice, null, userId, false);
                }
                break;
        }
        if (result < 1) {
            return new ResultUtil<Object>().setErrorMsg("新增公告失败");
        }
        return new ResultUtil<Object>().setSuccessMsg("新增公告成功");
    }


}
