package mediator.factory;

import mediator.factory.Chat;
import mediator.factory.User;
import mediator.factory.UserImplementation;

public class GetUserFactory {

	public User getUser(Chat chat, String username, String userType) {
		
		if(userType  == null) {
			return null;
		}else if("USER".equals(userType)) {
			return new UserImplementation(chat, username, userType);
		}else if("".equals(userType)) {
			System.out.println("You should enter the type of the user!");
		}
		return null;
	}
}
