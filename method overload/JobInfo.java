class JobInfo{
	public static void main(String[] args)
	{
		Job.apply();
		Job.apply("sana",2);
		System.out.println("----------------------");
		Job.apply("saniya",1,"sohel");
		System.out.println("----------------------");
		Job.apply(3);
		System.out.println("----------------------");
		Job.rejectOffer();
		
	
	}
}