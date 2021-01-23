package team4_2;

public class BeverageDTO {
	
	public BeverageDTO() {}
	
	private int ameJan;
	private int latteJan;
	
	public int getAmeJan() {
		return ameJan;
	}
	
	public BeverageDTO(int ameJan, int latteJan) {
		this.ameJan = ameJan;
		this.latteJan = latteJan;
	}
	public void setAmeJan(int ameJan) {
		this.ameJan = ameJan;
	}
	public int getLatteJan() {
		return latteJan;
	}
	public void setLatteJan(int latteJan) {
		this.latteJan = latteJan;
	}
	
}
