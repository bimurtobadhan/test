<html>
<head>
<title>Using GET and POST Method to Read Form Data</title>
</head>
<body>
<h1>Using GET Method to Read Form Data</h1>
<ul>
<li><p><b>Username:</b>
   <%= request.getParameter("username")%>
</p></li>
<li><p><b>Email:</b>
   <%= request.getParameter("email")%>
</p></li>
</ul>
</body>
</html>