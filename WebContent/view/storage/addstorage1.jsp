<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>新增入库</title>
		<link rel="stylesheet" href="/OA_products/css/addstorage1.css" />
	</head>
	<body>
		<div class="box">
			<div class="box1">
				<div class="box1-1">
					<span class="font"><a href="#">首页 /</a><a href="#">入库管理 /</a>
						<a href="#">新增入库</a>
					</span>
					<div>
						<span class="img"><img src="/OA_products/img/QQ图片20190917115833.png"></span>
						<span class="font1">新增入库</span>
					</div>
				</div>
			</div>
			<div class="box2">
					<form>
					<input type="hidden" id="op" value="doaddproduct"> 
						<div class="nav1">
							<table cellspacing="0">
								<tr class="even">
									<td width="3%"></td>
									<td width="3%" ></td>
									<td width="14%">产品编号</td>
									<td width="5%">产品名称</td>
									<td width="5%">产品类型</td>
									<td width="5%">产品规格</td>
									<td width="5%">所入仓库</td>
									<td width="5%">入库数量</td>
								</tr>
								<tr >
									<td width="3%">1</td>
									<td width="3%" class="td22"><p class="td2">+</p></td>
									<td width="14%"><input type="text" disabled="true" id="pId" value="100" name="pId"></td>
									<td width="10%%"><input type="text" placeholder="请输入要入库的产品名称" id="iName" name="iName"/></td>
									<td width="5%"><select id="iType" name="iType">
							<option value="" selected>选择类型</option>
			                <option value="bk" >别克</option>	
			                <option value="xfl" >雪佛兰</option>	
			                <option value="dz" >大众</option>	
			                <option value="fute" >福特</option>	
		                    </select></td>
									<td width="5%"><select id="iSpecification" name="iSpecification"/>
							<option value="">选择规格</option>
			                <option value="bk" >别克</option>	
			                <option value="xfl" >雪佛兰</option>	
			                <option value="dz" >大众</option>	
			                <option value="fute" >福特</option>	
		                    </select></td>
									<td width="5%"><select id="storageId" />
							<option value="">选择仓库</option>
			                <option value="1" >A仓</option>	
			                <option value="2" >B仓</option>	
			                <option value="3" >C仓</option>	
			                <option value="4" >D仓</option>	
		                    </select></td>
									<td width="5%"><input type="text" id="iNumber" name="iNumber" placeholder="请输入入库数量" /></td>
								</tr>
							</table>
						</div>
						<div class="nav2">
							<div class="nav2-1">
								<div class="left">
									<div class="left1"><span class="xx">*</span>办理人 :</div>
								    <div class="right1"><input class="input1" type="text" disabled="true" value="xx" id="transactor" name="transactor"/></div>
								</div>
								<div class="right">
									<div class="left1"><span class="xx">*</span>入库日期 :</div>
								    <div class="right1"><input class="input1" type="text" id="iDate" name="iDate" disabled="true"/></div>
								</div>
							</div>
				
							
								<div class="nav2-1">
									<div class="left">
									<div class="left3">备注 :</div>
									<div><textarea class="textarea" id="remark" name="remark"></textarea></div>
									</div>
									
								</div>
							</div>
						</div>
							<div class="nav3">
								<div class="bnt">
									<div class="bnt1">
										<button>取消</button>
									</div>
									<div class="bnt2" id="bnt">
										<button>确认</button>
									</div>
								</div>
							</div>
							
					</form>
			</div>
		</div>
	</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
          function today(){//构建方法
        var today=new Date();//new 出当前时间
        var h=today.getFullYear();//获取年
        var m=today.getMonth()+1;//获取月
        var d=today.getDate();//获取日
        return h+"-"+m+"-"+d; //返回 年-月-日 时:分:秒
        }
     document.getElementById("iDate").value = today();
</script>

<script type="text/javascript">
$(function(){
	$("#bnt").click(function(){
		
		var op = $("#op").val();
		var pId = $("#pId").val();
    	var iName = $("#iName").val();
    	var iType = $("#iType").val();
    	var iSpecification = $("#iSpecification").val();
    	var iNumber = $("#iNumber").val();
    	var storageId = $("#storageId").val();
    	var iDate = $("#iDate").val();
    	var remark = $("#remark").val();
    	var transactor = $("#transactor").val();
    	
        var d = {
        		"op":op,
    			"pId":pId,
    			"iName":iName,
    			"iType":iType,
    			"iSpecification":iSpecification,
    			"storageId":storageId,
    			"iNumber":iNumber,
    			"iDate":iDate,
    			"remark":remark,
    			"transactor":transactor
    	};
        
		$.ajax({
			type:"POST",
			url:"${pageContext.request.contextPath}/doInventoryServlet",
			async:true,
			traditional:true,
			dateType:"json",
			contentType:"application/json;charset=utf-8",
			data:JSON.stringify(d),
				
			success:function(result){
					if (result.success) {
						alert(result.success);
						window.location.href="http://localhost:8090/OA_products/view/inventory/inventory1.jsp";
					}
			},
			error:function(result){
				alert(result.json);
				if (!result.error) {
					alert(result.error);
				}
			}
		});
	})
})
</script>