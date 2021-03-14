package com.hgz.commons.base;

public interface IBaseService<T> {
    int deleteByPrimaryKey(Long id);
    int insert(T t);
    int insertSelective(T t);
    T selectByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(T record);
    int updateByPrimaryKey(T t);
}
