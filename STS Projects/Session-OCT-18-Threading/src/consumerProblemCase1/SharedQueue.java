package consumerProblemCase1;

import java.util.ArrayList;
import java.util.Queue;

public class SharedQueue {
	ArrayList<MSG> list = new ArrayList<MSG>();
	public static Integer counter;


	public void add(MSG msg) {
		list.add(msg);
	}

	public void remove() {
		try {
			list.remove(0);			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
