class FabricInfo
{
 public static void main(String[] args)
	{
        System.out.println("fabric  running information");
		
        double ref=Fabric.getPrice("cotton");
		 System.out.println("ref is:"+ref);
		 
		 double ref1=Fabric.getPrice("nylon");
		 System.out.println("ref is:"+ref1);
		
		
		 double ref2=Fabric.getPrice("woolen");
		 System.out.println("ref is:"+ref2);
		
		
		 double ref3=Fabric.getPrice("linen");
		 System.out.println("ref is:"+ref3);
		
		
		 double ref4=Fabric.getPrice("polystes");
		 System.out.println("ref is:"+ref4);
		
		
		 double ref5=Fabric.getPrice("silk");
		 System.out.println("ref is:"+ref5);
		
		Fabric.getPrice("no");
		
	}
}