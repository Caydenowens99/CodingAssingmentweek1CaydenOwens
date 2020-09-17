
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double itemPrice = 29.99;
		System.out.println("The Item Price is:" +itemPrice);
		
		double wallet = 600;
		System.out.println("Money in my wallet:" +wallet);
		
		int friends = 15;
		System.out.println("The number of friends I have is " +friends);
		
		int age = 20;
		System.out.println("My age is: " +age);

		String firstName = "Lebron";
		System.out.println("My first name is: " +firstName);

		String lastName = "James";
		System.out.println("My Last Name: " +lastName);
		
		String middleName = "goat";
		System.out.println("My Middle Name: " +middleName);
		
		double newMoneyInWallet = wallet + itemPrice;
		System.out.println("My new money: " +newMoneyInWallet);
		
		int numberOfFriendsBasedOnAge = age + friends;
		System.out.println("number of friends made each year based on age and friends number:" +numberOfFriendsBasedOnAge);
		
		String fullName = firstName + " " + middleName + " " + lastName;
		System.out.println("My full name is: " +fullName);
		
		
	}

}
