//way-3
public class WeChat
{
static WeChat w1=new WeChat();
static int count=0;

int totalSentMessages;

private WeChat()
{
	System.out.println("Account created Successfully...");
	count++;
}

void sendMessage(int message)
{
	System.out.println(message+" messages sent succsefully...");
	totalSentMessages=totalSentMessages+message;
	System.out.println("Total sent messages: "+totalSentMessages);
}

static WeChat getWeChat()
{
	return w1;
}

}

