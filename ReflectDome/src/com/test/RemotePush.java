package com.test;

public class RemotePush {

	private String id;
	private String name;
	public RemotePush() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RemotePush [id=" + id + ", name=" + name + "]";
	}
	public RemotePush(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
