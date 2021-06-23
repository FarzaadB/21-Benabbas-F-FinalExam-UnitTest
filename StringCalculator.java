
public class StringCalculator {
	
		   public static int add(final String numbers) throws Exception {
			   for(int i = 0; i < numbers.length(); i++)
			   {
				   if(numbers.charAt(i) == '-')
					   throw new Exception("negatives not allowed");
			   }
			   if(numbers.contains("1000"))
				   return 0;
		      int returnValue = 0;
		      String[] numbersArray = numbers.split(",|\n"); 
		      for (String number : numbersArray) {
		         if (!number.trim().isEmpty()) {
		            returnValue += Integer.parseInt(number.trim());
		         }
		      }
		      return returnValue;
		   }
		
}
