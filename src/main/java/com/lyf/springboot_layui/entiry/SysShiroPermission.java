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
public class SysShiroPermission extends SuperEntity {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 编码标识
     */
    private String code;
    /**
     * 权限名称
     */
    private String name;
    /**
     * 节点顺序
     */
    private String parentCodes;
    /**
     * 权限标识(菜单：系统 system：--  ，按钮 button：-- )
     */
    private String value;
    /**
     * 权限地址 url
     */
    private String path;
    /**
     * 状态     0 不可用    1 可用
     */
    private String status;
    /**
     * 权限类型（menu 菜单权限  button 按钮 ）
     */
    private String type;
    /**
     * 创建人ID
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

    public String getParentCodes() {
        return parentCodes;
    }

    public void setParentCodes(String parentCodes) {
        this.parentCodes = parentCodes;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "SysShiroPermission{" +
        ", id=" + id +
        ", code=" + code +
        ", name=" + name +
        ", parentCodes=" + parentCodes +
        ", value=" + value +
        ", path=" + path +
        ", status=" + status +
        ", type=" + type +
        ", createId=" + createId +
        ", updateId=" + updateId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
