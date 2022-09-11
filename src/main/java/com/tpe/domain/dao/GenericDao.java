package com.tpe.domain.dao;

import java.util.List;
import java.util.Optional;

public interface GenericDao<E,ID> {
	
	public void save(E e);
	public void update(E e);
	public void delete(ID id);
	public Optional<E> find(ID id);
	public List<E> getAll();

}
