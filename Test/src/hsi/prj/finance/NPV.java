package hsi.prj.finance;
class Ott{
	int annualRevenue;
	int monRevenue = annualRevenue/12;
	float discountRate;
	int durationTime;  //month
	int number;
	public Ott(int annualRevenue, float discountRate, int durationTime) {
		super();
		this.annualRevenue = annualRevenue;
		this.discountRate = discountRate;
		this.durationTime = durationTime;
		this.number = this.monRevenue / 69; //ª½±µ¥h§À
	}
	public Ott(int annualRevenue, int durationTime) {
		super();
		this.annualRevenue = annualRevenue;
		this.durationTime = durationTime;
	}/*
	public Ott() {
		//super();
		//this.annualRevenue = 5000;
		//this.discountRate = (float) 0.8;
		this.durationTime = 36;
		this.monRevenue = this.annualRevenue/12;
	}*/
	
}
public class NPV {
	public static int calNPV(Ott obj){
		int result =0;
		for(int i =1;i<=obj.durationTime;i++){
			//obj.number *=1.3;
			//(obj.number*0.3*69)/();
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			NPV.calNPV(new Ott(5000,(float) 0.8,36));
	}

}
