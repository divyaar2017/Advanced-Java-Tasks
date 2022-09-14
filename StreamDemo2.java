package divya.advancedjavaconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo2 {
	
public static void main(String args[]) {
		
		List<Country1> cntry = new ArrayList<>();
		
		cntry.add(new Country1("ABW","Aruba",78.4f));
		cntry.add(new Country1("AFG","Afganistan",45.9f));
		cntry.add(new Country1("AGO","Angola",38.3f));
		cntry.add(new Country1("AIA","Anguilla",76.1f));
		cntry.add(new Country1("ALB","Albania",71.6f));
		cntry.add(new Country1("AND","Andorra",83.5f));
		cntry.add(new Country1("ANT","Netherlands Antilles",74.7f));
		cntry.add(new Country1("ARE","United Arab Nations",74.1f));
		cntry.add(new Country1("ARG","Argentina",75.1f));
		cntry.add(new Country1("ARM","Armenia",66.4f));
		
		cntry.stream().filter(c->c.lifeExpectancy >= 76.0).
		forEach(c->System.out.println(c.name));
		
		float totalLifeExpectancy = cntry.stream().map(c->c.lifeExpectancy).reduce(0.0f,Float::sum);
		System.out.println("Total Life Expectancy : " + totalLifeExpectancy);
		
		System.out.println("Maximum life expectancy:" + cntry.stream().map(c->c.lifeExpectancy).reduce(0.0f,Float:: max));
		System.out.println("Minimum life expectancy:" + cntry.stream().map(c->c.lifeExpectancy).reduce(0.0f,Float:: min));
        System.out.println("Count of life expectancy greater than 76 :" + cntry.stream().filter(c->c.lifeExpectancy >=76.0).count());
		
		//function inside Collector()
        
        System.out.println("Summing double function:" + cntry.stream().collect(Collectors.summingDouble(c->c.lifeExpectancy)));
        
        Map<String, String> clist = cntry.stream().collect(Collectors.toMap(c->c.code , c->c.name));
        Map<Object, Object> clist1 = cntry.stream().collect(Collectors.toMap(c->c.name , c->c.lifeExpectancy));
        
        
        
       System.out.println("Print from Map : " + clist);
       System.out.println("Print from Map : " + clist1);
       
       
}

}
