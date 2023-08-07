public class Contractor{
	static void contractor(){
		System.out.println("Contractor method");
	}
	
	static void person(){
		System.out.println("contractor is also a person");
	}
	
	static void contractor(String name){
		System.out.println("Name of the contractor: " + name);
	}
	
	static void contractor(String name, double income){
		System.out.println("Name of the contractor: " + name);
		System.out.println("Income: " + income);
	}
	
	static void contractor(String name, int experience){
		System.out.println("Name of the contractor: " + name);
		System.out.println("experience: " + experience);
	}
	
	static void contractorWork(){
		System.out.println("Contractor constracts the buildinds");
	}
	
	static void contractorSupervise(){
		System.out.println("Contractor will guide the labours to complete the work");
	}
	
	static void payAmount(int salary){
		System.out.println("Paying salary to workers: " + salary);
	}
	
	static void plan(){
		System.out.println("PLan for work to complete");
	}
	
	static void bid(){
		System.out.println("bid to get contract");
	}
	
	public static void main(String[] args){
		contractor();
		System.out.println("\n");
		
		person();
		System.out.println("\n");
		
		contractor("Santosha");
		System.out.println("\n");
		
		contractor("Santosha", 20000);
		System.out.println("\n");
		
		contractor("Amruth", 5);
		System.out.println("\n");
		
		contractorWork();
		System.out.println("\n");
		
		contractorSupervise();
		System.out.println("\n");
		
		payAmount(3000);
		System.out.println("\n");
		
		plan();
		System.out.println("\n");
		
		bid();
		System.out.println("\n");
	}
}