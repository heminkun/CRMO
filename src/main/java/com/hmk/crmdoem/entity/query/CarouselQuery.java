package com.hmk.crmdoem.entity.query;



/**
 * 
 * 参数
 * 
 */
public class CarouselQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private String name;

	private String nameFuzzy;

	/**
	 * 
	 */
	private String hash;

	private String hashFuzzy;

	/**
	 * 
	 */
	private String path;

	private String pathFuzzy;


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

	public void setNameFuzzy(String nameFuzzy){
		this.nameFuzzy = nameFuzzy;
	}

	public String getNameFuzzy(){
		return this.nameFuzzy;
	}

	public void setHash(String hash){
		this.hash = hash;
	}

	public String getHash(){
		return this.hash;
	}

	public void setHashFuzzy(String hashFuzzy){
		this.hashFuzzy = hashFuzzy;
	}

	public String getHashFuzzy(){
		return this.hashFuzzy;
	}

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return this.path;
	}

	public void setPathFuzzy(String pathFuzzy){
		this.pathFuzzy = pathFuzzy;
	}

	public String getPathFuzzy(){
		return this.pathFuzzy;
	}

}
