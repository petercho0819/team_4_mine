package team4_3;

public class BeverageDTO {
	
	public BeverageDTO() {}
	
	private int stockameJan;			// 초기 아메리카노 stock
	private int stocklatteJan;		// 초기 라떼 stock
	private int orderAmeJan;	// 아메리카노 음료 잔
	private int orderLatteJan;	// 라떼 음료 
	private String ameName;
	private String latteName;
	
	
	

	public BeverageDTO(int stockameJan, int stocklatteJan, int orderAmeJan, int orderLatteJan, String ameName,
			String latteName) {
		this.stockameJan = stockameJan;
		this.stocklatteJan = stocklatteJan;
		this.orderAmeJan = orderAmeJan;
		this.orderLatteJan = orderLatteJan;
		this.ameName = ameName;
		this.latteName = latteName;
	}
	
	public BeverageDTO(String ameName, int stockameJan, String latteName, int stocklatteJan) {
		this.stockameJan = stockameJan;
		this.stocklatteJan = stocklatteJan;
		
		this.ameName = ameName;
		this.latteName = latteName;
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

	public String getAmeName() {
		return ameName;
	}

	public void setAmeName(String ameName) {
		this.ameName = ameName;
	}

	public String getLatteName() {
		return latteName;
	}

	public void setLatteName(String latteName) {
		this.latteName = latteName;
	}

	
	@Override
	public String toString() {
		return "BeverageDTO [stockameJan=" + stockameJan + ", stocklatteJan=" + stocklatteJan + ", orderAmeJan="
				+ orderAmeJan + ", orderLatteJan=" + orderLatteJan + ", ameName=" + ameName + ", latteName=" + latteName
				+ "]";
	}

	public void AmeRemain() {
		
		int AmeRemain = stockameJan - orderAmeJan;
		
	}
	
	public void latteRemain() {
		int latteRemain = stocklatteJan - orderLatteJan;
	}
	
}
