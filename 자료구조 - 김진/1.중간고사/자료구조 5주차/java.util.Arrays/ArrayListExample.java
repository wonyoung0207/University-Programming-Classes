import java.util.ArrayList;

public class ArrayListExample {
	
	   public static void main(String args[]){  
		      ArrayList<String> alist=new ArrayList<String>();  
		      alist.add("Steve");
		      alist.add("Tim");
		      alist.add("Lucy");
		      alist.add("Pat");
		      alist.add("Angela");
		      alist.add("Tom");
		  
		      //displaying elements
		      System.out.println(alist);
		  
		      //Adding "Steve" at the fourth position
		      alist.add(3, "Steve");
		  
		      //displaying elements
		      System.out.println(alist);
		      alist.remove(2);
		      System.out.println(alist);
		      alist.remove("Steve");
		      System.out.println(alist);
		      for(String str:alist)
		          System.out.println(str);
		      
		      //Updating an element at the 4th position
		      alist.set(4, "Kim");
		      System.out.println(alist);
		      int numberOfItems = alist.size();
		      System.out.println( "number of item : " + numberOfItems);
		      System.out.println("contains : " + alist.contains("Kim"));
		      int post = alist.indexOf("Kim");
		      System.out.println("post : " + post);
		      
		      //ArrayList<int> alist=new ArrayList<int>();  
		      ArrayList<Integer> blist=new ArrayList<Integer>();  
		      blist.add(1);
		      blist.add(2);
		      blist.add(3);
		      blist.add(5);
		      blist.add(8);
		      blist.add(0);
		      for(int a:blist)
		          System.out.println(a);
	 } 

}
