<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
	<link rel="stylesheet" type="text/css"
		href="./easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="./easyui/themes/icon.css">
	<script type="text/javascript" src="./easyui/jquery.min.js"></script>
	<script type="text/javascript" src="./easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript"
		src="./easyui/locale/easyui-lang-zh_CN.js"></script>
</head>
<body>
	<h1>智慧化工园区查询系统</h1>
	<input id="selectSystem" class="easyui-combobox"
		data-options="
    		valueField: 'value',
    		textField: 'label',
    		data: [{
    			label: '能源分系统',
    			value: 'ene'
    		},{
    			label: '环保分系统',
    			value: 'env'
    		},{
    			label: '物流分系统',
    			value: 'lgt'
    		},{
    			label: '安防分系统',
    			value: 'sec'
    		}],
    		prompt:'请选择分系统',
    		editable:false" />
	<input id="selectTable" class="easyui-combobox"
		data-options="
    		valueField: 'value',
    		textField: 'label',
    		prompt:'请选择表',
    		editable:false" />
	<a id="search" class="easyui-linkbutton"
		data-options="iconCls:'icon-search'">查询</a>
	<a id="remove" class="easyui-linkbutton"
		data-options="iconCls:'icon-remove'">删除</a>
	<table id="dg"></table>
	<div id="dialog" class="easyui-dialog" style="width:300px;height:150px"
		data-options="title:'',buttons:'#bb',modal:true, closed: true">
		确认要删除选定数据么?</div>
	<div id="bb">
		<a id="confirm" href="javascript:void(0)" class="easyui-linkbutton">确认</a>
		<a id="cancel" href="javascript:void(0)" class="easyui-linkbutton">取消</a>
	</div>
	<div id="dataContainer" style="display: none"></div>

	<script type="text/javascript" src="./js/tableNameMap.js"></script>
	<script type="text/javascript">
		// 所有的数据
		var allObject = {};
		// 现在的表名
		var tableName = '';
		// 当前页
		var page = 1;
		// 当前页面大小
		var pageSize = 20;
		// 是否可编辑
		var canEdit = true;
		// 首字母大写
		String.prototype.firstUpperCase=function(){
		    return this.replace(/^\S/,function(s){return s.toUpperCase();});
		}
		Date.prototype.Format = function (fmt) {
		    var o = {
		        "M+": this.getMonth() + 1, //月份
		        "d+": this.getDate(), //日
		        "h+": this.getHours(), //小时
		        "m+": this.getMinutes(), //分
		        "s+": this.getSeconds(), //秒
		        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
		        "S": this.getMilliseconds() //毫秒
		    };
		    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
		    for (var k in o)
		    if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
		    return fmt;
		}
		function query() {
			var value = $('#selectTable').combobox('getValue');
			if(!value) {
				canEdit = true;
				$.messager.alert('错误', '请选择表', 'error');
				return;
			}
			$('#dataContainer').load('query.action', {
				sqlString:value.firstUpperCase(),
				pageSize: pageSize,
				page: page
			}, function (json, status) {
				canEdit = true;
				// 真数据
				var data = JSON.parse($('#Object').val().replace(/'/g, "\""));
				// mook数据开始
				// var mookData = "[{'total':10,'coding':'','collectValue':0,'collectorId':'','createTime':1492412967185,'dataSequence':'','eid':'','remove':'','sampleTime':1492412967185,'spotId':'','subsystemId':'','terminalId':'','uploadType':''},{'coding':'','collectValue':0,'collectorId':'','createTime':1492412967185,'dataSequence':'','eid':'','remove':'','sampleTime':1492412967185,'spotId':'','subsystemId':'','terminalId':'','uploadType':''}]"
				// var data = JSON.parse(mookData.replace(/'/g, "\""));
				// mook数据结束
				if (data.length === 0) {
					$.messager.alert('错误', '获取数据失败', 'error');
					return;
				}
				data.forEach(function (element) {
					Object.keys(element).forEach(function(elt, i, array) {
						if (elt.indexOf('Time') !== -1 || elt.indexOf('Date') !== -1) {
							if(elt.indexOf('Times') !== -1) return;
							element[elt] = new Date(element[elt]).Format("yyyy-MM-dd");
						}
					});
				});
				var tableData = {}
				tableData.total = data[0].total;
				tableData.rows = data;
				$('#dg').datagrid('loadData', tableData); //将数据绑定到datagrid
			});
		}
		$(function() {
			// 列表初始化
			$('#dg').datagrid({
				pagination : true,
				iconCls : 'icon-edit',
				onClickCell : onClickCell,
				pageList: [10, 20, 50]
			});
			var pg = $("#dg").datagrid("getPager");
			$(pg).pagination({
				showRefresh: false,
				onSelectPage:function(pageNumber, pageSize){
					window.page = pageNumber;
					window.pageSize = pageSize;
					query();
				}
			});
			// 分系统,表,属性初始化
			$('#dataContainer').load('getAllObj.action', {}, function() {
				allObject = JSON.parse($('#Object').val().replace(/'/g, "\""));
				$('#selectSystem').combobox({
					onSelect : function(record) {
						var data = [];
						Object.keys(allObject).forEach(function(elt, i, array) {
							if (elt[2] === record.value[2]) {
								data.push({
									label : tableNameMap[elt.toUpperCase()].NAME,
									value : elt
								});
							}
						});
						$('#selectTable').combobox('clear');
						$('#selectTable').combobox('loadData', data);
					}
				});
				$('#selectTable').combobox({
					onSelect : function(record) {
						tableName = record.value;
						var objectIndex = 0;
						Object.keys(allObject).forEach(function(elt, i, array) {
							if (elt === record.value) {
								objectIndex = i;
							}
						});
						var width = 100 / (Object.keys(allObject[record.value]).length) + '%';
						var columns = [{
							field : 'checkbox',
							checkbox : true,
							width : width
						}];
						Object.keys(allObject[record.value]).forEach(function(elt, i, array) {
							var column = {};
							column.width = width;
							column.field = elt;
							column.title = elt;
							column.align = 'center';
							column.editor = {
									type : 'textbox',
								}
							if (elt.indexOf('Time') !== -1 || elt.indexOf('Date') !== -1) {
								if(elt.indexOf('Times') == -1) {
									column.editor = {
										type : 'datebox',
									}
								}
							}
							columns.push(column);
						});
						$('#dg').datagrid({
							columns: [columns]
						});
						var pg = $("#dg").datagrid("getPager");
						$(pg).pagination({
							showRefresh: false,
							onSelectPage:function(pageNumber, pageSize){
								window.page = pageNumber;
								window.pageSize = pageSize;
								query();
							}
						});
					}
				});
			});
			// 查询
			$('#search').bind('click', function() {
				// 当前页,页面大小重置
				page = 1;
				pageSize = 10;
				query();
			});
			// 删除
			$('#remove').bind('click', function() {
				$('#dialog').dialog('open');
			});
			// 删除确认
			$('#confirm').bind('click', function() {
				$('#dialog').dialog('close');
				var rows = $('#dg').datagrid('getSelections');
				rows.forEach(function(element) {
					var data = {};
					Object.keys(element).forEach(function(elt, i, array) {
							if (elt === 'total') {
								return;
							}
							data[tableName + '.' + elt] = element[elt];
					});
					$('#dataContainer').load('deletedata.action',data, function() {
						if ($('#result').text() === 'SUCCESS') {
							$.messager.alert('成功', '删除成功', 'info');
							query();
						}
						else {
							$.messager.alert('失败', '删除失败', 'error');
						}
					});
				});
			});
			$('#cancel').bind('click', function() {
				$('#dialog').dialog('close');
			});
			// 编辑
			$.extend($.fn.datagrid.methods, {
				editCell : function(jq, param) {
					return jq.each(function() {
						var opts = $(this).datagrid('options');
						var fields = $(this).datagrid('getColumnFields', true).concat($(this).datagrid('getColumnFields'));
						for (var i = 0; i < fields.length; i++) {
							var col = $(this).datagrid('getColumnOption', fields[i]);
							col.editor1 = col.editor;
							if (fields[i] != param.field) {
								col.editor = null;
							}
						}
						$(this).datagrid('beginEdit', param.index);
						for (var i = 0; i < fields.length; i++) {
							var col = $(this).datagrid('getColumnOption', fields[i]);
							col.editor = col.editor1;
						}
					});
				}
			});
			var editIndex = undefined;
			function endEditing() {
				if (editIndex == undefined) {
					return true
				}
				if ($('#dg').datagrid('validateRow', editIndex)) {
					$('#dg').datagrid('endEdit', editIndex);
					canEdit = false;
					var rowsData = $('#dg').datagrid('getRows');
					var data = {};
					Object.keys(rowsData[editIndex]).forEach(function(elt, i, array) {
							if (elt === 'total') {
								return;
							}
							data[tableName + '.' + elt] = rowsData[editIndex][elt];
					});
					$('#dataContainer').load('updatedata.action',data, function() {
						if (($('#result').text() === 'SUCCESS')) {
							$.messager.alert('成功', '编辑成功', 'info');
						}
						else {
							$.messager.alert('失败', '编辑失败', 'error');
						}
						query();
					});
					editIndex = undefined;
					return true;
				} else {
					return false;
				}
			}
			function onClickCell(index, field) {
				if (endEditing() && canEdit) {
					$('#dg').datagrid('selectRow', index)
						.datagrid('editCell', {
							index : index,
							field : field
						});
					editIndex = index;
				}
			}
		});
	</script>
	<style type="text/css">
	h1 {
		text-align: center;
	}
	</style>
</body>
</html>
