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
    <script type="text/javascript" src="./easyui/jquery.min.js"></script>
    <script type="text/javascript" src="./easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="./easyui/locale/easyui-lang-zh_CN.js"></script>
  </head>
<body>
    <h1>智慧化工园区查询系统</h1>
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
    <a id="search" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a>
    <a id="remove" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">删除</a>
    <table id="dg"></table>
    <div id="dialog" class="easyui-dialog" style="width:300px;height:150px"
    		data-options="title:'',buttons:'#bb',modal:true, closed: true">
    	确认要删除选定数据么?
    </div>
    <div id="bb">
    	<a id="confirm" href="javascript:void(0)" class="easyui-linkbutton">确认</a>
    	<a id="cancel" href="javascript:void(0)" class="easyui-linkbutton">取消</a>
    </div>


    <script type="text/javascript">
    	$(function(){
    	    $('#search').bind('click', function(){
    			var jsonstr = '{"total":10,"rows":[{"checkbox":true,"code":"M000005","name":"检测设备","sortid":3,"valid":"1","handler":"系统管理员","editing":false},{"checkbox":true,"code":"M000005","name":"检测设备","sortid":3,"valid":"1","handler":"系统管理员","editing":false},{"checkbox":true,"code":"M000005","name":"检测设备","sortid":3,"valid":"1","handler":"系统管理员","editing":false},{"checkbox":true,"code":"M000005","name":"检测设备","sortid":3,"valid":"1","handler":"系统管理员","editing":false},{"checkbox":true,"code":"M000005","name":"检测设备","sortid":3,"valid":"1","handler":"系统管理员","editing":false},{"checkbox":true,"code":"M000005","name":"检测设备","sortid":3,"valid":"1","handler":"系统管理员","editing":false},{"checkbox":true,"code":"M000005","name":"检测设备","sortid":3,"valid":"1","handler":"系统管理员","editing":false}]}';
				var data = $.parseJSON(jsonstr);
				$('#dg').datagrid('loadData', data); //将数据绑定到datagrid
    	    });
    	    $('#remove').bind('click', function(){
    			$('#dialog').dialog('open');
    	    });
    	    $('#confirm').bind('click', function(){
    			$('#dialog').dialog('close');
    			console.log($('#dg').datagrid('getSelections'));
    			$('#dg').datagrid('reload');
    			$.messager.alert('','删除成功','info');
    	    });
    	    $('#cancel').bind('click', function(){
    			$('#dialog').dialog('close');
    	    });
    	});
    	$.extend($.fn.datagrid.methods, {
    				editCell: function(jq,param){
    					return jq.each(function(){
    						var opts = $(this).datagrid('options');
    						var fields = $(this).datagrid('getColumnFields',true).concat($(this).datagrid('getColumnFields'));
    						for(var i=0; i<fields.length; i++){
    							var col = $(this).datagrid('getColumnOption', fields[i]);
    							col.editor1 = col.editor;
    							if (fields[i] != param.field){
    								col.editor = null;
    							}
    						}
    						$(this).datagrid('beginEdit', param.index);
    						for(var i=0; i<fields.length; i++){
    							var col = $(this).datagrid('getColumnOption', fields[i]);
    							col.editor = col.editor1;
    						}
    					});
    				}
    			});
    			var editIndex = undefined;
    			function endEditing(){
    				if (editIndex == undefined){return true}
    				if ($('#dg').datagrid('validateRow', editIndex)){
    					$('#dg').datagrid('endEdit', editIndex);
    					editIndex = undefined;
    					return true;
    				} else {
    					return false;
    				}
    			}
    			function onClickCell(index, field){
    				if (endEditing()){
    					$('#dg').datagrid('selectRow', index)
    							.datagrid('editCell', {index:index,field:field});
    					editIndex = index;
    				}
    			}
    	$('#dg').datagrid({
    		pagination: true,
    		iconCls:'icon-edit',
    		onClickCell: onClickCell,
    	    columns:[[
    	    	{
    	    		field: 'checkbox',
    	    		checkbox: true,
    	    		width: '10%'
    	    	},
    			{
    				field:'code',
    				title:'id',
    				width: '18%',
    				editor:{
						type:'textbox',
					}
    			},
    			{
    				field:'name',
    				title:'名称',
    				width: '18%',
					editor:{
						type:'textbox',
					}
    			},
    			{
    				field:'handler',
    				title:'说明',
    				width: '18%',
    				editor:{
						type:'textbox',
					}
    			},
    			{
    				field:'sortid',
    				title:'设备编号',
    				width: '18%',
    				editor:{
						type:'textbox',
					}
    			},
    			{
    				field:'valid',
    				title:'变更编号',
    				width: '18%',
    				editor:{
						type:'textbox',
					}
    			}
    	    ]]
    	});

    </script>
    <style type="text/css">
    h1 {
    	text-align: center;
    }
    </style>
</body>
</html>
