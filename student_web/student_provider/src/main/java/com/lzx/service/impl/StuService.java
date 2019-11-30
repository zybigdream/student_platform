package com.lzx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzx.IStuService;
import com.lzx.Student;
import com.lzx.dao.StuDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zyg
 * @date 2019/11/30
 */
@Service
public class StuService implements IStuService {
	
	@Autowired
	StuDao stuDao;
	
	@Override
	public List<Student> list(Student student) {
		QueryWrapper<Student> wrapper = new QueryWrapper<Student>().eq("status", 1);
		List<Student> list = stuDao.selectList(wrapper);
		
		/**
		 * 根据cid查询学生对应的班级名称
		 */
//		for (Student student : list) {
//                      student.se
//		}
		return list;
	}
	
	@Override
	public int del(Integer id) {
		stuDao.updateById((Student) (new Student()).setId(id).setStatus(0));
		return 0;
	}
	
	@Override
	public int insert(Student student) {
		return stuDao.insert(student);
	}
	
	@Override
	public Student getById(Integer id) {
		return stuDao.selectById(id);
	}
}
