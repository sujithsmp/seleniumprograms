package listeg;

import java.util.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
public class ListEg {

	public static void main(String[] args) {
	List<String> ls=new ArrayList<String>();
	ls.add("mrudhura");
	ls.add("hghg");
	ls.add("uhh");
	ls.add("swathy");
	ls.add("swathy");
	//ls.add("");
	System.out.println(ls);
	ls.remove(0);
	System.out.println(ls);
	Collections.sort(ls);//static method
	System.out.println(ls);
	/*System.out.println("list using for loop");
	for(int i=0;i<ls.size();i++)
	{
		System.out.println(ls.get(i));
	}
	System.out.println("list using foreach");
	for(String e:ls)
	{
		System.out.println(e);
	}*/
	System.out.println("list using Iterator interface");
	Iterator<String> it=ls.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	}

}