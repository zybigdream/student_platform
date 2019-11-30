package com.lzx;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author zyg
 * @date 2019/11/30
 */
@Data

@NoArgsConstructor
@Accessors(chain = true)
public class Student extends  BaseEntity{
    private String sname;
    private Integer age;
    private  Integer cid;
    @TableField(exist = false)
    private Cls cls;
}
