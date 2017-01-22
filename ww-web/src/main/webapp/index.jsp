<%--
  Created by IntelliJ IDEA.
  User: wangxingwang
  Date: 2017/1/18
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript">
        function cs() {
            alert("你好");
        }
        $(function () {
            $("#clickMe").click(function () {
                $.ajax({
                    url:"${pageContext.request.contextPath}/warning/list.do",
                    type:"post",
                    scriptCharset:'utf-8',
                    dataType:"text",
                    success: function (date) {
                        alert(date);
                    }
                });
            })
        });
    </script>
</head>
<body>
xiami
<input type="button" value="点我" id="clickMe">
</body>
</html>
