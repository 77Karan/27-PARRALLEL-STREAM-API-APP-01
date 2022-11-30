package pack1;

import java.util.stream.Stream;

public class MainClass
{
	public static void main(String[] args) 
	{
		
		//Serial Stream
		Stream<Integer> stream1= Stream.of(1,2,3,4,5,6,7,8,10,11,12);
		stream1.forEach(num->System.out.println(num+":::"+Thread.currentThread().getName()));
		
		System.out.println("================================================================");
		
		//Parrallel Stream
		Stream<Integer> stream2= Stream.of(1,2,3,4,5,6,7,8,10,11,12);
		stream2.parallel().forEach(num->System.out.println(num+":::"+Thread.currentThread().getName()));

		
		
	}

}
