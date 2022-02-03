package business.concretes;

import java.util.ArrayList;

import business.abstracts.UserService;
import core.exceptions.BusinessException;
import dataAccess.abstracts.UserDao;
import entities.concrete.User;

public class UserManager implements UserService {

	ArrayList<User> userList = new ArrayList<User>();
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	private boolean checkIfValidEmail(User user) throws BusinessException {
		if (!user.geteMail().contains("@")) {
			throw new BusinessException("Geçersiz Maille deneniyor.");
		}
			return false;
		
	}
	private boolean checkIfGrantedEmail(User user) throws BusinessException {
		for(int i=0; i<getAll().size(); i++) {
			if(user.geteMail() == getAll().get(i).geteMail()) {
				throw new BusinessException("This e-mail address has been already used.");
			}
		}
		return true;
	}
	private boolean checkIfValidFirstName(User user) throws BusinessException {
		
		if (user.getLastName().length() < 2) {
		throw new BusinessException("İsim/soyisim cok kısadır.");

		}
		return false;
	}
	private boolean checkIfValidLastName(User user) throws BusinessException {
		
		if (user.getLastName().length() < 2) {
		throw new BusinessException("İsim/soyisim cok kısadır.");

		}
		return false;
	}
	
	private boolean checkIfValidPassword(User user) throws BusinessException {
		if (user.getPassword().length() < 6) {
			throw new BusinessException("Paralo yetersizdir.");
		}
		return false;
	}
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.getAll();
	}
	
	@Override
	public void add(User user) throws BusinessException {

		if(checkIfValidEmail(user) && checkIfGrantedEmail(user) && checkIfValidFirstName(user) && checkIfValidLastName(user) && checkIfValidPassword(user)) {
			System.out.println("Kayıt Başarılı.");
			this.userDao.add(user);
		}
	}

	@Override
	public void update(User user) throws BusinessException {
		if(checkIfValidEmail(user) && checkIfGrantedEmail(user) && checkIfValidFirstName(user) && checkIfValidLastName(user) && checkIfValidPassword(user)) {
			System.out.println("Kayıt Başarılı.");
			this.userDao.add(user);
		}
	}

	@Override
	public void delete(User users) {
		// TODO Auto-generated method stub

	}

}
