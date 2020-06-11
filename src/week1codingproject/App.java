package week1codingproject;

public class App {

	public static void main(String[] args) {
		int itemPrice = 5;
		double amountMoneyInWallet = 10;
		int numberOfFriends = 50;
		int ageInYears = 36;
		String firstName = "Zach";
		String lastName = "Beecher";
		String middleInitial = "R";
		double newMoneyLeftOver = amountMoneyInWallet - itemPrice;
		int numberFriendsMadeEachYear =  numberOfFriends / ageInYears;
		String fullName = firstName + ", " + middleInitial + "., " + lastName + ". ";
		
		
		System.out.println("fullname = " + fullName);
		System.out.println("money left over from purchase = " + newMoneyLeftOver);
		System.out.println("num of friends each year = " + numberFriendsMadeEachYear);
		System.out.println("item price = " + itemPrice);
		System.out.println("money in wallet now = " + amountMoneyInWallet);
		System.out.println("num of friends total now = " + numberOfFriends);

		System.out.print("hello, world");
		
		
		
	}

}
