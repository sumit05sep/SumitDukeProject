<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>MasterHome</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
.mySlides {display:none;}
</style>
<!-- <link rel="stylesheet" href="foot.css"> -->
</head>
<body>
    

 <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"><img alt="BankLogo" src="E:/logo.png" height="80px" width="140px"></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="reg">Home</a></li>
      <li><a href="acList">Account List</a></li>
      <li><a href="#">Fund Transfer</a></li>
       <li><a href="#">ATM</a></li>
         <li><a href="#">Help</a></li>
    </ul>
    
    <form class="navbar-form navbar-left">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
    </form>
     <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span>${msg}</a></li>
      <li><a href="logout"><span class="glyphicon glyphicon-log-in"></span> _Logout</a></li>
    </ul>
  </div>
</nav>
