package com.lab.common.enums;

public enum TransactionResultEnum {
	
	SUCCESS(0,"MESSAGE"),
	ERROR(-1,"ERROR");
	
	
	TransactionResultEnum(Integer value , String name){
		this.value=value;
		this.name=name;
		
	
	}
	
	private String name;
	private Integer value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
	public static boolean contains(Integer id){
		boolean contains=false;
		for(TransactionResultEnum type: TransactionResultEnum.values()){
			if(type.getValue().equals(id)){
				contains=true;
				break;
			}
		}
		return contains;
	}
}
