/**
 * 
 */
package com.ibm.ierp.bean.impl;

import java.io.Serializable;

import com.ibm.ierp.bean.intf.ITestCaseBean;

/**
 * @author himagraw
 *
 */
public class TestCaseBean implements Serializable, ITestCaseBean {
	private int id;
	private String name;
	private String description;
	private String owner;
	private String areaOwned;
	private String assignedTo;
	private String status;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * @return the areaOwned
	 */
	public String getAreaOwned() {
		return areaOwned;
	}
	/**
	 * @param areaOwned the areaOwned to set
	 */
	public void setAreaOwned(String areaOwned) {
		this.areaOwned = areaOwned;
	}
	/**
	 * @return the assignedTo
	 */
	public String getAssignedTo() {
		return assignedTo;
	}
	/**
	 * @param assignedTo the assignedTo to set
	 */
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}



}
