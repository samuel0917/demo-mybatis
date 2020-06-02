package com.example.demomybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 登录用户表
 * </p>
 *
 * @author wenchao
 * @since 2020-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_login_user")
public class SysLoginUser implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名称
     */
    @TableField("user_name")
    private String userName;

    /**
     * 用户密码
     */
    @TableField("password")
    private String password;

    /**
     * 昵称
     */
    @TableField("nick_name")
    private String nickName;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 手机号
     */
    @TableField("user_phone")
    private String userPhone;

    /**
     * 微信unioinid
     */
    @TableField("wechat_unionid")
    private String wechatUnionid;

    /**
     * 用户类型id
     */
    @TableField("user_type_id")
    private Integer userTypeId;

    /**
     * 用户类型描述
     */
    @TableField("user_type_text")
    private String userTypeText;

    /**
     * 用户来源id
     */
    @TableField("user_from_id")
    private Integer userFromId;

    /**
     * 用户来源描述
     */
    @TableField("user_from_text")
    private String userFromText;

    /**
     * 推荐人id
     */
    @TableField("referrer_id")
    private Long referrerId;

    /**
     * 推荐人名称
     */
    @TableField("referrer_name")
    private String referrerName;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 数据变更时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 是否删除 0 为删除 1 已删除
     */
    @TableField("is_del")
    private Integer isDel;

    /**
     * 是否超级管理员 0 不是 1 是
     */
    @TableField("is_root")
    private Integer isRoot;


}
