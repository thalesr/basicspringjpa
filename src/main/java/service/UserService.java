package service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.UserDao;
import model.User;

@Component
@Transactional
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void save(User user) {
		
		/*
		 * do some validations
		 */
		
		userDao.save(user);
		
	}
	
}
