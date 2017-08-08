package tree.heap;
//log(2)n
public class Heap {
	private int HEAP_SIZE;
	private int heapArr[];
	
	public Heap(){
		HEAP_SIZE = 0;
		heapArr = new int[50];
	}
	
	public void insertHeap(int input){
		int i = ++HEAP_SIZE;
		while((i != 1) && (input > heapArr[i/2])){
			heapArr[i] = heapArr[i/2];
			i =i/2;
		}
		heapArr[i] = input;
	}
	
	public int deletHeap(){  //heap_sort에 걸리는시간은 nlon(2)n
		int parent , child;
		int data, temp;
		data = heapArr[1];
		
		temp = heapArr[HEAP_SIZE];
		HEAP_SIZE -= 1;
		parent = 1; child = 2;
		
		while(child <= HEAP_SIZE){
			if((child < HEAP_SIZE) && (heapArr[child] < heapArr[child+1])){
				child++; 
			} // 오른쪽 child랑 비교하기 위함인다.
			if(temp >= heapArr[child])break;
			heapArr[parent] = heapArr[child];
			parent = child;
			child *= 2;
		}
		heapArr[parent] = temp;
		return data;
	}
	
	public int getHeapSize(){
		return HEAP_SIZE;
	}
	public void printHeap(){
		System.out.printf("\nHeap >>> ");
		for(int i =1 ;i <= HEAP_SIZE; i++){
			System.out.printf("[%d]",heapArr[i]);
		}
	}
	public static void main(String[] args){
		Heap h = new Heap();
		h.insertHeap(15);
		h.insertHeap(13);
		h.insertHeap(10);
		h.insertHeap(20);
		h.insertHeap(8);
		h.insertHeap(19);
		
		h.printHeap();
		
		int n,data;
		n = h.getHeapSize();
		System.out.println(n);
		data = h.deletHeap();
		h.printHeap();
		
		
//		for(int i=1;i<=n;i++){
//			data = h.deletHeap();
//			System.out.printf("\n deleted Item : [%d]",data);
//		}
	}
}
