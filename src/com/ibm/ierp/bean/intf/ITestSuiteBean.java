/**
 * 
 */
package com.ibm.ierp.bean.intf;

import java.util.ArrayList;

/**
 * @author himagraw
 *
 */
public interface ITestSuiteBean {
	public int getId() ;
	/**
	 * @param id the id to set
	 */
	public void setId(int id) ;
	/**
	 * @return the name
	 */
	public String getName() ;
	/**
	 * @param name the name to set
	 */
	public void setName(String name) ;
	/**
	 * @return the description
	 */
	public String getDescription() ;
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) ;
	/**
	 * @return the owner
	 */
	public String getOwner() ;
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) ;
	/**
	 * @return the areaOwned
	 */
	public String getAreaOwned() ;
	/**
	 * @param areaOwned the areaOwned to set
	 */
	public void setAreaOwned(String areaOwned) ;
	/**
	 * @return the assignedTo
	 */
	public String getAssignedTo() ;
	/**
	 * @param assignedTo the assignedTo to set
	 */
	public void setAssignedTo(String assignedTo) ;
	/**
	 * @return the status
	 */
	public String getStatus() ;
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) ;
	public ArrayList getTestCase() ;
	/**
	 * @param testCase the testCase to set
	 */
	public void setTestCase(ArrayList testCase) ;
}
