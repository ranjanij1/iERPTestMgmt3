/**
 * 
 */
package com.ibm.ierp.screen.action;


import java.util.List;

import com.ibm.ierp.screen.form.BuildingBlockForm;

/**
 * 
 * @author sriramamurthy
 *
 */
public class TestSuiteActions  {
	
	private List<BuildingBlockForm> buildingBlockForm=null;
	
	
	public String loginAction() throws Exception {
		
		//BuildingBlockDAO buildingBlockDAO = new BuildingBlockDAO();
				
	    return "builder";
	    }
	
	public String buildingBlockAction() throws Exception {
		
		//BuildingBlockDAO buildingBlockDAO = new BuildingBlockDAO();
				
	    return "success";
	    }
	public String buildingBlockAddAction() throws Exception {
		
		//BuildingBlockDAO buildingBlockDAO = new BuildingBlockDAO();
				
	    return "success";
	    }
	public String initialAction() throws Exception {
		//BuildingBlockDAO buildingBlockDAO = new BuildingBlockDAO();
		System.out.println(" *** initialAction **** ");	
	    return "login";
	    }
}
