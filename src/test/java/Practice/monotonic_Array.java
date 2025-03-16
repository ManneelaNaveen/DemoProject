package Practice;

public class monotonic_Array {
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6};
		boolean increment = false;
		boolean decrement = false;
		for(int i=1;i<array.length;i++)
		{
			if(array[i-1]<array[i])
			{
				decrement=false;
			}
			else if(array[i-1]>array[i])
			{
				increment=false;
			}
		}
		if(increment || decrement)
		{
			System.out.println("The Given Array is monotonic");
		}
	}
}
