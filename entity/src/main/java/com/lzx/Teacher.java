package com.lzx;

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
public class Teacher extends BaseEntity {
    private String tname;
    private String subjects;
    private Integer age;
    private String sex;
}
