class Wonder{
	public static void main(String[] args)
	{
		System.out.println("wonder of the worlds inf");
		String tajmahal="Tajmahal";
	    String petra="Petra";
		String colosseum="Colosseum";
        String lighthouse="Lighthouse";
        String artemis="Artemis";
        String olympia="Olympia";
        String lguazu="Lguazu";
        String eiffel="Eiffel";
		
		String[] wonders={tajmahal,petra,colosseum,lighthouse,artemis,olympia,lguazu,eiffel};
         
        for(int world=0;world<=7;world++)
		{
			System.out.println("wonder of the worlds before change:"+ world + "is" + wonders[world]);
		}
		wonders[4]="the great wall of china";
         System.out.println("========================\n");
        for(int world=7; world>=0;world--)
		{
			System.out.println("wonder of the worlds before change:"+ world+"is"+ wonders[world]);
		}			
	}
}	