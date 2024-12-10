package main;

import model.BusinessMan;
import model.Chef;
import model.FireMan;
import model.Police;
import model.Worker;
import state.ChefIdleState;

public class Main {

	public Main() {
//		Chef chef = new Chef("Yuki", 28);
//		
//		if(chef.getState() instanceof ChefIdleState) {
//			do {
//				chef.getState().changeState();
//			} while (chef.getState() instanceof ChefIdleState == false);
//		}
		
		
		Worker police = new Police("John", 30);
		Worker businessMan = new BusinessMan("Koto", 27);
		Worker fireMan = new FireMan("Yuki", 29);
		
		police.dailyRoutine();
		businessMan.dailyRoutine();
		fireMan.dailyRoutine();
	}

	public static void main(String[] args) {
		new Main();

	}

}
