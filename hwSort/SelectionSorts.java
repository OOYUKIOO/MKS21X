public class SelectionSorts{

    public static void printArray(int[]data){
	String message = "[";
	if (data.length==0){
	    message+=" ";
	}
	for(int i=0;i<data.length;i++){
	    message += data[i]+",";
	}
	System.out.println(message.substring(0,message.length()-1)+"]");
    }

    public static void selectionSort(int[]data){

	int start = 0;
	int end = data.length;
	int toSwap;

	while(start < end){
	    int min = Integer.MAX_VALUE;
	    for(int x=start; x<end; x++){
		min = Math.min(min,data[x]);
	    }

	    toSwap = data[start];
	    data[start] = min;
	    for(int x = start+1; x<end; x++){
		if (data[x] == min){
		    data[x] = toSwap;
		    x = end;
		}
	    }
	    start ++;
	}

    }

    //testing
    public static void main(String[]args){
	int[]test = {4,2,6,1,0,3};
	printArray(test);
	selectionSort(test);
	printArray(test);

	int[]oneMore = {3,3,1,7,34,1,6,3,10};
	printArray(oneMore);
	selectionSort(oneMore);
	printArray(oneMore);
    }

}
