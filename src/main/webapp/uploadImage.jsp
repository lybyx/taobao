<%--
  Created by IntelliJ IDEA.
  User: lybxxx
  Date: 2020/8/16
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>uploadImage</title>
</head>
<body>
<form name="uploadByFile" action="/image/fileUpload" method="post" enctype="multipart/form-data">
    <h1>采用multipart提供的file.transfer方法上传文件</h1>
    <input type="file" name="file">
    <input type="submit" value="上传">
</form>
<br>
<form name="uploadByStream" action="/image/streamUpload" method="post"
       enctype="multipart/form-data">
    <h1>采用流的方式上传文件</h1>
    <input type="file" name="file" accept="*/*">
    <input type="submit" value="上传">
</form>
<br>
<form name="uploadBySpring" action="/image/springUpload" method="post"
      enctype="multipart/form-data">
    <h1>采用流的方式上传文件</h1>
    <input type="file" name="file" accept="*/*">
    <input type="submit" value="上传">
</form>

</body>
</html>
