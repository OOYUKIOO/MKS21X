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
	    for(int x = start; x<end; x++){

	    }

	}

    }


}