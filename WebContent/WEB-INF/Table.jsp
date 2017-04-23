<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
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
		energyCollectData.subsystemId<input type="text" name="energyCollectData.collectValue"><br /> 
		energyCollectData.collectorId<input type="text" name="energyCollectData.createTime"><br />
		<s:hidden name="energyCollectData.creatTime" value = "2015-10-01"></s:hidden>
		<input type="submit" value="更新">
	</form>
	
<s:form method="post" action="updatedata.action">
    <s:textfield name="energyCollectData.createTime" label="日期"/>
    <s:textfield name="energyCollectData.eid" label="密码"/>
    <s:submit></s:submit>
</s:form>
</body>
</html>
