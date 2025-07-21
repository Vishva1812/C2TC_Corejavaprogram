package day1.entity;

public class customerdemo {

	public static void main(String[] args) {
		customer c1=new customer();
		c1.cid=101;
		c1.cname="raja";
		c1.city="puducherry";
		System.out.println("customer id:"+c1.cid);
		System.out.println("customer name:"+c1.cname);
		System.out.println("customer city:"+c1.city);
		
		
		customer c2=new customer();
		c2.cid=102;
		c2.cname="arjun";
		c2.city="puducherry";
		System.out.println("customer id:"+c2.cid);
		System.out.println("customer name:"+c2.cname);
		System.out.println("customer city:"+c2.city);

	}

}
