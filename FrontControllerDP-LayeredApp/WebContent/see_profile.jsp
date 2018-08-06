<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

  <c:choose>
    <c:when test="${!empty profileInfo}">
      <table style="color:cyan" border="1">
        <tr>
           <th>id</th><th>name</th><th>address </th><th>age</th>
        </tr>
        <tr>
          <td>${profileInfo.id}</td>
          <td>${profileInfo.name}</td>
          <td>${profileInfo.addrs}</td>
          <td>${profileInfo.age}</td>
        </tr>
      </table>
    </c:when>
    <c:otherwise>
        <b><i>Profile not found</i></b>
    </c:otherwise>
  </c:choose>
 <br>
 <a href="index.html">home</a>      
    
    
