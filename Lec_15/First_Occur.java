package Lec_15;

public class First_Occur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,3,5,7,6,8,3,9,10,3};
		int item=3;
		System.out.println(index(arr,item,0));
	}
	public static int index(int[] arr,int item, int idx){
		if(arr[idx]==item) {
			return idx;
			
		}
		if(idx==arr.length) {
			return -1;
		}
		return index(arr,item,idx+1);
		
	}

}
