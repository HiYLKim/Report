<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전국교육행정구역표준데이터</title> 
</head>
<body>
	<%
//EducationDao dao = new EducationDao();
//EducationDto dto = new EducationDto();
//String id = "S000000001";
//dto = dao.selectOne(id);
//out.print("1111:" + dto.getOfficeName());
	
	
	
	%>
	
	<form action="/EducationApp.jsp">
		<label for="List">자료검색</label>
		<select id="List" name="List">
			<option value="all">전체</option>
			<option value="id">아이디</option>
			<option value="districtName">교육행정구역명</option>
			<option value="officeName">시도교육청명</option>
		</select><input type="submit" value="검색">
	</form>
</body>
</html>