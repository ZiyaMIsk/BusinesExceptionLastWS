package core.dataAccess;

import java.util.ArrayList;

import core.entities.Entity;
import entities.concrete.User;

public interface CrudRepository<T extends Entity>{
	
	ArrayList<User> getAll();
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	
}
