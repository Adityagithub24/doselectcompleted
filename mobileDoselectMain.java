package doselect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

class Mobile
{


public HashMap<String , ArrayList<String>> mobiles = new HashMap<String , ArrayList<String>>();


	public String addMobile(String company , String model)
	{
		String message = null;
		if(mobiles.containsKey(company))
		{
			ArrayList< String > modellist = mobiles.get(company);
			modellist.add(model);
			message = "model successfully added";
			return message;
		}
		else
		{
			mobiles.put(company, new ArrayList<String>());	
			ArrayList< String >modellist = mobiles.get(company);
			modellist.add(model);
			message = "model successfully added";
			return message;

		}
		
	}
	
	public ArrayList<String> getModels (String company)
	{
		
		ArrayList<String> modellist = new ArrayList<String>();
		if(mobiles.containsKey(company))
		{
			modellist = mobiles.get(company);
		}
		
		
		return modellist;
		
	}
	
	public String buyMobile(String company , String model)
	{	
		String message = null;
		ArrayList<String> modellist = new ArrayList<String>();
		if(mobiles.containsKey(company))
		{
			modellist = mobiles.get(company);
			if(modellist.contains(model))
			{
				modellist.remove(model);
				
				mobiles.put(company, modellist);
				
				message = "mobile sold successfully";
				
				return message;
			}
		}
		else
		{
			message = "item not available";
			return message;
		}
		return message;
	}

}


public class mobileDoselectMain extends Mobile{

	public static void main(String args[])
	{
		 Mobile mobobj = new Mobile();
		 System.out.println(mobobj.addMobile("Oppo", "K3"));
		 System.out.println(mobobj.addMobile("Oppo", "Aditya"));
		 System.out.println( mobobj.getModels("Oppo"));
		 
		 System.out.println(  mobobj.buyMobile("Oppo", "K3")); 
		 System.out.println( mobobj.getModels("Oppo"));
	}
	
}

