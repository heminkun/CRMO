package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class Contribute implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private String name;

	/**
	 * 
	 */
	private Integer totalPrice;


	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setTotalPrice(Integer totalPrice){
		this.totalPrice = totalPrice;
	}

	public Integer getTotalPrice(){
		return this.totalPrice;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，name:"+(name == null ? "空" : name)+"，totalPrice:"+(totalPrice == null ? "空" : totalPrice);
	}
}
