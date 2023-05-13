package _99_extra._04_tea_party;

public class TeaParty {
	public static String welcome(String name, boolean isWoman, boolean isKnighted) {
	
		TeaParty teaParty = new TeaParty();
     
    
		if(isKnighted == true && isWoman==false) {
			return "Hello Sir " + name;
    	
		}
		
		if(isKnighted == false && isWoman == true)  {
			return "Hello Ms. " + name;
			
		}
    
		if(isKnighted == false && isWoman == false) {
			return "Hello Mr. " + name;
			
		}
		
		return "Hello Lady " + name;
    }
	
	
	
}
