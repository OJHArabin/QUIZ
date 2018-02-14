<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Registration system PHP and MySQL</title>
  <link rel="stylesheet" type="text/css" href="resources/styles.css">
</head>
<body>
  <div class="header">
  	<h2>Login</h2>
  </div>
	 
  <form method="post" action="login">
  
  	<div class="input-group">
  		<label>Username</label>
  		<input type="text" name="userName"placeholder="rabin" required>
  	</div>
  	<div class="input-group">
  		<label>Password</label>
  		<input type="password" name="pass" required>
  	</div>
  	<div class="input-group">
  		<button type="submit" class="btn" name="login_user">Login</button>
  	</div>
  	<p>
  		Not yet a member? <a href="register.jsp">Sign up</a>
  	</p>  
  	
  </form>
  
  <div class="header">
  <h2>Admin</h2>
  </div>
  
  <form action="question.jsp">
  <center><input type="submit" class="btn" value="Add Question"  /></center>
    
</form>
</body>
</html>
