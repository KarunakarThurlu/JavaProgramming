package keywords;

import static java.lang.Math.sqrt;

import java.util.logging.Logger;

class Emp{
	
	int eid;
	String ename;
	String orgName;
	
	
	public Emp() {
		super();
	}


	public Emp(int eid, String ename, String orgName) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.orgName = orgName;
	}


	@Override
	public String toString() {
		return " { eid=" + eid + ", ename=" + ename + ", orgName=" + orgName + " }";
	}
	
	
	
	
}

class MathUtil{
	public static int add(int a,int b) {
		return a+b;
	}
}

public class StaticKetWord {
	
	static String orgName = "TechOrg";
	
	private static  Logger logger=null;
	
	static {
		logger = Logger.getLogger(StaticKetWord.class.getName());
	}
	
	public static void main(String  ...everythingAboutStatic) {
		int n=25;
		
		double sqrt = sqrt(n);
		logger.info("Sqrt of 16 is "+sqrt);
	}
	
	
}
