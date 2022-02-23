package doselect;


class Activity
{
	  public String string1;
	  public String string2;
	  public String operator;
	
	  public Activity(String string1, String string2, String operator) {
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}

	public Activity(String string, String string3) {
		
	}
	  
	  
	  
}

public class Q3Source {
	
		public static String handleException(Activity a) throws Exception
		{
			if(a.string1.equals("") || a.string2.equals(""))
			{
				throw new NullPointerException("Null values found");
			}
			if((!a.operator.equals("+") && !a.operator.equals("-")))
			{
				throw new Exception(a.operator);
			}
			
		return ("No exception found");
	}
	
	public static String doOperation(Activity a)
	{
		String newString = null;
		switch(a.operator)
		{
			case "+" : newString=(a.string1.concat(a.string2));
						return newString;
						
						
			case "-" : newString=(a.string1.replace(a.string2,""));
					   return newString;
		
		}
		
		return newString;
	}
	
	public static void main(String[] args) {

		Activity a = new Activity("helloworld","world","-");
		try {
			System.out.println(handleException(a));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(doOperation(a)); 
		
		
	}

}
