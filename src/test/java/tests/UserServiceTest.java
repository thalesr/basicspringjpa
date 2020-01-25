package tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.AppConfig;
import model.User;
import service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void testSave() {
		
		User user = new User("FAKE NAME");
		userService.save(user);
		System.out.println(user.getId());
		assertNotNull(user.getId());
		
	}
	
}
