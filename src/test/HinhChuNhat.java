package test;

public class HinhChuNhat {
	public static void main(String[] args) {
		chuVi(1, 2);// a=1, b=2 ham1
		chuVi(2.5f, 3);// a=2.5, b=3  ham2
		chuVi(3.96d, 4);//a= 3.9678, b=4  ham3
		chuVi(1, 3, false);//ham4
	}

	public static void chuVi(int a, int b) {
		int cv = (a + b) * 2;
		System.out.println("ham1: "+ cv);
	}

//overload ham trong Java: tên hàm giống nhau nhưng kiểu dữ liệu khác nhau
	public static void chuVi(float a, int b) {
		float cv = (a + b) * 2;
		System.out.println("ham2: "+ cv);
	}

	public static void chuVi(double a, int b) {
		double cv = (a + b) * 2;
		System.out.println("ham3: "+ cv);
	}
	// overload kieu thu 2: khác nhau về số lượng tham số của hàm
	public static void chuVi(int a, int b, boolean check) {
		int cv = (a + b) * 2;
		System.out.println("ham4: "+ cv);
	}
}
