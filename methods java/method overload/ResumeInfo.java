class ResumeInfo{
	public static void main(String[] args)
	{
		Resume.format();
		Resume.format("student");
		System.out.println("----------------------");
		Resume.format("student",88);
		System.out.println("----------------------");
		Resume.clear();
		System.out.println("----------------------");
		Resume.delete();
		
	
	}
}