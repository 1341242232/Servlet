<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>库存明细</title>
		<link rel="stylesheet" href="/OA_products/css/storage.css" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	</head>
	</head>
	<body>
		<div class="box0">
				<div class="box1-nav1">
					<div class="header"><a href="/hahaha/产品管理系统/index1.html">首页</a> /<a href="#"> 入库管理</a> </div>
				<img src="/OA_products/img/QQ图片20190917115833.png"><span>数据列表</span>
			   </div>
		<div class="box1">
			<div class="box1-nav2">
				<div class="inner-div1">
					<div class="nav1">
						<div class="inner-nav2">
							<span class="span1">模糊查询</span>
						</div><input type="text" placeholder="请输入查询条件"/></div>
						
					<div class="nav2">
						<select name="按产品类型选择" >
							<option value="" selected>按产品类型选择</option>
			                <option value="bk" >别克</option>	
			                <option value="xfl" >雪佛兰</option>	
			                <option value="dz" >大众</option>	
			                <option value="fute" >福特</option>	
		                </select>
		            </div>
		            
		            <div class="nav3">
						<div class="inner-nav1">
							<span class="span1">按日期</span>
						</div><input type="date" />-<input type="date" style="border-top-left-radius: 3px;border-bottom-left-radius: 3px;"/></div>						
						<div class="href">
							<a href = "javascript:void(0)" onclick = "document.getElementById('light').style.display='block';document.getElementById('fade').style.display='block'"">高级搜索</a>
						</div>
						<div class="nav1-4">
						<button class="bnt3"><img src="/OA_products/img/QQ图片20190918145747.png" /><span>查询</span></button>
					    </div>  
					</div>
					<p class="likn"></p>
					
					<div class="nav4"> 
						
							<a href="${pageContext.request.contextPath}/view/storage/addstorage1.jsp"><button class="bnt1"><span>入库</span></button></a>						
							<button class="bnt2"><span>导 入</span></button>
					</div>
					
					<div class="table" >
						<table   cellspacing="0">
							<tr class="even">
								<td>产品编号</td>
								<td>
									<input type="checkbox" />
								</td>
								<td>产品名称</td>
								<td>产品类型</td>
								<td>库存数量</td>
								<td>操作</td>
							</tr>
							<tr>
								<td>产品编号</td>
								<td>
									<input type="checkbox" />
								</td>
								<td>产品名称</td>
								<td>产品类型</td>
								<td>库存数量</td>
								<td>操作</td>
							</tr>
							<tr class="odd">
								<td>产品编号</td>
								<td>
									<input type="checkbox" />
								</td>
								<td>产品名称</td>
								<td>产品类型</td>
								<td>库存数量</td>
								<td>操作</td>
							</tr>
							<tr>
								<td>产品编号</td>
								<td>
									<input type="checkbox" />
								</td>
								<td>产品名称</td>
								<td>产品类型</td>
								<td>库存数量</td>
								<td>操作</td>
							</tr>
							
								<tr class="odd">
								<td>产品编号</td>
								<td>
									<input type="checkbox" />
								</td>
								<td>产品名称</td>
								<td>产品类型</td>
								<td>库存数量</td>
								<td>操作</td>
							</tr>
							<tr>
								<td>产品编号</td>
								<td>
									<input type="checkbox" />
								</td>
								<td>产品名称</td>
								<td>产品类型</td>
								<td>库存数量</td>
								<td>操作</td>
							</tr>
								<tr class="odd">
								<td>产品编号</td>
								<td>
									<input type="checkbox" />
								</td>
								<td>产品名称</td>
								<td>产品类型</td>
								<td>库存数量</td>
								<td>操作</td>
							</tr>
							<tr>
								<td>产品编号</td>
								<td>
									<input type="checkbox" />
								</td>
								<td>产品名称</td>
								<td>产品类型</td>
								<td>库存数量</td>
								<td>操作</td>
							</tr>
						</table>
						<div class="nav5">
							<div class="nav5-1">
								共查询到<span>xxx</span>条记录!
							</div>
						    <div class="rage">
							<button>上一页</button>
							<button>1</button>
							<button>2</button>
							<button>3</button>
							<button>4</button>
							<button>5</button>
							<button>下一页</button>
						    </div>
						    <div class="nav5-2">
						    	<button >跳转至</button><input type="text" />/页面,共<span>xxx</span>页
						    </div>
						</div>
					</div>
			</div>
			</div>
		</div>
		 <div id="light" class="white_content">
		 	<p>高级搜索</p>
		 	<div class="onck-div">
		 		 <form>
		 		<div class="onck1">
		 			<div class="onck1-left">
		 				<div class="onck-text">
		 					 <span> 关键词 </span> <input type="text" placeholder="请输入产品编号/名称/类型/规格"/>
		 				</div>
		 				
		 			    <div class="onck-text">
		 			    	<span> 按分类 </span> <select name="全部分类" />
							<option value="" selected>全部分类</option>
			                <option value="bk" >别克</option>	
			                <option value="xfl" >雪佛兰</option>	
			                <option value="dz" >大众</option>	
			                <option value="fute" >福特</option>	
		                    </select>
		 			    </div>
		 			 
		 			</div>
		 		</div>
		 		<div class="onck1">
		 				<div class="onck1-left">
		 				   <div class="onck-text">
		 					<span class="onck-span"> 按仓库 </span> <select name="全部仓库" />
							<option value="" selected>全部仓库</option>
			                <option value="bk" >美国仓库</option>	
			                <option value="xfl" >日本仓库</option>	
			                <option value="dz" >中国仓库</option>	
			                <option value="fute" >英国仓库</option>	
		                    </select>
		 				   </div>
		 				   <div class="onck-date">
		 					<span>按日期 </span><input type="datetime-local" />-<input type="datetime-local" />
		 				    </div>
		 				</div>
		 		</div>
		 		<div class="onck1">
		 		    <div class="onck1-left">
		 		       <div class="onck-text">
		 		       <span>按品牌 </span><select name="全部品牌" />
							<option value="" selected>按品牌</option>
			                <option value="bk" >美国仓库</option>	
			                <option value="xfl" >日本仓库</option>	
			                <option value="dz" >中国仓库</option>	
			                <option value="fute" >英国仓库</option>	
		                    </select>
		 		       </div>
		 		        <div class="onck-text">
		 			    	<span>审批人  </span> <select name="全部分类" />
							<option value="" selected>审批人</option>
			                <option value="bk" >别克</option>	
			                <option value="xfl" >雪佛兰</option>	
			                <option value="dz" >大众</option>	
			                <option value="fute" >福特</option>	
		                    </select>
		 			    </div>
		 		    </div>
		 		</div>
		 		<div class="onck1">
		 		    <div class="onck1-left">
		 		       <div class="onck-text">
		 		       <span>供应商  </span><select name="全部品牌" />
							<option value="" selected>供应商</option>
			                <option value="bk" >美国仓库</option>	
			                <option value="xfl" >日本仓库</option>	
			                <option value="dz" >中国仓库</option>	
			                <option value="fute" >英国仓库</option>	
		                    </select>
		 		       </div>
		 		        <div class="onck-text">
		 			    	<span>来源地  </span> <input type="text" placeholder="请输入产品的来源地址"/>
		 			    </div>
		 		    </div>
		 		</div>
		 		<div class="btn4">
		 			<div class="btn-4-2">
		 			<p class="btn4-1" onclick = "document.getElementById('light').style.display='none';document.getElementById('fade').style.display='none'">关 闭	
		 			</p></div>
		 			<div class="btn4-2">
		 				<input type="button" value="确 定">
		 			</div>
		 			<div class="btn4-3">
		 				<input type="button" value="重 置">
		 			</div>
		 		</div>
		 		 </form>
		 	</div>
		 </div> 
        <div id="fade" class="black_overlay"></div> 
		</div>
	</body>
</html>