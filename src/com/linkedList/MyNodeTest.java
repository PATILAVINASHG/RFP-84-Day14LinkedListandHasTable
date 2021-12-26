package com.linkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
	
	@Test
	public void given3NumbersWhenLinkedShouldpassedMyNodeTest() {
		INode<Integer> myFirstNode = new MyNode<Integer>(56);
		INode<Integer> mySecondNode = new MyNode<Integer>(30);
		INode<Integer> myThirdNode = new MyNode<Integer>(70);

		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		
		boolean result = myFirstNode.getNext().equals(mySecondNode)&& 
				mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);

	}
	
}