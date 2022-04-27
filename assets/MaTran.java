import java.util.Random;
import java.util.Scanner;
public class MaTran {
	int [][]a; int m,n;
	void nhap() 
	{
		Scanner kb= new Scanner(System.in);
		System.out.println(" nhap so dong : "); m= kb.nextInt();
		System.out.println(" nhap so cot : "); n= kb.nextInt();
		Random rd= new Random();
		a= new int[m][n];
		for( int i=0; i<m; i++)
			for( int j=0; j<n; j++)
				a[i][j] = rd.nextInt()%3;
	}
	void in() 
	{
		for( int i=0; i<m; i++)
		{
			System.out.println();
			for( int j=0; j<n; j++)
				System.out.format("%5d", a[i][j]);
		}
	}
	MaTran nhan(MaTran b) 
	{
		MaTran t= new MaTran();
		if( n!= b.m) System.out.println("\n khong nhan duoc hai ma tran nay!!!");
		else 
		{
			t.m=m; t.n= b.n;
			t.a= new int[m][b.n];
			for(int i=0; i<m; i++)
				for( int j=0; j<b.n; j++)
				{
					int h=0;
					for( int q=0; q<n; q++)
						h=h+ a[i][q] * b.a[q][j];
						t.a[i][j] = h;
			}
		}
		return t;
	}
	public static void main(String[] args) {
		MaTran m= new MaTran();
		MaTran b= new MaTran();
		m.nhap(); b.nhap();
		MaTran c= m.nhan(b);
		m.in(); b.in(); c.in();
	}
}