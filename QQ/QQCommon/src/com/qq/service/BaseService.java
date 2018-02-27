package com.qq.service;

import java.io.Serializable;

public interface BaseService<T> {
	
	public T queryById(Serializable id);
	
	public void add(T t);
	
	public void update(T t);
	
	public void delete(T t);
}
