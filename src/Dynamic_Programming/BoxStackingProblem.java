package Dynamic_Programming;

import java.util.Arrays;

// it shows a box class

// TC =  o(n2)   SC=0(n)
class Box
{
	int height,width,length;
	public Box(int height,int width,int length)
	{
		this.height=height;
		this.width=width;
		this.length=length;
		
	}
	public Box()
	{
		
	}
}
public class BoxStackingProblem {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box(1,2,4);
		Box b2=new Box(3,2,5);
		
		Box arr[]=new Box[]{b1,b2};  // array of boxes and thse size boxes are present in infinite numbers
		
		//initialization, since for a box , 3 permulations are possible
		int maxHeight= maxHeightOfBoxStack(arr);
		System.out.println("maxiumum height of Box Stack="+maxHeight);
		
	
	}

	private static int maxHeightOfBoxStack(Box[] arr) {
		Box rot[]=new Box[3*arr.length];
		for(int i=0;i<rot.length;i++)
		rot[i]=new Box();

int index=0;
		for(int i=0;i<arr.length;i++)  //here we are generating 3 permutatons for each boxes with constraints length>width
		{
			
			rot[index] = arr[i];
		      index++;
		 
		      // First rotation of box
		      rot[index].height = arr[i].width;
		      rot[index].length = Math.max(arr[i].height, arr[i].length);
		      rot[index].width= Math.min(arr[i].height, arr[i].length);
		      index++;
		 
		      // Second rotation of box
		      rot[index].height = arr[i].length;
		      rot[index].length = Math.max(arr[i].height, arr[i].width);
		      rot[index].width= Math.min(arr[i].height, arr[i].width);
		      index++;
			
		}
		
		// number of permutations of boxes 
		
		System.out.println("Boxes are permutations");
		for(int i=0;i<rot.length;i++)
		{
			System.out.println(rot[i].length+" "+rot[i].width+" "+rot[i].height);
		}
		System.out.println();
		

		
		int max[]=new int[rot.length];
		
		int result[]=new int[rot.length];
		
		// sorting on the basis of base area , sinc the higher base area has to be n below of lower base area
		for(int i=0;i<rot.length;i++)
		{
			int iBaseArea=rot[i].length*rot[i].width;
			for(int j=0;j<rot.length;j++)
			{
				int jBaseArea=rot[j].length*rot[j].width;
				
				if(iBaseArea>jBaseArea)
				{
					Box temp=rot[j];
					rot[j]=rot[i];
					rot[i]=temp;
					
				}
				
			}
		}
		
		
		System.out.println("Boxes are Sorting");
		for(int i=0;i<rot.length;i++)
		{
			System.out.println(rot[i].length+" "+rot[i].width+" "+rot[i].height);
		}
		System.out.println();
		
		for(int i=0;i<max.length;i++)  // initialization of max and result array
		{
			max[i]=rot[i].height;
			result[i]=i;
		}
		
		for(int i=1;i<max.length;i++)         // TC =  o(n2)
		{
		
			int iLength=rot[i].length;
			int iWidth=rot[i].width;
			for(int j=0;j<i;j++)
			{
			
				int jLength=rot[j].length;
				int jWidth=rot[j].width;
				
				if(iLength<jLength && iWidth<jWidth)   // can i go above of j , andits length and width should also be smaller
				{
					max[i]=rot[i].height+max[j];
					result[i]=j;
				}
				
				
			}
			
			
			
		}
		
		System.out.println("maximum height array");
		System.out.println(Arrays.toString(max));
		
		System.out.println("array containing index of arrays participating in box stacking");
		System.out.println(Arrays.toString(result));
		
		
		
		int maxHeight=0;
		int indexOfMaxHeight=0;
		for(int i=0;i<max.length;i++)
		{
			if(max[i]>maxHeight)
			{
				maxHeight=max[i];
				indexOfMaxHeight=i;
			}
		}
		
		System.out.println("Resulted Boxes in Stack");
		int resultIndex=indexOfMaxHeight;
		while(resultIndex>0)
		{
			System.out.println(rot[resultIndex].length+" "+rot[resultIndex].width+" "+rot[resultIndex].height);
			resultIndex=result[resultIndex];
		}
		
		if(resultIndex==0)
			System.out.println(rot[resultIndex].length+" "+rot[resultIndex].width+" "+rot[resultIndex].height);

		return maxHeight;
	}

}
