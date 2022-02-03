package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.concrete.User;


public class UserHibernateDao implements UserDao{

	
	
	@Override
	public void add(User entity) {
		System.out.println("Kullanıcı Hibernate ile sisteme eklendi.");
		
		
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
