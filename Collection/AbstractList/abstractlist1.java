import java.util.*;
class abstractlist1
{
	public static void main(String args[])
	{
		AbstractList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(5);
		l.add(2);
		System.out.println(l);
		l.add(0,10);
		System.out.println(l);
		
		List l1=new ArrayList();
		l1.add(1000);
		l1.add(2000);
		
		l.add(1,l1);
		System.out.println(l);
		
		System.out.println(l.get(1));
		l.set(1,0000);
		System.out.println(l);
		
		System.out.println(l.indexOf(0));
		
		System.out.println(l.lastIndexOf(2));
		
		l.remove(0);
		System.out.println(l);
		
		//l.removeRange(1,3);
		System.out.println(l.subList(0,3));
		
	}
}