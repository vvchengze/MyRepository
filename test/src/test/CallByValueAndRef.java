package test;

public class CallByValueAndRef {

	public static void main(String[] args) {
		int i = 10;
		CallByValueAndRef call = new CallByValueAndRef();
		call.setVal(i);
		System.out.println(i);
		
		StringBuffer s1 = new StringBuffer("abc");
		System.out.println(s1);
		call.setVal(s1);
		System.out.println(s1);
	}
	
	public void setVal (int i) {
		i=20;
	}
	
	public void setVal(StringBuffer s) {
		s.append("ccc");
		System.out.println("==="+s);
	}
}
