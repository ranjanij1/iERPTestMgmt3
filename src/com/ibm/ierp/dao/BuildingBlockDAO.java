/**
 * 
 */
package com.ibm.ierp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ibm.ierp.bean.impl.TestCaseBean;
import com.ibm.ierp.bean.impl.TestSuiteBean;
import com.ibm.ierp.bean.intf.ITestSuiteBean;

/**
 * @author himagraw
 *
 */
public class BuildingBlockDAO {
	public Connection createConnection(){
		Connection con = null; 
		try{

			try {
				Class.forName("com.mysql.jdbc.Driver");  
				con =DriverManager.getConnection(  
						"jdbc:mysql://us-cdbr-iron-east-04.cleardb.net:3306/ad_b885abaec1597a6","b7882338407193","3a1f0097"); 

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	public void insertTestSuite(ITestSuiteBean testSuiteBean){
		Connection con=createConnection();
		try {

			String querytoInsert="insert into test_suites_details(test_suite_name,test_suite_desc,test_suite_owner,"
					+ "test_suite_area_owned,test_suite_assigned_to,test_suite_status) "
					+ "values (?,?,?,?,?,?)";
			PreparedStatement preparedStmt = con.prepareStatement(querytoInsert);
			preparedStmt.setString (1, testSuiteBean.getName());
			preparedStmt.setString (2, testSuiteBean.getDescription());
			preparedStmt.setString  (3, testSuiteBean.getOwner());
			preparedStmt.setString(4, testSuiteBean.getAreaOwned());
			preparedStmt.setString(5, testSuiteBean.getAssignedTo());
			preparedStmt.setString(6, testSuiteBean.getStatus());
			preparedStmt.execute();	
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	public ArrayList retriveTestSuites(){
		Connection con=createConnection();
		ArrayList testSuiteList = new ArrayList<ITestSuiteBean>();
		try {
			Statement stmt=con.createStatement();

			ResultSet rs=stmt.executeQuery("select * from test_suites_details"); 

			while(rs.next()){
				int id = rs.getInt("test_suite_id");
				String name = rs.getString("test_suite_name");
				String description = rs.getString("test_suite_desc");
				String owner = rs.getString("test_suite_owner");
				String areaOwned = rs.getString("test_suite_area_owned");
				String assignedTo = rs.getString("test_suite_assigned_to");
				String status = rs.getString("test_suite_status");
				ITestSuiteBean testSuiteBean = new TestSuiteBean();
				testSuiteBean.setId(id);
				testSuiteBean.setName(name);
				testSuiteBean.setDescription(description);
				testSuiteBean.setOwner(owner);
				testSuiteBean.setAreaOwned(areaOwned);
				testSuiteBean.setAssignedTo(assignedTo);
				testSuiteBean.setStatus(status);
				testSuiteList.add(testSuiteBean);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return testSuiteList;
	}
}
