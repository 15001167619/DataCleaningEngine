package com.binggou.engine.modules.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-05-11 11:12
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class BgResourceCity extends Model {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer ProvinceID;
    private String CityName;
    private Integer IsOrder;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }


}
