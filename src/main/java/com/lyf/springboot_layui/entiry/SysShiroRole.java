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
public class SysShiroRole extends SuperEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色标识
     */
    private String code;
    /**
     * 描述
     */
    private String description;
    /**
     * 状态  0冻结   1可用
     */
    private String status;
    /**
     * 创建人id
     */
    private Long createId;
    /**
     * 修改人id
     */
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return "SysShiroRole{" +
        ", id=" + id +
        ", name=" + name +
        ", code=" + code +
        ", description=" + description +
        ", status=" + status +
        ", createId=" + createId +
        ", updateId=" + updateId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
