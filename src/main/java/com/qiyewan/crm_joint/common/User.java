package com.qiyewan.crm_joint.common;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;
    // 手机号
    private String phone;
    // 头像
    private String avatar;
    // 会员名
    private String nickname;
    // 是否绑定微信
    private Boolean isWxBound;
    // 客户（主）编号
    private String customerId;
    // UUID
    private String uuid;
    private Date createAt;
    private Date updateAt;

    public User() {}
}
