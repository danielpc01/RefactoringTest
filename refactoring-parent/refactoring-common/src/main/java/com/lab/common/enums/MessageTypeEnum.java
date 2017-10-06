package com.lab.common.enums;

public enum MessageTypeEnum {
	INFO(1,"MESSAGE"),
	ERROR(2,"ERROR"),
	WARNING(3,"WARNING");
	
	MessageTypeEnum(Integer id , String name){
		this.id=id;
		this.name=name;
		
	
	}
	
	private String name;
	private Integer id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public static boolean contains(Integer id){
		boolean contains=false;
		for(MessageTypeEnum type: MessageTypeEnum.values()){
			if(type.getId().equals(id)){
				contains=true;
				break;
			}
		}
		return contains;
	}
}
