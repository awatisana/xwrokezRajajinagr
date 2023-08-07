class Wallet{
	
	String walletExamples="googlePay";
	int walletAccount=2;
	float balance=0.0f;
	String types="digital";
	char paymentDone='Y';
	
	
	Wallet()
	{
		System.out.println("invoking the wallet with no argument");
		System.out.println("from the wallet:"+this.walletExamples);
		System.out.println("from the wallet:"+this.balance);
		
	}
	
	Wallet(char paymentDone,int walletAccount)
	{
		System.out.println("---------------------");
		System.out.println("invoking the wallet with argument");
		this.paymentDone=paymentDone;
		this.walletAccount=walletAccount;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(" invoking main in wallet");
		
		Wallet wallet1= new Wallet();
		Wallet wallet2= new Wallet('Y',2);
		System.out.println(wallet2.paymentDone); 
	    System.out.println(wallet2.walletAccount);

	} 
}	
	
