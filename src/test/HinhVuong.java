package test;

public class HinhVuong {
	public static void main(String[] args) {
		int x=10;
		chuVi(6);//a=6
		
		chuVi(x);//a=x=10
		
		int dienTich= dienTich(x);//a=x=10
		//dienTich = dt trong ham tra ve

	}
	//khai báo hàm chuVi
		public static void chuVi(int a) {
			int cv = 4*a;
			System.out.println(cv);
			dienTich(a);
			System.out.println(dienTich(a));

	}
	//khai bao ham dien tich
		public static int dienTich(int a) {
			int dt = a*a;
			return dt;
		}
}
