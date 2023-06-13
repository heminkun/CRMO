package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class Carousel implements Serializable {


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
	private String hash;

	/**
	 * 
	 */
	private String path;

	public Carousel(String name,String hash,String path){
		this.name=name;
		this.hash=hash;
		this.path=path;
	}


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

	public void setHash(String hash){
		this.hash = hash;
	}

	public String getHash(){
		return this.hash;
	}

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return this.path;
	}

	@Override
	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，name:"+(name == null ? "空" : name)+"，hash:"+(hash == null ? "空" : hash)+"，path:"+(path == null ? "空" : path);
	}
}
