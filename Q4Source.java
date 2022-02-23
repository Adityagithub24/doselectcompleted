package doselect;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import doselect.NotEligibleException;

class CompanyJobRepository {

	public static String getJobPrediction(int age , String highestQualification) throws Exception 
	{
		String result=null;
		
			if(age<19 && !highestQualification.equals(null) )
			{
				throw new NotEligibleException("you are underage for any job");
			}
		
			if(age>=21 && highestQualification.equals("B.E"))
			{
				result = "We have openings for junior developer";
				return result;
			}
			if( age>=26 && ( highestQualification.equals("M.S") || highestQualification.equals("phD")))
			{
				result = "We have openings for senior developer";
				return result;
			}
			if( age>=19 && ( !(highestQualification.equals("M.S")) || !(highestQualification.equals("phD")) || !(highestQualification.equals("B.E")) ) )
						{
							throw new NotEligibleException("We do not have any job that matches your qualifications");
						}
						
			return "Sorry we have no openings for now";
		}
		

}

public class Q4Source extends CompanyJobRepository{
	
	public static String searchForJob(int age, String highestQualification) throws Exception
	{	//String prediction = null;
		
			if(age>=200 || age<=0 )
			{
				throw new NotEligibleException("The age entered is not typical for a human being");
			}
			else
			{
				return getJobPrediction(age,highestQualification);
			}
	}
	
	public static void main(String args[] )  {
		
		String prediction = null ;
		try
		{
			prediction = searchForJob(21,"bcom");
			System.out.println(prediction);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
