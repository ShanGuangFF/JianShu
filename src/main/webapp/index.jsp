<%--
  Created by IntelliJ IDEA.
  User: cc_FF
  Date: 2019/12/4
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <input type="button" onclick="fun()">

    <form action="img/userPicUpload" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload" /><br/>
        <input type="submit" value="上传" />
    </form>

<script>
    function fun() {
        var xmlhttp;
        if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
            xmlhttp=new XMLHttpRequest();
        }
        else {// code for IE6, IE5
            xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
        }

        xmlhttp.open(
            "POST",
            "user/login",
            true
        );
        xmlhttp.setRequestHeader("Content-type","application/json");
        xmlhttp.send('{"userId":"1","userName":"123","userPassword":"456"}');

    }

</script>
</body>
</html>
