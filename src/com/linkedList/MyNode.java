package com.linkedList;

public class MyNode<K> implements INode<K> {

	private K key ;
	private INode<K> next;
	
	public MyNode(K key) {
		this.key = key;
		next = null;
	}

	@Override
	public K getKey() {
		return key ;
	}

	@Override
	public void setkey(K value ) {
			this.key = value;
				
	}

	@Override
	public INode<K> getNext() {
		
		return next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = next;
		
	}

	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("MyNode{key=").append(key).append("}");
		if (next != null) {
			builder.append("->").append(next);
		}
		return builder.toString();
	}

}
