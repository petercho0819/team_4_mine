package team4_2;

public class BeverageDTO {
	
	public BeverageDTO() {}
	
	private int ameJan;			// 초기 아메리카노 stock
	private int latteJan;		// 초기 라떼 stock
	private int orderAmeJan;	// 아메리카노 음료 잔
	private int orderLatteJan;	// 라떼 음료 
	@Override
	public String toString() {
		return "BeverageDTO [ameJan=" + ameJan + ", latteJan=" + latteJan + ", orderAmeJan=" + orderAmeJan
				+ ", orderLatteJan=" + orderLatteJan + "]";
	}
	public int getAmeJan() {
		return ameJan;
	}
	public int getLatteJan() {
		return latteJan;
	}
	public int getOrderAmeJan() {
		return orderAmeJan;
	}
	public int getOrderLatteJan() {
		return orderLatteJan;
	}
	public BeverageDTO(int ameJan, int latteJan, int orderAmeJan, int orderLatteJan) {
		this.ameJan = ameJan;
		this.latteJan = latteJan;
		this.orderAmeJan = orderAmeJan;
		this.orderLatteJan = orderLatteJan;
	}
	
	
}
