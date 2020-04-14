import java.util.Arrays;
import java.util.Random;
public class MinMaxMain 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		for(int i=0; i<10; i++)
		{
			int[] MyArr = new int[6];
			for(int c=0; c<MyArr.length; c++)
			{
				MyArr[c] = rand.nextInt(19) + 1;
			}
			
			MinMaxFinder minmax = new MinMaxFinder();
			System.out.println(Arrays.toString(MyArr));
			System.out.println("min = " + minmax.findMin(MyArr));
			System.out.println("max = " + minmax.findMax(MyArr) + "\n");
		}
	}

}
