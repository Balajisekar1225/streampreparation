package Stream;

public class MissingElement {
	public static void main (String[]args) { 
	int[]num = {1,2,3,5,6,7,8,9};
	for(int i=0;i<10;i++) {
		int c =0;
		for(int j=0;j<num.length;j++) {
			if(i==num[j]) {
				c++;
			}
		}
		if(c==0) {
			System.out.println(i);
		}
	}
}
}
