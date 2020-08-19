<%--
  Created by IntelliJ IDEA.
  User: lybxxx
  Date: 2020/8/15
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="uploadImage" method="post" enctype="multipart/form-data">
    选择图片：<input type="file" name="image" accept="image/*"/>
    <br>
    <input type="submit" value="上传">
</form>
</body>
</html>
