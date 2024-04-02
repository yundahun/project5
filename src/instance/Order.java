package instance;

public class Order {

	int orderNumber;

	String orderDate;

	String name;

	String address;

	public void showOrderInfo() {

		System.out.println("주문번호:" + orderNumber + ", 주문날짜:" + orderDate + ", 주문자이름:" + name + ", 배송지:" + address);
	}
}
