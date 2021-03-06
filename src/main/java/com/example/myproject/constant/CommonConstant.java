package com.example.myproject.constant;


/**
 * 常量
 *
 * @author Exrickx
 */
public interface CommonConstant {

    /**
     * 用户正常状态
     */
    Integer USER_STATUS_NORMAL = 0;

    /**
     * 用户禁用状态
     */
    Integer USER_STATUS_LOCK = -1;

    /**
     * 普通用户
     */
    Integer USER_TYPE_NORMAL = 0;

    /**
     * 管理员
     */
    Integer USER_TYPE_ADMIN = 1;

    /**
     * 性别男
     */
    Integer SEX_MAN = 1;

    /**
     * 性别女
     */
    Integer SEX_WOMAN = 0;

    /**
     * 性别保密
     */
    Integer SEX_SECRET = 2;

    /**
     * 正常状态
     */
    Integer STATUS_NORMAL = 0;

    /**
     * 禁用状态
     */
    Integer STATUS_DISABLE = -1;

    /**
     * 删除标志
     */
    Integer DEL_FLAG = 1;

    /**
     * 限流标识
     */
    String LIMIT_ALL = "LIMIT_ALL";

    /**
     * 页面类型权限
     */
    Integer PERMISSION_PAGE = 0;

    /**
     * 操作类型权限
     */
    Integer PERMISSION_OPERATION = 1;

    /**
     * 1级菜单
     */
    Integer LEVEL_ONE = 1;

    /**
     * 2级菜单
     */
    Integer LEVEL_TWO = 2;

    /**
     * 3级菜单
     */
    Integer LEVEL_THREE = 3;

    /**
     * 注册验证码
     */
    Integer REGISTER_CAPTCHA = 1;

    /**
     * 忘记密码验证码
     */
    Integer FORGET_CAPTCHA = 2;


    String JWT_TOKEN = "MettreProjectsecretkey";

    /**
     * 权限参数头
     */
    String AUTHORITIES = "authorities";


    // 1：所有人 2：群体 3：单个用户
    int AllUSER = 1;
    int GROUP = 2;
    int SINGLE = 3;

}
