package sccheck;
import java.util.ArrayList;

public class CanAttend {

	// precondition: An ArrayList of type ArrayList<MeetingInterval> containing Meetings with start time and end times greater than or equal to 0 and lower than 2400.
	// None of the Meetings in the list may have endtimes that come before it's start times.

	// postcondition: A Boolean expressing if overlaps between the start time of one MeetingInterval and the end time of another MeetingInterval.
	// True = There are no overlaps, False = There is at least 1 overlap.
	public static boolean canAttend(ArrayList<MeetingInterval> meetings) {
		//your implementation here
		// sort list:
		for (int i = 0; i < meetings.size()-1; i++) {
			MeetingInterval meeting = meetings.get(i);
			MeetingInterval minMeet = meeting;
			int minindex = i;
			
			for (int j = i+1; j < meetings.size(); j++) {
				MeetingInterval meeting2 = meetings.get(j);
				// System.out.println(" "+ meeting+ " " + meeting2);
				// System.out.println(meetings);
				if (meeting2.getStart() < minMeet.getStart()) {
					minMeet = meeting2;
					minindex = j;
				}
			}

			// swap
			MeetingInterval og = meetings.get(i);
			meetings.set(i, minMeet); 
			meetings.set(minindex, og); 
		}
		System.out.println(meetings);

		for (int i = 0; i < meetings.size()-1; i++) {
			MeetingInterval meeting1 = meetings.get(i);
			MeetingInterval meeting2 = meetings.get(i+1);

			if (meeting1.getEnd() >= meeting2.getStart()) return false;
		}

		System.out.println(meetings);
		return true;
	}

	public static void main(String[] args) {
		ArrayList<MeetingInterval> meet = new ArrayList<MeetingInterval>();
		for(int i =0; i<10; i++) {
			int start = (int)(Math.random()*2399);
			int end = start + ((int)(Math.random()*(2399-start)));
			meet.add(new MeetingInterval(start, end));
		}
		System.out.println(canAttend(meet) ? "There is no conflict with attending "+meet+" meetings":"Can't attend "+meet+" meetings due to conflict");
		//please include additional testing here!
	}
}