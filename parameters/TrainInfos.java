class TrainInfos
{
 public static void main(String[] args)
	{
        System.out.println("train  running information");
		
         String ref=Train.getTrainName(11013);
		 System.out.println("ref is:"+ref);
		 
		 String ref1=Train.getTrainName(11014);
		 System.out.println("ref is:"+ref1);
		 
		 String ref2=Train.getTrainName(11015);
		 System.out.println("ref is:"+ref2);
		 
		 String ref3=Train.getTrainName(11016);
		 System.out.println("ref is:"+ref3);
		 
		 Train.getTrainName("no");
		
	}
}