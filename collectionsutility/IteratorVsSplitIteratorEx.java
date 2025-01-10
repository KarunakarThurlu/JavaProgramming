package collectionsutility;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.StreamSupport;

public class IteratorVsSplitIteratorEx {
	
	public static void main(String ... splitIterator) {
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
		
		Spliterator<Integer> spliterator = list.spliterator();
		Spliterator<Integer> spliteratorTwo = spliterator.trySplit();
		Spliterator<Integer> spliteratorThree = spliterator.trySplit();
		
//		System.out.println(spliterator.estimateSize());
//		System.out.println(spliteratorTwo.estimateSize());
//		System.out.println(spliteratorThree.estimateSize());
		
		Integer processR1 = process(spliterator);
		Integer processR2 = process(spliteratorTwo);
		Integer processR3 = process(spliteratorThree);
		System.out.println(processR1 +" "+" "+processR2+" "+processR3);
		
	}	
	
	private static Integer process(Spliterator<Integer> spliterator) {
		System.out.println("-------------------------------------");
		System.out.println(Spliterator.ORDERED);
		System.out.println(Spliterator.SIZED);
		System.out.println(Spliterator.IMMUTABLE);
		System.out.println(Spliterator.CONCURRENT);
		System.out.println(Spliterator.SORTED);
		
		System.out.println("-------------------------------------");
		
		System.out.println(spliterator.estimateSize());
		return StreamSupport.stream(spliterator, true).map(e -> {
			System.out.println(Thread.currentThread().getName());
			return e * 2;
		}).reduce(0, (total, currentElement) -> total + currentElement);
	}
	
}
