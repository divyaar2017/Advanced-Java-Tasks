package divya.advancedjavaconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
	
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

	
	
	//normal
	List<Float> lifeExpList = new ArrayList<>();
	for(Country1 cnt:cntry) {
		
	 if(cnt.lifeExpectancy>=76.0) {
		 lifeExpList.add(cnt.lifeExpectancy);
		 System.out.println("Print from normal way : "+cnt.code + " " + cnt.name +" "+ cnt.lifeExpectancy);
	 }
	}
	
	//System.out.println(lifeExpList);

	//Stream demo
	
	List<Float> lifeExpStreamList = cntry.stream().filter(c->c.lifeExpectancy >= 76.0)
	           .map(c->c.lifeExpectancy).collect(Collectors.toList());
	
	
	
	cntry.stream().filter(c->c.lifeExpectancy >= 76.0).
	forEach(c->System.out.println("Print from Stream: " + c.code+" "+c.name+" "+c.lifeExpectancy));
	
	System.out.println(lifeExpStreamList);
	
	}
}
