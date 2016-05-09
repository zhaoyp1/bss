<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>

<base href="<%=basePath%>">
<!-- jsp文件头和头部 -->
<%@ include file="include/top.jsp"%>

</head>
<body class="no-skin">

	<!-- 页面顶部¨ -->
	<%@ include file="include/head.jsp"%>
		<!-- #main-content -->
	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try{ace.settings.check('main-container' , 'fixed')}catch(e){}
		</script>
		<%@ include file="include/left.jsp"%>
        <div id="main-content" class="main-content">
			<div class="main-content-inner">
				<div>
					<iframe name="mainFrame" id="mainFrame" frameborder="0" src=""
							style="margin: 0 auto; width: 100%; height: 100%;"></iframe>
				</div>
			</div>
       </div>
        <%@ include file="include/footer.jsp"%>
		<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
			<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
    </div>
	<script src="../static/js/index.js"></script>
</body>
</html>
