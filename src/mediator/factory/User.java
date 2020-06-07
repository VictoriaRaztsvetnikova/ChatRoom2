package mediator.factory;

public abstract class User {
	
	
	protected String message;
	protected Chat chat;
	protected String Username;
	protected String UserType;

	public User(Chat chat, String username, String userType) {
		this.chat= chat;
		this.Username= username;
		this.UserType = userType;
	}
	
	
	public abstract void Send(String message);
	public abstract void Receive(String message);
}
