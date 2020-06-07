package mediator.factory;

public class MainClass {


	public static void main(String[] args) {
		
		Chat chat = new ChatImplementation();
		
		GetUserFactory getUserFactory = new GetUserFactory();
		User user1 = getUserFactory.getUser(chat,"Viki", "USER");
		User user2 = getUserFactory.getUser(chat, "Ivan", "USER");
		User user3 = getUserFactory.getUser(chat, "Iordan", "USER");
		
		
		
		/*User user1 = new UserImplementation(chat, "Viki");
		User user2 = new UserImplementation(chat, "Ivan");
		User user3 = new UserImplementation(chat, "Iordan");*/
		
		
		chat.addUser(user1);
		chat.addUser(user2);
		chat.addUser(user3);
		
		
		user2.Send("addBot");
	    user3.Send("cat");
	    user1.Send("hahah");
	}
}
