
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		int i = 0;
		
		while (i++ <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		//
		int j = 100;
		while (j-- >= 0) {
			if (j % 3 == 0) {
				System.out.println(j);
			}
		}
		
		//
		for (int k=1; k <= 100; k++) {
			if (k % 2 == 0 ) {
				System.out.println(k);
			}
		}
		
		for (int l=1; l <= 100; l++) {
			if (l % 3 == 0) {
				System.out.println(l + " Hello");
			}
			if (l % 5 == 0) {
				System.out.println(l + " World");
			}
			if (l % 3 == 0) {
				if (l % 5 == 0) {
					System.out.println(l + " Hello World");
				}
			}
			}
		}
		
		
	}


