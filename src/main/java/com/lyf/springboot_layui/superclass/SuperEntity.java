package com.lyf.springboot_layui.superclass;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * @author LYF
 * @date 2018/7/27 13:09
 */
public class SuperEntity<T extends Model> extends Model<T> {
    private Long id;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
