package com.entor.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.entor.entity.Student;

public interface BaseService<T> {

	public void add(T t);

	public void addMore(List<T> list);

	public void delete(Class<?> cls, Serializable id);

	public void deleteMore(Class<?> cls, String ids);

	public void update(T t);

	public T queryById(Class<?> cls, Serializable id);

	public List<T> queryAll(Class<?> cls);

	public List<T> queryByPage(Class<?> cls, int currenPage, int pageSize);

	public int getTotals(Class<?> cls);

}
