package view;

import model.Model;

public class View<T extends Model<?>> {
	
	private T entity;
	
	public View(Class<T> clazz) {
		try {
			entity = clazz.newInstance();
		} catch(IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}
	}
	
	public View(T entity) {
		this.entity = entity;
	}
	
	public View() {
	}
	
	public T getEntity() {
		return entity;
	}
	
}
