package com.javaex.phone;

public class PhoneVo {
	//필드
	private int personid;
	private String name;
	private String hp;
	private String company;
	//생성자
	public PhoneVo() {
		super();
	}
	public PhoneVo(int personid, String name, String hp, String company) {
		this.personid = personid;
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	public PhoneVo(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	public PhoneVo(int personid) {
		super();
		this.personid = personid;
	}
	//메소드 
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	//메소드 일반
	
}
