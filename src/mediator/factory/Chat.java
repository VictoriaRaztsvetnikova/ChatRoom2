package mediator.factory;

public interface Chat {
	public void sendMessage(String message, User user);
	public void addUser(User user);
	public void removeUser(User user);
}