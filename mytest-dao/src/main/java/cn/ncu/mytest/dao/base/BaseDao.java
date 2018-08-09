package cn.ncu.mytest.dao.base;

import java.util.List;

public interface BaseDao<T> {
    public int insert(T var);
    public Boolean delete(T var);
    public Boolean update(T var);
    public List<T> select(T var);

}
