package doselect;
//package StringContradiction;
//
//import java.util.ArrayList;
//
//public class Demo {
//
//	public static ArrayList<Integer> makeArrayListInt(int n)
//	{
//		ArrayList<Integer> list = new ArrayList<Integer>(n);
//		for(int i =0 ;i<n ;i++)
//		{
//			list.add(0);
//		}
//		return list;
//	}
//	
//	public static void main(String[] args) {
//		
//	    ArrayList<Integer> list = new ArrayList<Integer>();
//		System.out.println(makeArrayListInt(4)); 
//		
//			
//		
//	}
//
//}

import java.util.*;


class ArrayListOps {
	
	String name;
	  int id;
	  int age;
	  String gender;
	  String department;
	  int yearOfJoining;
	  double salary;
	
	
	public static ArrayList<Integer> makeArrayListInt(int n)
	{
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		for(int i =0 ;i<n ;i++)
		{
			list.add(0);
		}
		return list;
	}

	public ArrayList<Integer> reverseList(ArrayList<Integer> list)
	{
		 ArrayList<Integer> revlist = new ArrayList<Integer>();
		
		for(int i=list.size()-1 ; i>=0 ; i--)
		{
			revlist.add(list.get(i));
		}
		return revlist;
		
	}

	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n)
	{
		for (int i = 0 ; i<list.size() ; i++ )
		{
			if(list.get(i)==m)
			{
				list.set(i,n);
				break;
			}

		}
		return list;
		
	}

}
public class Source extends ArrayListOps {
	public static void main(String[] args) {

		ArrayListOps arp = new ArrayListOps();
		ArrayList<Integer> Alist = new ArrayList<Integer>();
		ArrayList<Integer> reverselist = new ArrayList<Integer>();
		ArrayList<Integer> changelist = new ArrayList<Integer>();

		Alist = arp.makeArrayListInt(4);
		//System.out.println(Alist);
		Iterator itr = Alist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		reverselist = arp.reverseList(Alist);
		System.out.println(reverselist);

		changelist = arp.changeList(Alist,2,5);
		System.out.println(changelist);


	}
}