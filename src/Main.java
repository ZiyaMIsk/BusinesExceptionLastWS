import business.abstracts.UserService;
import business.concretes.UserManager;
import core.exceptions.BusinessException;
import dataAccess.concretes.UserHibernateDao;
import entities.concrete.User;

public class Main {

	public static void main(String[] args) {
		UserService userService1= new UserManager(new UserHibernateDao());
		User user1 =new User("Orhan", "İnanç", "İorhan@gmail.com", "Aw.;112");
		User user2 =new User("Ziya", "isik", "İorhan@gmail.com", "1Aw.;1122");
		try {
			userService1.add(user1);
			userService1.add(user2);
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("...");
			}
	}
	
}
