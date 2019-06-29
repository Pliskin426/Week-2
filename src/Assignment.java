
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		double costOfMilke = 2.99;
		int moneyInWallet = 45;
		int thirstLevel = 5;
		
		boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
			System.out.println("Lets buy some ice cream");
		boolean willGoSwimming = isHotOutside && !isWeekday;
			System.out.println("Lets take a dip!");
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
			System.out.println("Today is a good day!");
		boolean willBuyMilk = isHotOutside && (thirstLevel <= 2 && moneyInWallet <= 6);
			System.out.println("Why am I buying milk, its so hot outside!? Oh well..");
			
		//
			

	}

}
