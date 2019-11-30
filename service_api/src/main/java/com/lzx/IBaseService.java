package com.lzx;

import java.util.List;

public interface IBaseService<T> {
	List<T> list(T t);
	
	int del(Integer id);
	
	int insert(Student student);
	
	T getById(Integer id);
}
