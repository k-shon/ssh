<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

   <s:form action="product_save" method="post" namespace="/" theme="simple">
       <table>
          
               <td>商品名称</td>
               <td><s:textfield name="name"></s:textfield></td>
           </tr>
           <tr>
               <td>商品价格</td>
               <td><s:textfield name="price"></s:textfield></td>
           </tr>
           <tr>
               <td col="2"><input type="submit" value="提交"/></td>
           </tr>
       </table>
   </s:form>
</body>
</html>