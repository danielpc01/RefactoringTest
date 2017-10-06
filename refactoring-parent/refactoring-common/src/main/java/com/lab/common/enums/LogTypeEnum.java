package com.lab.common.enums;

public enum LogTypeEnum {
	CONSOLE(1,"CONSOLE"),
	FILE(2,"FILE"),
	DATABASE(3,"DATABASE");
	
	LogTypeEnum(Integer id , String name){
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
		for(LogTypeEnum type: LogTypeEnum.values()){
			if(type.getId().equals(id)){
				contains=true;
				break;
			}
		}
		return contains;
	}
	
	public static LogTypeEnum get(Integer id){
		
		for(LogTypeEnum type: LogTypeEnum.values()){
			if(type.getId().equals(id)){
				return type;
			}
		}
		return null;
		
	}
}
