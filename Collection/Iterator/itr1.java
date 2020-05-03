import java.util.Vector;
import java.util.Iterator;
class itr1
{
	public static void main(String ar[])
	{
		System.out.println("Using Iterator..");
		
		Vector v = new Vector();
		
		for(int i=1;i<=10;i++)
			v.addElement(i);
		System.out.println(v);
		
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			int i=(int)itr.next();
			System.out.print(i+" ");
			if(i%2!=0)
				itr.remove();			
		}
		System.out.println();
		itr = v.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
	}
}