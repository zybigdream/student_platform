package com.lzx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzx.Cls;
import com.lzx.IClsService;
import com.lzx.Teacher;
import com.lzx.dao.ClsDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zyg
 * @date 2019/11/30
 */
@Service
public class ClsService implements IClsService {
    @Autowired
    private ClsDao clsDao;
    @Override
    public List<Cls> lsit() {
        QueryWrapper <Cls>  queryWrapper=new QueryWrapper<>();
        queryWrapper.lambda().eq(Cls::getStatus,1);
        List<Cls> cls = clsDao.selectList(queryWrapper);
        return cls;
    }

    @Override
    public Cls selectById(Integer id) {
        Cls cls = clsDao.selectById(id);
        return cls;
    }

    @Override
    public void update(Cls cls) {
        clsDao.updateById(cls);
    }

    @Override
    public int delete(Integer id) {
       Cls cs=new Cls();
       cs.setId(id);
       cs.setStatus(0);
        return clsDao.updateById(cs);
    }
}
