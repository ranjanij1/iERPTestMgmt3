<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>iERP Test Management</title>
<link href="view.css" rel="stylesheet" type="text/css">
</head>
<body>
	<html:form styleId="BuildingBlockForm">
		<br />
		<html:button property="addTestSuiteBtn" styleClass="btn"
			styleId="addTestSuiteBtn">Add Test Suite</html:button>
	&nbsp;&nbsp;&nbsp;
	<html:button property="deleteTestSuiteBtn" styleClass="btn">Delete Test Suite</html:button>
		<hr />
		<br />
		<table border=1 style="width: 100%">
			<thead>
				<tr>
					<th>Select</th>
					<th>Test Suite</th>
					<th>Description</th>
					<th>Owner</th>
					<th>Area Owned</th>
					<th>Assigned to</th>
					<th>Status</th>
				</tr>
			</thead>
			<logic:iterate id="testSuiteBeanList" property="testSuiteBean"
				name="BuildingBlockForm" type="com.ibm.ierp.bean.impl.TestSuiteBean"
				indexId="index">
				<tr>
					<td>
						<%-- Check box Start --%> <html:radio property="radioBtn"
							title="${testSuiteBeanList.name}" name="BuildingBlockForm"
							value="(String)<%=testSuiteBeanList.getId()%>"></html:radio>
					</td>
					<td><bean:write name="testSuiteBeanList" property="name" /></td>
					<td><bean:write name="testSuiteBeanList"
							property="description" /></td>
					<td><bean:write name="testSuiteBeanList" property="owner" /></td>
					<td><bean:write name="testSuiteBeanList" property="areaOwned" /></td>
					<td><bean:write name="testSuiteBeanList" property="assignedTo" /></td>
					<td><bean:write name="testSuiteBeanList" property="status" /></td>
				</tr>
				<logic:notEmpty name="testSuiteBeanList" property="testCase">
					<logic:iterate id="testCaseList"
						collection="<%=testSuiteBeanList.getTestCase()%>"
						type="com.ibm.ierp.bean.impl.TestCaseBean" indexId="testCaseIndex">
						<tr>
							<td>
								<%-- Check box Start --%> <html:radio
									property="radioBtnTestCase" name="BuildingBlockForm"
									title="${testCaseList.name}"
									value="(String)<%=testCaseList.getId()%>"></html:radio>
							</td>
							<td><bean:write name="testCaseList" property="name" /></td>
							<td><bean:write name="testCaseList" property="description" /></td>
							<td><bean:write name="testCaseList" property="owner" /></td>
							<td><bean:write name="testCaseList" property="areaOwned" /></td>
							<td><bean:write name="testCaseList" property="assignedTo" /></td>
							<td><bean:write name="testCaseList" property="status" /></td>
						</tr>
					</logic:iterate>
				</logic:notEmpty>
			</logic:iterate>
		</table>
		<!-- The Modal -->
		<div id="myModal" class="modal">

			<!-- Modal content -->
			<div class="modal-content">
				<span class="close">&times;</span>
				<table width="100%">
					<caption style="white-space: nowrap" class="modal-header">Fill-up
						all the Details below.</caption>

					<tr>
						<td>Test Suite Name :</td>
						<td><html:text property="testSuiteName"></html:text></td>
					</tr>
					<tr>
						<td>Description :</td>
						<td><html:text property="testSuiteDescription"></html:text></td>
					</tr>
					<tr>
						<td>Owner :</td>
						<td><html:text property="testSuiteOwner"></html:text></td>
					</tr>
					<tr>
						<td>AreaOwned :</td>
						<td><html:text property="testSuiteAreaOwned"></html:text></td>
					</tr>
					<tr>
						<td>Assigned To :</td>
						<td><html:text property="testSuiteAssignedTo"></html:text></td>
					</tr>
					<tr>
						<td>Status :</td>
						<td><html:text property="testSuiteStatus"></html:text></td>
					</tr>
				</table>
				<html:button property="addStepBtn" onclick="showTestCase()" styleClass="btn">Add Steps</html:button>
				<table style="width: 100%;display:none;" id="testCaseTable">
					<caption style="white-space: nowrap" class="modal-header">Add
						Test Case Details</caption>

					<tr>
						<td>Test Case Name :</td>
						<td><html:text property="testCaseName"></html:text></td>
					</tr>
					<tr>
						<td>Description :</td>
						<td><html:text property="testCaseDescription"></html:text></td>
					</tr>
					<tr>
						<td><html:button property="addMoreStepsbtn">Add More Steps</html:button></td>
					</tr>
				</table>
				<html:button property="savebtn" styleClass="btn" onclick="/c">Save</html:button>
				 &nbsp;&nbsp;&nbsp;
				<html:button property="cancelbtn" styleClass="btn">Cancel</html:button>
				
			</div>

		</div>

		<script>
			// Get the modal
			var modal = document.getElementById('myModal');

			// Get the button that opens the modal
			var btn = document.getElementById("addTestSuiteBtn");

			// Get the <span> element that closes the modal
			var span = document.getElementsByClassName("close")[0];

			// When the user clicks the button, open the modal 
			btn.onclick = function() {
				modal.style.display = "block";
			}

			// When the user clicks on <span> (x), close the modal
			span.onclick = function() {
				modal.style.display = "none";
			}

			// When the user clicks anywhere outside of the modal, close it
			window.onclick = function(event) {
				if (event.target == modal) {
					modal.style.display = "none";
				}
			}
			function showTestCase() {
				var tstCaseTble = document.getElementById("testCaseTable");
				tstCaseTble.style.display = "block";
				tstCaseTble.style.width="100%"
			}
		</script>
	</html:form>
</body>
</html>