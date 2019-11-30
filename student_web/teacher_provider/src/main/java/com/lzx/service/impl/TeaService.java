package com.lzx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzx.ITeaService;
import com.lzx.Teacher;
import com.lzx.dao.TeaDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.List;

/**
 * @author zyg
 * @date 2019/11/30
 */
@Service
public class TeaService implements ITeaService {

    @Autowired
    private TeaDao teaDao;

    @Override
    public List<Teacher> list() {
        QueryWrapper <Teacher>  queryWrapper=new QueryWrapper<>();
        queryWrapper.lambda().eq(Teacher::getStatus,1);
        return  teaDao.selectList(queryWrapper);
    }

    @Override
    public void insert(Teacher teacher) {
        teacher.setModifcationtime(new java.sql.Date(new java.util.Date().getTime()));
        teacher.setStatus(1);
        teaDao.insert(teacher);
    }

    @Override
    public Teacher select(String id) {
        return teaDao.selectById(id);
    }

    @Override
    public void update(Teacher teacher) {
        teacher.setModifcationtime(new java.sql.Date(new java.util.Date().getTime()));
       teaDao.updateById(teacher);

    }

    @Override
    public void updateq(int id) {
        Teacher teacher=new Teacher();
        teacher.setId(id);
        teacher.setStatus(0);
        teaDao.updateById(teacher);
    }
}
