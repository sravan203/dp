<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
  <c:when test="${!empty profileVO }">
   <table border="1" bgcolor="cyan">
     <tr>
       <td>${profileVO.id }</td>
       <td>${profileVO.fullName }</td>
       <td>${profileVO.type }</td>
       <td>${profileVO.nickName }</td>
       <td>${profileVO.country }</td>
       <td>${profileVO.totalMaches }</td>
       <td>${profileVO.totalInnings }</td>
       <td>${profileVO.totalWickets }</td>
       <td>${profileVO.totalCatches }</td>
       <td>${profileVO.totalRuns }</td>
       <td>${profileVO.totalStumpings }</td>
       <td>${profileVO.battingAvg }</td>
       <td>${profileVO.bowlingAvg }</td>
     </tr>
     </table>
  </c:when>
  <c:otherwise>
         <h1 style="color:red;text-align:center">Info not found </h1>
  </c:otherwise>
</c:choose> <br>    
<a href="find_crickter_details.html">home</a>
    
    
    
    
