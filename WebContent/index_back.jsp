<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>智慧园区</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="./easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="./easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="./easyui/demo/demo.css">
    <script type="text/javascript" src="./easyui/jquery.min.js"></script>
    <script type="text/javascript" src="./easyui/jquery.easyui.min.js"></script>
  </head>
<body>
    <h1 style="display: none;">智慧化工园区查询系统</h1>
    <input class="easyui-combobox" data-options="
    		valueField: 'value',
    		textField: 'label',
    		data: [{
    			label: '安防分系统',
    			value: 'Java'
    		},{
    			label: '物流分系统',
    			value: 'Perl'
    		},{
    			label: '能源分系统',
    			value: 'Ruby'
    		},{
    			label: '环保分系统',
    			value: 'Ruby'
    		}],
    		prompt:'请选择分系统'"/>
    <input class="easyui-combobox" data-options="
    		valueField: 'value',
    		textField: 'label',
    		data: [{
    			label: '表1',
    			value: 'Java'
    		},{
    			label: '表2',
    			value: 'Perl'
    		},{
    			label: '表3',
    			value: 'Ruby'
    		},{
    			label: '表4',
    			value: 'Ruby'
    		}],
    		prompt:'请选择表'"/>
    <a id="btn" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a>
    <table id="dg"></table>


    <script type="text/javascript">
    	$(function(){
    	    $('#btn').bind('click', function(){
    			// alert('easyui');
    	    });
    	});
    	$('#dg').datagrid({
    	    columns:[[
    			{field:'code',title:'编号'},
    			{field:'name',title:'名称'},
    			{field:'handler',title:'说明'}
    	    ]]
    	});
    	var jsonstr = '{"total":1,"rows":[{"code":"M000005","name":"检测设备","sortid":3,"valid":"1","handler":"系统管理员"}]}';  
		var data = $.parseJSON(jsonstr);    
		$('#dg').datagrid('loadData', data); //将数据绑定到datagrid 
    </script>
    <style type="text/css">
    h1 {
    	text-align: center;
    }
    </style>
</body>
</html>
