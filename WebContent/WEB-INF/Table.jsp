<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>My JSP 'Success.jsp' starting page</title>

</head>

<body>

	<form action="updatedata.action" method="post">
		energyCollectData.eid<input type="text" name="energyCollectData.eid"><br /> 
		energyCollectData.uploadType<input type="text" name="energyCollectData.uploadType"><br /> 
		energyCollectData.subsystemId<input type="text" name="energyCollectData.subsystemId"><br /> 
		energyCollectData.collectorId<input type="text" name="energyCollectData.collectorId"><br />
		<input type="submit" value="更新">
	</form>
</body>
</html>
