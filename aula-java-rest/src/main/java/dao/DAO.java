package dao;

import java.util.List;

import model.Model;
import utils.EntityManagerUtils;

public class DAO<T extends Model<?>> {

	private Class<T> klazz;
	
	public DAO(Class<T> klazz) {
		this.klazz = klazz;
	}

	public void create(T entity) {
	}
	
	public T find(Object id) {
		return EntityManagerUtils.criarEntityManager().find(klazz, id);
	}
	
	public List<T> findAll() {
		return null;
	}
	
	public void update(T entity) {
	}
	
	public void delete(T entity) {
	}
	
}
