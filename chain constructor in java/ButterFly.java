class ButterFly{
	static int legs;
	static int wings;
	int noOfAntena;
	boolean female;

	public void instanceVariable(){
		System.out.println("Number of Antena:"+noOfAntena);
		System.out.println("female:"+female);
	}

	static void staticVariable(){
		System.out.println("legs:"+legs);
	    System.out.println("Wings:"+wings);
	}

	ButterFly(int noOfAntena, boolean female){
		this.noOfAntena = noOfAntena;
		this.female = female;
	}

	static{
		legs = 6;
		wings = 4;
	}
}