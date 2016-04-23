package StringAlgorithms;

public class SplitString {

	public static void splitString()
	{
		String assetClasses = "Gold:Stocks:Fixed Income:Commodity:Interest Rates";
		String[] splits = assetClasses.split(":");

		System.out.println("splits.size: " + splits.length);

		for(String asset: splits){
		System.out.println(asset);
		}


		
	}
	
	public static void main(String[] args) {
		splitString();
		
	}
}
