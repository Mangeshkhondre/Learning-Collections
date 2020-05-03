import java.util.Vector;
import java.util.ListIterator;
class listitr1
{
	public static void main(String ar[])
	{
		Vector v = new Vector();
		
		for(int i=1;i<=10;i++)
			v.addElement(i);
		System.out.println(v);
		
		ListIterator lstitr=v.listIterator();
		
		while(lstitr.hasNext())
		{
			int l=(int)lstitr.next();
			System.out.print(l+" ");
			//System.out.print(lstitr.previous()+" ");			
			if(l%2==0)
			{	lstitr.set(l*10);
				lstitr.add(l*100);
			}
			
		}
		System.out.println("\n"+v);
		
	}
}