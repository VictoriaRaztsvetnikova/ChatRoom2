package mediator.factory;

import java.util.ArrayList;
import java.util.List;

public class ChatImplementation implements Chat {
	
    private List<User> users;
    
	
	public ChatImplementation() {
		this.users=new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		for(User user1  : this.users) {
			if(user1 != user) {
				user1.Receive(message);
			} 	
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
		}


	@Override
	public void removeUser(User user) {
		this.users.remove(user);    
    }
}

		
