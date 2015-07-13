import java.util.Arrays;

public class FindSingle {

	public static void main(String[] args) throws Exception {

		if (args.length > 0){
			//using java8 magic
			int[] in = Arrays.stream(args).map(String::trim).mapToInt(Integer::parseInt).toArray();
			System.out.println(Arrays.toString(in) + " " + findsingle(in));
		}else{
			
			{
				int [] in = new int[]{1,1,2,2,3};
				System.out.println(Arrays.toString(in) + " " + findsingle(in));
			}
			
			{
				int [] in = new int[]{1,1,2,3,3};
				System.out.println(Arrays.toString(in) + " " + findsingle(in));
			}
			
			{
				int [] in = new int[]{1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8 };
				System.out.println(Arrays.toString(in) + " " + findsingle(in));
			}
			
			{
				int [] in = new int[]{10, 10, 17, 17, 18, 18, 19, 19, 21, 21, 23};
				System.out.println(Arrays.toString(in) + " " + findsingle(in));
			}
			
			{
				int [] in = new int[]{1, 3, 3, 5, 5, 7, 7, 8, 8, 9, 9, 10, 10};
				System.out.println(Arrays.toString(in) + " " + findsingle(in));
			}
		}

	}
	
	/**
	 * Find and return single element in a sorted array of numbers 
	 * where every value except one appears exactly twice; the 
	 * remaining value appears only once.
	 * 
	 * @param a Sorted array
	 * @return element without a pair
	 */
	static int findsingle(int[] a) throws Exception{

		// Some sample lines. Feel free to remove them.
		if (a.length == 1) return a[0];
		if (a.length == 2) throw new Exception("No single");
		
		return 0;
	}
}

