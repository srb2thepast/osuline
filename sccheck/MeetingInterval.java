package sccheck;

public class MeetingInterval {
	private int startTime;
	private int endTime;
	
	//precondition: 
	//postcondition: 
	public MeetingInterval(int myStart, int myEnd) {
		startTime = myStart;
		endTime = myEnd;
	}

	//precondition: 
	//postcondition: 
	public int getStart() {
		return startTime;
	}

	//precondition: 
	//postcondition: 
	public int getEnd() {
		return endTime;
	}

	//precondition: 
	//postcondition: 
	public String toString() {
		return "["+startTime+"]["+endTime+"]";
	}
}
