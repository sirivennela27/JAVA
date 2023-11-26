package tnsif;

public class typeCastingProg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double discount=220;
		double finalprice = 280.50+discount;//implicit casting
		System.out.println(finalprice);
		int price=200;
		int fp=price+(int)180.9;//explicit casting
		System.out.println(fp);

	}

}
