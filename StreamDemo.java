package divya.advancedjavaconcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String args[]) {
		
		List<Integer> number = Arrays.asList(100,200,200,300,300,400,400,500,500,600,700,800,900,900,491,491,3,3,7,7,9,9);
		
		//getting disticnt elements
		List<Integer> distinctNumbers=number.stream().map(i->i).distinct().collect(Collectors.toList());
		System.out.println("Getting disticnt elements:"+distinctNumbers);
		//distinctNumbers.forEach(y->System.out.println(y));
		
		//List of even numbers
		List<Integer> evenNumbers = number.stream().distinct().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even numbers:" + evenNumbers);
		//evenNumbers.forEach(y->System.out.println(y));
		
		//Sum of even numbers
		int evenNumberSum = evenNumbers.stream().map(i->i).reduce(0,(ans,i)->ans+i);
		System.out.println("Sum of the even numbers:"+evenNumberSum);
		//evenNumberSum.forEach(y->System.out.println(y));
		
		//List of odd numbers
		List<Integer> oddNumbers = number.stream().distinct().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println("Odd Numbers:" + oddNumbers);
		//oddNumbers.forEach(y->System.out.println(y));
		
		//sum of odd numbers
		int oddNumberSum = oddNumbers.stream().map(i->i).reduce(0,(ans,i)->ans+i);
		System.out.println("Sum of odd numbers:"+oddNumberSum);
		//oddNumberSum.forEach(y->System.out.println(y));
		
		//Sum of all numbers
		int sumOfNumbers = number.stream().map(i->i).reduce(0,(ans,i)->ans+i);
		System.out.println("Sum of Numbers:"+sumOfNumbers);
		//sumOfNumbers.forEach(y->System.out.println(y));
		
		//Getting square of the numbers
		List<Integer> squareNumber = number.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println("Getting square of the numbers:"+squareNumber);
		//squareNumber.forEach(y->System.out.println(y));
		
		//Getting square from distinct numbers list
		List<Integer> squareNumber1 = distinctNumbers.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println("Getting square from distinct numbers list:"+squareNumber1);
		//squareNumber1.forEach(y->System.out.println(y));

		//Getting the name list that starts with P
		List<String> nameList = Arrays.asList("Divya","Deepthi","Adhvik","Prabhu","Preetha","Deeksha","Suresh","Prakash","Kokila");
		List<String> nameStartsWithP = nameList.stream().filter(i->i.startsWith("P")).collect(Collectors.toList());
		System.out.println("Getting the name list that starts with P:"+nameStartsWithP);
		//nameStartsWithP.forEach(y->System.out.println(y));
		
	}

}
