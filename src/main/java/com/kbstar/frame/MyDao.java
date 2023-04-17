package com.kbstar.frame;

import java.util.List;

public interface MyDao<K,V> {
    public void insert(V v);//insert할때는 밸류가 들어가서 db에 들어간다.
    public void delete(K k);
    public V select(K k);//    (key값을 넣으면 V가 리턴됨)
    public List<V> get();
}
