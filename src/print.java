
public class print {
	
	static int num(int a)
	{
		if(a<1)
			return 0;
		
		
		 num(--a);
		 System.out.println(a);
		 
		 return(a);
		
	}
	
	public static void main(String[] args) {
		
		num(5);
	}

}
