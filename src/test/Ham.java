package test;

public class Ham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// goi cac ham trong ham main
		int x=20;
		int y=12;
		
		//khai bao hieu= gan gia tri bang ham tra ve
		int hieu = hieuHaiSo(x, y);
		System.out.println(hieu);
		System.out.println(tongHaiSo());
		xinChao();
		
		float chuViHinhTron = soPi()*2;
		System.out.println(chuViHinhTron);
	}

	public static int tongHaiSo() {  //tao ham
		int x = 10;
		int y = 15;
		int tong = x + y;
		return tong;
	}

// ham voi doi so truyen vao
	public static int hieuHaiSo(int x, int y) {
		int hieu = x - y;
		return hieu;
	}
//ham khong co gia tri tra ve
	public static void xinChao() {
	System.out.println("xin chao");
	}
	public static float soPi() {
		return 3.14f;
	}
}


