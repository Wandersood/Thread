package view;

import controller.ThreadId;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int idThread = 0;idThread<5;idThread++) {
			ThreadId threadId = new ThreadId(idThread);
			threadId.start();
		}

	}

}
