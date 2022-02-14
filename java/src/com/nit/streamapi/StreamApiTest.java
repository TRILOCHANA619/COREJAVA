package com.nit.streamapi;


import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class StreamApiTest {

	public static void main(String[] args) {
		List<Integer> list1=List.of(15, 12, 18, 2, 5, 20, 8, 3, 9, 6);
		List<String> list2=List.of("Asit","papu","bibhu","bani");
		
		//operation on stream api
		
		System.out.println(list1.stream().map((x)->x*x).collect(Collectors.toList()));
		System.out.println(list1.stream().filter((x)->x>10).collect(Collectors.toList()));
		System.out.println(list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println(list1.stream().sorted((x,y)->x-y).collect(Collectors.toList()));
		System.out.println(list1.stream().sorted((x,y)->y-x).collect(Collectors.toList()));
		
		
		Spliterator<String> split=list2.spliterator();
		//split.forEachRemaining(System.out::println);
		Spliterator<String> split2=split.trySplit();
		split.forEachRemaining(System.out::println);
		split2.forEachRemaining(System.out::println);
		

	}

}
