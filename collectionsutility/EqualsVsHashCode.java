package collectionsutility;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsVsHashCode {

	public static void main(String... whatIsContractBetweenEqualsAndHashCode) {
		/*
		 * What is contract between equals and hashCode:
		 * -------------------------------------------- 
		 * If two objects are equal according to the equals() method, they must have same hash code returned by the hashCode() method
		 *
		 *
		 * Notes: 
		 * ----- 
		 * 1. if two objects have the same hash code, they are not necessarily equal according to the equals() method.
		 * 2. However, it is desirable to have the equals() method verify their equality in such cases.
		 *
		 */
		
		String s1=new String("Programming");
		String s2=new String("Programming");
		String s3=new String("Programming");
		
		Set<String> set=new HashSet<>();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println("Size of String HashSet : "+set.size());
		System.out.println("S1 and S2 are Equal    : "+ s1.equals(s2));
		System.out.println("S1 hashCode            : "+ s1.hashCode());
		System.out.println("S2 hashCode            : "+ s2.hashCode());
		
		System.out.println("-----------------------------------");
		
		Product p1 =new Product(1,"Laptop");
		Product p2 =new Product(1,"Laptop");
		
		Set<Product> ps=new HashSet<>();
		ps.add(p1);
		ps.add(p2);
		System.out.println("Size of Product HashSet : "+ps.size());
		System.out.println("P1 and P2 are Equal     : "+ p1.equals(p2));
		System.out.println("P1 hashCode             : "+ p1.hashCode());
		System.out.println("P2 hashCode             : "+ p2.hashCode());
		
	}
	

}

class Product{
	private Integer pId;
	private String pName;
	
	public Product() {
		super();
	}

	public Product(Integer pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public boolean equals(Object obj) {
		//Identity Check
		if(this==obj)
			return true;
		
		//Null check and Class check
		if(obj==null || getClass()!=obj.getClass())
			return false;
		
		//Internal State checking
		Product p =(Product)obj;
		return p.pId.equals(this.pId) && p.pName.equals(this.pName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pId,pName);
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + "]";
	}
	
	
	
	
}



