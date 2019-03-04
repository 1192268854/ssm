package com.entor.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.entor.entity.Student;

/**
 * <T> 任意类型，包括<Object>、基本数据类型<Integer>... 泛型父接口，最基本的数据库持久层对象 方法一
 */
public interface BaseDao<T> {

	// public <T>void add(T t);

	public void add(T t);

	public void addMore(List<T> list);

	public void delete(Class<?> cls, Serializable id);

	public void deleteMore(Class<?> cls, String ids);

	public void update(T t);

	public T queryById(Class<?> cls, Serializable id);

	public List<T> queryAll(Class<?> cls);

	public List<T> queryByPage(Class<?> cls, Map<String, Integer> map);

	public int getTotals(Class<?> cls);
}
