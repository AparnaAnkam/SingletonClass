
public class Test_WeChat
{
public static void main(String[] args) 
{
WeChat mobile=WeChat.getWeChat();
System.out.println("mobile: "+mobile);
mobile.sendMessage(4);
System.out.println("----------------------------");

WeChat laptop=WeChat.getWeChat();
System.out.println("laptop: "+laptop);
laptop.sendMessage(6);
System.out.println("----------------------------");

WeChat tablet=WeChat.getWeChat();
System.out.println("tablet: "+tablet);
tablet.sendMessage(2);

}
}
