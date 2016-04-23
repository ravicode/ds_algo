package Matrix;

//Given a 2-d Matrix sorted row wise and column wise . 
//Find the k-th smallest element.
//(Not the min heap method, he needed a more optimized method. 
// He guided me through the question.)

//create a min-eap in and then extract min elemtn kth time.

class HeapNode
{
	int val=0;
	int r=0;
	int c=0;
	
	
}
public class MatrixSortedRowAndColumWiseFindKthSmallestElemnt {
int r=4,c=4;
 
	
static int len=4;
static void makeHeap(HeapNode arr[], int i) { // logn
	int left = 2 * i + 1;
	int right = 2 * i + 2;
	int largest;
	if ((left < len) && (arr[left].val > arr[i].val)) {
		largest = left;
	} else
		largest = i;

	if ((right < len) && (arr[right].val > arr[largest].val)) {
		largest = right;
	}

	if (largest != i) {
		swap(arr, largest, i);
		// System.out.println(Arrays.toString(arr));
		makeHeap(arr, largest);
	}

}

static void swap(HeapNode arr[], int largest, int i) {
	int t = arr[largest].val;
	arr[largest] = arr[i];
	arr[i].val = t;
}
	
	public static void main(String[] args) {
		
		MatrixSortedRowAndColumWiseFindKthSmallestElemnt pm=
				new MatrixSortedRowAndColumWiseFindKthSmallestElemnt();
		int mat[][] = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {25, 29, 37, 48},
                {32, 33, 39, 50},
              };
		
		HeapNode harr[]=(HeapNode[])new Object[4];
		
		pm.createHeapNode(mat,harr);
		
		
		for (int i = (len - 1) / 2; i >= 0; i--) {

			makeHeap(harr, i);
		}
	}
	
	 void createHeapNode(int mat[][],HeapNode harr[])
	{
		
	    for (int i = 0; i < 4; i++)
	    {
	    harr[i].val = mat[0][i];
	    harr[i].r = 0;
	    harr[i].c =i;
	    }

	}
}
