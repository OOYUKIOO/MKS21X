public class InsertionSorts{

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

    public static void insertionSort(int[]data){
	for(int i=1;i<data.length;i++){
	    int carry = data[i];
	    int x = i;
	    while((x>0) && (data[x-1]>carry)){
		data[x]=data[x-1];
		data[x-1]=carry;
		System.out.println(x);
		x--;
	    }
	}
    }


}
