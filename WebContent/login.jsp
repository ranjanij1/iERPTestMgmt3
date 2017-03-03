<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body style="vertical-align:middle">
	<s:form action="/ierp/login.action" styleId="LoginForm">
		<div style="height: 5px;" >
			<table align="center" border="2" >
				<tr>
					<td><s:select label="User Type" headerKey="-1"
							headerValue="Select Role" list="#{'1':'Builder', '2':'Executor'}"
							name="role" value="0" /></td>
				</tr>
				<tr>
					<td><s:textfield lable="Login ID :" key="userId" /></td>
				</tr>

				<tr>
					<td><s:password lable="Password" key="password" /></td>
				</tr>
				<tr`>
				<td colspan="2" align="left" >
				<s:submit /></td></tr>
			</table>

			
			
			
		</div>
	</s:form>
</body>
</html>