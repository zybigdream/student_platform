package com.lzx;

import java.util.List;

/**
 * @author zyg
 * @date 2019/11/30
 */
public interface IClsService {
    List<Cls> lsit();

    Cls selectById(Integer id);

    void update(Cls cls);

    int delete(Integer id);
}
