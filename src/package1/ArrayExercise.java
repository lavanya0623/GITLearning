package package1;

public class ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,5,7},{22,3,4},{22,5,7}};
		int min=a[0][0];
		int i;
		int column = 0;
		int max = 0;
		int k;
		for(i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if(a[i][j]<min) {
					min = a[i][j];
					 column=j;
				}
				else {
					
					column=0;
				}
				
			}
		}
		System.out.println(min);
		
		System.out.println(column);

		for (k=0;k<=2;k++) {
		if(a[k][column]>min) {
			min =a[k][column];
			max=min;
		}
			
		}
		System.out.println(max);
	}
}
