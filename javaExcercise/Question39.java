public class Question39{
	public static void main(String[] args) {
		int count = 0;
		for (int i=1; i <= 4 ;++i ) {
			for (int j = 1;j <=4 ;++j ) {
				for (int k=1; k<=4 ;++k ) {
					if (k != j && j != i && i != k ) {
						count++;
						System.out.println(i + "" + j + "" + k);
					}
				}
				
			}
			
		}
		System.out.println("The number of elements are " + count);
	}
}