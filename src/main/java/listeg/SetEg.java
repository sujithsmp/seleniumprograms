package listeg;

import java.util.*;

public class SetEg {

	public static void main(String[] args) 
	{
		Set <String> set=new HashSet<String>();
		set.add("mrudhura");
		set.add("Sujith");
		set.add("uhh");
		set.add("swathy");
		set.add("swathy");
		System.out.println(set);
		set.remove("uhh");
		System.out.println(set);
	
		System.out.println("set using foreach");
		for(String e:set)
		{
			System.out.println(e);
		}
		System.out.println("set using Iterator interface");
		Iterator<String> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//set.clear();
		System.out.println(set);
		Set <String>set2=new HashSet<String>();
		set2.add("abc");
		set2.add("def");
		//System.out.println(set2);
		set.addAll(set2);
		System.out.println("set 2 "+set2);
		System.out.println("set 1 "+set);
		set.removeAll(set2);
		System.out.println("remove all methods");
		System.out.println("set 2 "+set2);
		System.out.println("set 1 "+set);
	}

}
