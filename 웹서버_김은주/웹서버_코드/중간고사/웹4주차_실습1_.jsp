<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head><title>test</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
* {
	margin:0;
	padding:0;
}
#content li{
	list-style-type:none;
}

@media screen and (orientation:portrait){/* // 가로 좁아졌을때  */
	#left{
		display:none;/* display: 박스유형제어(인라인, 블록, 인라인블록, none) */
	}
}

@media screen and (orientation:landscape){
	#left{
		float:left;
		width:30%;
	}
	#right{
		float:right;
		width:70%;
	}
}

div#content{
	padding :16px;
}
div#left li{
	padding:24px 0px;
	border-bottom:1px solid #c7c7c7;
}

</style>
<script>
</script>
</head>
<body>
<div id="left">
	<div id="content">
		<h3>List</h3>
		<ul>
			<li>리스트 1</li>
			<li>리스트 2</li>
			<li>리스트 3</li>
			<li>리스트 4</li>
			<li>리스트 5</li>
		</ul>
	</div>
</div>


<div id="right">
<div id="content">
<h3> 오른쪽 주제문 </h3>
<p>오른쪽에 나타나는 내용입니다.</p>
<p>오른쪽에 나타나는 내용입니다.</p> 
<p>오른쪽에 나타나는 내용입니다.</p>
<p>오른쪽에 나타나는 내용입니다.</p>
</div>
</div>
</body>
</html>
