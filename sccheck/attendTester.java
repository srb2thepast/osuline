package sccheck;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class attendTester {

    @Test
    void TestDifference() {
        ArrayList<MeetingInterval>  test = new ArrayList<MeetingInterval> ();
        test.add(new MeetingInterval(0, 50));
        test.add(new MeetingInterval(51, 90));
        assertTrue(CanAttend.canAttend(test)==true); 
    }

    @Test
    void TestDifferenceAbove0() {
        ArrayList<MeetingInterval>  test = new ArrayList<MeetingInterval> ();
        test.add(new MeetingInterval(30, 50));
        test.add(new MeetingInterval(51, 90));
        assertTrue(CanAttend.canAttend(test)==true); 
    }

    @Test
    void TestDifferenceAbove0Swapped() {
        ArrayList<MeetingInterval>  test = new ArrayList<MeetingInterval> ();
        test.add(new MeetingInterval(51, 90));
        test.add(new MeetingInterval(30, 50));
        assertTrue(CanAttend.canAttend(test)==true); 
    }

    @Test
    void TestSameEnd() {
        ArrayList<MeetingInterval>  test = new ArrayList<MeetingInterval> ();
        test.add(new MeetingInterval(0, 51));
        test.add(new MeetingInterval(51, 90));
        assertTrue(CanAttend.canAttend(test)==false); 
    }

    @Test
    void TestSameStart() {
        ArrayList<MeetingInterval>  test = new ArrayList<MeetingInterval> ();
        test.add(new MeetingInterval(0, 51));
        test.add(new MeetingInterval(0, 90));
        assertTrue(CanAttend.canAttend(test)==false); 
    }

    @Test
    void TestOverlap() {
        ArrayList<MeetingInterval>  test = new ArrayList<MeetingInterval> ();
        test.add(new MeetingInterval(20, 50));
        test.add(new MeetingInterval(30, 40));
        assertTrue(CanAttend.canAttend(test)==false); 
    }

    @Test
    void TestDesmosIntersection() {
        ArrayList<MeetingInterval>  test = new ArrayList<MeetingInterval> ();
        test.add(new MeetingInterval(23, 87));
        test.add(new MeetingInterval(4, 100));
        assertTrue(CanAttend.canAttend(test)==false); 
    }

    @Test
    void TestLargeTableGood() {
        ArrayList<MeetingInterval>  test = new ArrayList<MeetingInterval> ();
        test.add(new MeetingInterval(1, 2));
        test.add(new MeetingInterval(3, 4));
        test.add(new MeetingInterval(5, 6));
        test.add(new MeetingInterval(7, 8));
        test.add(new MeetingInterval(9, 10));
        test.add(new MeetingInterval(11, 12));
        test.add(new MeetingInterval(13, 14));
        test.add(new MeetingInterval(15, 16));
        test.add(new MeetingInterval(17, 18));
        assertTrue(CanAttend.canAttend(test)==true); 
    }

    @Test
    void TestLargeTableOverlap() {
        ArrayList<MeetingInterval>  test = new ArrayList<MeetingInterval> ();
        test.add(new MeetingInterval(1, 2));
        test.add(new MeetingInterval(3, 4));
        test.add(new MeetingInterval(5, 6));
        test.add(new MeetingInterval(7, 8));
        test.add(new MeetingInterval(6, 10));
        test.add(new MeetingInterval(11, 12));
        test.add(new MeetingInterval(13, 14));
        test.add(new MeetingInterval(15, 16));
        test.add(new MeetingInterval(17, 18));
        assertTrue(CanAttend.canAttend(test)==false); 
    }
}
