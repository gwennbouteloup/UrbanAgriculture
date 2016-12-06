<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Urban Agri!</title>
</head>
<body>
	<div align="center">
		<h1>Business Inst On Ground List</</h1>
		<h2>
			<a href="new">New User</a>
		</h2>

		<table border="1" style="border: 1px solid black;">
			<th>id company</th>
			<th>id company location</th>
			<th>id business</th>
			<th>id installation type</th>

			<c:forEach var="businessInst"
				items="${viewListBusinessInstTypeOnGround}" varStatus="status">
				<tr>
					<td style="border: 1px solid black;">${status.index + 1}</td>
					<td style="border: 1px solid black;">${businessInst.idCompany}</td>
					<td style="border: 1px solid black;">${businessInst.idCompanyLocation}</td>
					<td style="border: 1px solid black;">${businessInst.idBusiness}</td>
					<td style="border: 1px solid black;">${businessInst.idInstallationType}</td>
					<td style="border: 1px solid black;"><a
						href="edit?id=${businessInst.idCompany}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=${user.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
