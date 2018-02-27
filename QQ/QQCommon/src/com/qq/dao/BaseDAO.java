package com.qq.dao;

import java.io.Serializable;

public interface BaseDAO<T> {
	
	public T queryById(Serializable id);
	
	public void add(T t);
	
	public void update(T t);
	
	public void delete(T t);

}
