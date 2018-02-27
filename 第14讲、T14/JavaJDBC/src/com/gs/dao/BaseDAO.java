package com.gs.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO<T> {
	
	public T queryById(Serializable id); // id可以是任何一种可序列化的数据
	
	public List<T> queryAll();
	
	public void add(T t);
	
	public void update(T t);
	
	public void delete(Serializable id);

}
