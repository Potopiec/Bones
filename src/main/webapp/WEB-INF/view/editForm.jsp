<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <meta charset="utf-8">
    <title>add Entry</title>
  </head>
  <body>

    <spring:form action="edit" method="post" modelAttribute="editFossil">

      <spring:input path="id" type="hidden" value="${editFossil.id}"/>
      <spring:select path="period"  name="period" itemValue="${editFossil.period}">
        <spring:option value="CENOZOIC" label="cenozoic"/>
        <spring:option value="MESSOSOIC" label="messosoic"/>
        <spring:option value="PALEOZOIC" label="paleozoic"/>
        <spring:option value="UNKNOWNPERIOD" label="unknownperid"/>
      </spring:select>
      <spring:select path="type" name="type" itemValue="${editFossil.type}">
        <spring:option value="BODY" label="body"/>
        <spring:option value="CARBON" label="carbon"/>
        <spring:option value="MOLECULAR" label="molecular"/>
        <spring:option value="PSEUDO" label="pseudo"/>
        <spring:option value="TRACE" label="trace"/>
        <spring:option value="UNKNOWNTYPE" label="unknowntype"/>
      </spring:select>
      <spring:input path="name" type="text"  value="${editFossil.name}" />
      <spring:input path="location" type="text"  value="${editFossil.location}" />
      <spring:input path="state" type="text" value="${editFossil.state}"/>

      <input type="submit" value="Submit">


    </spring:form>

  </body>
</html>
