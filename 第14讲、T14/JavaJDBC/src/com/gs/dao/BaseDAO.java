package com.gs.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO<T> {
	
	public T queryById(Serializable id); // id�������κ�һ�ֿ����л�������
	
	public List<T> queryAll();
	
	public void add(T t);
	
	public void update(T t);
	
	public void delete(Serializable id);

}
