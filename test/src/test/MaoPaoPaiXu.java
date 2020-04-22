package test;

public class MaoPaoPaiXu {

	public static void main(String[] args) {
		int[] a = { 3, 9, 6, 1, 2, 5 ,7,0};
		int index;
		for(int i=0;i<a.length-1;i++){
			index=0;
			for(int j=1;j<a.length-i;j++){
				if(a[j]>a[index]){
					index = j;
				}
			}
			int temp = a[a.length-i-1];
			a[a.length-i-1] = a[index];
			a[index] = temp;
		}

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i]+" ");

		}
	}
}
