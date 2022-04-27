package nhiphan;
public class De_quy_thap_HN {
	void Hanoi(int n,String A,String B,String C) {
		if(n==1)System.out.println("Chuyen 1 dia tu "+A+" sang "+C);
		else {
			Hanoi(n-1,A,C,B);
			Hanoi(1,A,B,C);
			Hanoi(n-1,B,A,C);
		}
	}
	//code nay ok
	public static void main(String[] args) {
		De_quy_thap_HN m=new De_quy_thap_HN();
		m.Hanoi(4, "A", "B", "C");
	}
}