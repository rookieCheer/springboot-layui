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
public class SysShiroRolePermission extends SuperEntity {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 角色code
     */
    private Long roleCode;
    /**
     * 权限code
     */
    private Long permissionCode;
    /**
     * 创建人code
     */
    private Long createCode;
    /**
     * 修改人code
     */
    private Long updateCode;
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

    public Long getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(Long roleCode) {
        this.roleCode = roleCode;
    }

    public Long getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(Long permissionCode) {
        this.permissionCode = permissionCode;
    }

    public Long getCreateCode() {
        return createCode;
    }

    public void setCreateCode(Long createCode) {
        this.createCode = createCode;
    }

    public Long getUpdateCode() {
        return updateCode;
    }

    public void setUpdateCode(Long updateCode) {
        this.updateCode = updateCode;
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
        return "SysShiroRolePermission{" +
        ", id=" + id +
        ", roleCode=" + roleCode +
        ", permissionCode=" + permissionCode +
        ", createCode=" + createCode +
        ", updateCode=" + updateCode +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
