package org.smart.domain;

public class Option {

	private Integer id;
	private Integer tid;
	private String name;
	private Integer count;
	
	public Option() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Option [id=" + id + ", tid=" + tid + ", name=" + name + ", count=" + count + "]";
	}
	
	
	
	
}
