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
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Cls  extends BaseEntity{
    private String cname;
    private Integer cnum;
}
