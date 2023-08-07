class ATMCard{
	
	String cardType="visa";
	int pin=1200670000;
	String bankName="mahaBank";
	int cvv=123;
	
	
	ATMCard()
	{
		System.out.println("invoking the ATMCardwith no argument");
		System.out.println("from the ATMCard:"+this.cardType);
		System.out.println("from the ATMCard:"+this.cvv);
		
	}
	
	ATMCard(String bankName,int pin)
	{
		System.out.println("---------------------");
		System.out.println("invoking the ATMCard with argument");
		this.bankName=bankName;
		this.pin=pin;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(" invoking main in ATMCard");
		
		ATMCard atm1= new ATMCard();
		ATMCard atm2= new ATMCard("mahaBank",120067000);
		System.out.println(atm2.bankName); 
	    System.out.println(atm2.pin);

	} 
}