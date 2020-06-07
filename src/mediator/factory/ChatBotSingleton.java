package mediator.factory;

public class ChatBotSingleton {
	
	
	public static ChatBotSingleton chatBot;
	
	protected static  ChatBotSingleton getInstance() {
		if(chatBot == null) {
			chatBot = new ChatBotSingleton();
		}
		return chatBot;
	}

    private ChatBotSingleton() 
	{
		
	}
}
