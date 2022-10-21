package consumerProblemCase1;

public class Producer extends Thread{
	SharedQueue queue;
	int limit;
	public Producer(SharedQueue queue , int limit) {
		this.queue = queue;
		this.limit = limit;
	}
	@Override
	public void run() {
		int num = 0;
		while(num < limit) {
			queue.add(new MSG("msg is "));
		}
	}
}
