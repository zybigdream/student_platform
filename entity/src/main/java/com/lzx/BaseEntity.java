package com.lzx;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zyg
 * @date 2019/11/30
 */
@Data
public class BaseEntity implements Serializable {
    protected Integer id;
    protected Integer status;
    protected Date  creationtime;
    protected  Date modifcationtime;


}
