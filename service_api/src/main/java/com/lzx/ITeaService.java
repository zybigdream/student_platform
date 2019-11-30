package com.lzx;

import java.util.List;

/**
 * @author zyg
 * @date 2019/11/30
 */
public interface ITeaService {
    List<Teacher> list();

    void insert(Teacher teacher);

    Teacher select(String id);

    void update(Teacher teacher);

    void updateq(int id);
}
