package Sorting;
public class SelectionSortObjects {
	
public  SelectionSortObjects()
{
	
}
	public void SelectionSortObjects(Person[] ba)
	{
		Person temp;
		int out, in;
		int nElems=ba.length;
		for(out=0; out<nElems-1; out++) 
		
			for(in=out+1; in<nElems; in++)
			{
		if(ba[out].getLastName().compareTo(ba[in].getLastName())>0)
		{
			temp=ba[in];
			ba[in]=ba[out];
			ba[out]=temp;
		}
		
			}
		display(ba);
		}
		
	
	
	
		
	public void display(Person[] ba)
	{
		for(int i=0;i<ba.length;i++)
		{
		System.out.print(ba[i].getFirstName() + "  " + ba[i].getLastName());
		System.out.println();
		}
		System.out.println();
		System.out.println();
		
	}
	
	
	
	public static void main(String[] args) {
				
Person bubbleArray[]=new Person[3];
bubbleArray[0]=new Person("ravi","nyaare");
bubbleArray[1]=new Person("ravi","pyaare");
bubbleArray[2]=new Person("ravi","mohan");


		
SelectionSortObjects bs=new SelectionSortObjects();
		bs.display(bubbleArray);
		bs.SelectionSortObjects(bubbleArray);
	
	}

}


class Person
{
	String firstName;
	String lastName;
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	
	
	Person()
	{
		
	}
	Person(String firstName,String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	
}


