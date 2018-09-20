package com.lyf.springboot_layui.entiry;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.lyf.springboot_layui.superclass.SuperEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author LYF
 * @since 2018-09-19
 */
public class SysShiroUser extends SuperEntity {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * code
     */
    private String code;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 用户账号
     */
    private String account;
    /**
     * 用户密码
     */
    private String pwd;
    /**
     * 盐
     */
    private String salt;
    /**
     * 账户状态  0 可用  1 待领取  2不可用
     */
    private String status;
    /**
     * 最后一次登录时间
     */
    private Date lastLoginTime;
    /**
     * 创建人id
     */
    private Long createId;
    private Long updateId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysShiroUser{" +
        ", id=" + id +
        ", code=" + code +
        ", name=" + name +
        ", account=" + account +
        ", pwd=" + pwd +
        ", salt=" + salt +
        ", status=" + status +
        ", lastLoginTime=" + lastLoginTime +
        ", createId=" + createId +
        ", updateId=" + updateId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
