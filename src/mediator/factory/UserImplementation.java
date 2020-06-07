package mediator.factory;

public class UserImplementation extends User {

	public ChatBotSingleton bot;
	
	public UserImplementation(Chat chat, String username, String userType) {
		super(chat, username, userType);
	
	}

	@Override
	public void Send(String message) {
		System.out.println(this.Username + ": Sending message: "+message);
		chat.sendMessage(message, this);
		
		 if  ( message == "addBot") {
			 if(bot.chatBot != null) {
			System.out.println("There is chatBot!");
		}else {
			
		 bot = ChatBotSingleton.getInstance();
			System.out.println("The bot is added!");
	    }
	}
		
		 if( message.contains("cat") && bot.chatBot != null) {
				chat.removeUser(this);
				System.out.println(this.Username +" is removed from the chat,"
						+ " because used a fobidden word 'cat'!");
			}
		}
	
	
	@Override
	public void Receive(String message) {
		System.out.println(this.Username+ ": Receiving message: "+message);
	}
}
