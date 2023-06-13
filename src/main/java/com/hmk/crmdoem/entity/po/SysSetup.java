package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class SysSetup implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private String rotation;


	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setRotation(String rotation){
		this.rotation = rotation;
	}

	public String getRotation(){
		return this.rotation;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，rotation:"+(rotation == null ? "空" : rotation);
	}
}
