package com.lzx;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author zyg
 * @date 2019/11/30
 */
@Data
@Accessors(chain = true)
public class BaseEntity implements Serializable {
    @TableId(type= IdType.AUTO)
    protected Integer id;
    protected Integer status;
    protected Date  creationtime;
    protected  Date modifcationtime;


}
