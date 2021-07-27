
public class Test_Instagram
{
public static void main(String[] args) 
{
Instagram mobile=Instagram.getInstagram();
System.out.println("mobile: "+mobile);
mobile.uploadPhoto(4);
System.out.println("----------------------------");

Instagram laptop=Instagram.getInstagram();
System.out.println("laptop: "+laptop);
laptop.uploadPhoto(6);
System.out.println("----------------------------");

Instagram tablet=Instagram.getInstagram();
System.out.println("tablet: "+tablet);
tablet.uploadPhoto(2);

}
}
