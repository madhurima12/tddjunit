package com.epam.tddjunitdemo;

public class RemoveAfromFirstTwoChars {

	public String remove(String string) {
		char FirstChar=string.charAt(0);
		char SecondChar=string.charAt(1);
		String result=string;
		
	     if(SecondChar=='A'&& FirstChar=='A')
		{
			result=string.substring(2);
			
		}
	     else if(FirstChar=='A')
		{
				result=string.substring(1);
		}
		else if(SecondChar=='A')
		{
			result=string.charAt(0)+string.substring(2);
		}
	     return result;

}
}
