package team4_3;

public class BeverageDTO {
	
	public BeverageDTO() {}
	
	static int stockameJan;			// 초기 아메리카노 stock
	static int stocklatteJan;		// 초기 라떼 stock
	static int orderAmeJan;	// 아메리카노 음료 잔
	static int orderLatteJan;	// 라떼 음료 
	@Override
	public String toString() {
		return "BeverageDTO [stockameJan=" + stockameJan + ", stocklatteJan=" + stocklatteJan + ", orderAmeJan="
				+ orderAmeJan + ", orderLatteJan=" + orderLatteJan + "]";
	}
	public int getStockameJan() {
		return stockameJan;
	}
	public void setStockameJan(int stockameJan) {
		this.stockameJan = stockameJan;
	}
	public int getStocklatteJan() {
		return stocklatteJan;
	}
	public void setStocklatteJan(int stocklatteJan) {
		this.stocklatteJan = stocklatteJan;
	}
	public int getOrderAmeJan() {
		return orderAmeJan;
	}
	public void setOrderAmeJan(int orderAmeJan) {
		this.orderAmeJan = orderAmeJan;
	}
	public int getOrderLatteJan() {
		return orderLatteJan;
	}
	public void setOrderLatteJan(int orderLatteJan) {
		this.orderLatteJan = orderLatteJan;
	}
	public BeverageDTO(int stockameJan, int stocklatteJan, int orderAmeJan, int orderLatteJan) {
		this.stockameJan = stockameJan;
		this.stocklatteJan = stocklatteJan;
		this.orderAmeJan = orderAmeJan;
		this.orderLatteJan = orderLatteJan;
	}

	public void AmeRemain() {
		
		int AmeRemain = stockameJan - orderAmeJan;
		
	}
	
	public void latteRemain() {
		int latteRemain = stocklatteJan - orderLatteJan;
	}
	
}
