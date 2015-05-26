import java.io.IOException;

class CashCard {
	private String number;
	private int balance;
	private int bonus;
	public CashCard(String number, int balance, int bonus){
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}

public class TestScanner {

	public static void main(String[] args) {
		/*
		boolean getATry = true;
		while(getATry){
			try {
				int input = System.in.read();
				System.out.println(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		
		String num = "123"; //�W�L127�N�|�X���F�A�]��Byte���d��
		System.out.printf("Byte:%d, Short:%d, Integer:%d, Long:%d, Float:%f, Double:%f %n", //printf��pattern
							Byte.parseByte(num),											//�n����ϥ�%n
							Short.parseShort(num),
							Integer.parseInt(num),
							Long.parseLong(num),
							Float.parseFloat(num),
							Double.parseDouble(num));
		System.out.println(Byte.MAX_VALUE + " : "+Byte.MIN_VALUE);
		String out ="12346\n";  //�@��r��n���ܤ���n�ϥ�\n
		System.out.print(out+"hi");
		CashCard cc = new CashCard("A500",100,0);
		System.out.println("\n"+cc.getNumber());
	}
}
