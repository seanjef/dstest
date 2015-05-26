package hsi.com;

public class TortoiseHareRace {

	public static void main(String[] args) throws InterruptedException {
		boolean [] flags = {true,false};
		int totalStep = 30;
		int tortoiseStep = 0;
		int hareStep =0;
		System.out.println("Race Start!");
		while(tortoiseStep<totalStep && hareStep<totalStep){
			Thread.sleep(1000);
			tortoiseStep++;
			System.out.printf("tortoise's %d step",tortoiseStep);
			boolean isHareStep = flags[(int)(Math.random()*10) %2];
			if(isHareStep){
				System.out.println("Hare is sleeping");
			}else{
				hareStep+=2;
				System.out.printf("Hare's %d step",hareStep);
			}
		}
		
		
	}

}
