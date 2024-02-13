package String;

public class StringEquals {

	public static void main(String[] args) {
		String userName="shaun";
		String user1="shaun";
		String user2="shaun.";
		String user3="Shaun";
		String user4="SHAUN";
		String user5="ShAuN";

		System.out.println(userName.equals(user1));
		System.out.println(userName.equals(user2));
		System.out.println(userName.equals(user3));
		System.out.println(userName.equalsIgnoreCase(user4));
		System.out.println(userName.equalsIgnoreCase(user5));
		
		System.out.println(userName==user1);
		System.out.println(userName==user2);
	}

}
