<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: sonnh
  Date: 11/3/18
  Time: 1:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Simple Calculator</title>
</head>
<body>
<form action="index" method="post">
  <fieldset>
    <legend>Caculator</legend>
    <table>
      <tr>
        <td>First operand:</td>
        <td><input type="text" name="firstoperand" size="30px" placeholder="Number..."></td>
      </tr>
      <tr>
        <td>Operator:</td>
        <td>
          <select name="operator">
            <option value="+" th:selected="${operator.equals('+')}">+</option>
            <option value="-" th:selected="${operator.equals('-')}">-</option>
            <option value="*" th:selected="${operator.equals('*')}">*</option>
            <option value="/" th:th:selected="${operator.equals('/')}">/</option>
          </select>
        </td>
      </tr>
      <tr>
        <td>Second operand: </td>
        <td><input type="text" name="secondoperand" size="30px" placeholder="Number..."></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Calculate"></td>
      </tr>
    </table>
    <span>Result : <strong>${result}</strong></span>
  </fieldset>
</form>
</body>
</html>
