package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.Lift;

public class LiftTest {
	
	
	 @Test
	    public void testTopFloorThree() {
	        Lift lift = new Lift(3);
	        assertEquals(3, lift.getTopFloor());
	        System.out.println(lift.getCurrentFloor());
	        lift.goUp();
	        lift.goUp();
	        assertEquals(2, lift.getCurrentFloor());
	        lift.goUp();
	        assertEquals(3, lift.getCurrentFloor());
	    }
	    
	    

	    @Test
	    public void testCurrentFloor() {
	        Lift lift = new Lift(5);
	        lift.goUp();
	        assertEquals(1, lift.getCurrentFloor());
	    }
	   
	    
	  
	    @Test
	    public void testRidersOne() {
	    	Lift lift = new Lift(1, 2);
	    	assertEquals(0, lift.getNumRiders());
	    	assertEquals(2, lift.getCapacity());
	    	assertFalse(lift.isFull());
	    	lift.addRiders(2);
	    	assertTrue(lift.isFull());
	    	assertEquals(2, lift.getNumRiders());
	    }

	  
	    @Test
	    public void testRidersTwo() {
	    	Lift lift = new Lift(7, 8);
	    	lift.addRiders(9);
	    	assertEquals(8, lift.getNumRiders());
	    }
	    
	    @Test
	    public void testDoNotGoDownInGroundFloor() {
	    	Lift lift = new Lift(2, 3);
	    	lift.goDown();
	    	assertEquals(0, lift.getCurrentFloor());
	    	
	    }
	    
	    @Test
	    public void testGoDown() {
	    	Lift lift = new Lift(2, 3);
	    	lift.goUp();
	    	assertEquals(1, lift.getCurrentFloor());
	    	lift.goDown();
	    	assertEquals(0, lift.getCurrentFloor());    	
	    }
	    
	    @Test
	    public void testCall() {
	    	Lift lift = new Lift(4, 5);
	    	lift.call(5);
	    	assertEquals(0, lift.getCurrentFloor());
	    	lift.call(4);
	    	assertEquals(4, lift.getCurrentFloor());
	    	
	    }	
	    
	    @Test
	    public void testCallDown() {
	    	Lift lift = new Lift(5, 6);
	    	lift.goUp();
	    	assertEquals(1, lift.getCurrentFloor());
	    	lift.call(0);
	    	assertEquals(0, lift.getCurrentFloor());
	    	
	    }
	    
	    @Test
	    public void testRiderBoundary() {
	    	Lift lift = new Lift(7, 8);
	    	lift.addRiders(7);
	    	assertEquals(7, lift.getNumRiders());
	    	lift.addRiders(6);
	    	assertEquals(8, lift.getNumRiders());
	    }
	    
	}

