package day07;
class Product{
	static int count = 0;
	int serialNo;
	
	//instance 초기화 블럭`
	{++count;
	serialNo= count;
			
	}
	public Product() {
		
	}
}


public class Ex12 {

	public static void main(String[] args) {
Product p1 = new Product();
Product p2 = new Product();
Product p3 = new Product();


System.out.println("p1의 제품번호는 " + p1.serialNo);
System.out.println("p2의 제품번호는 " + p2.serialNo);
System.out.println("p3의 제품번호는 " + p3.serialNo);

System.out.println("생산된 제품의 개수는 " + Product.count + "개");
	}

}
