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
<link rel="stylesheet" href="foot.css">
</head>
<body>
    
<header><%@ include file="header.jsp" %>  </header>

<center>

<div class="w3-content w3-section" style="max-width:500px">
  <img class="mySlides" src="img/img1.jpg" style="width:100%">
  <img class="mySlides" src="img/debit-card.jpg" style="width:100%">
  <img class="mySlides" src="img/internetbanking.jpg" style="width:100%">
   <img class="mySlides" src="img/MultiAppMobileBanking.jpg" style="width:100%">
      <img class="mySlides" src="img/1111.jpg" style="width:100%">
</div>

<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>
</center>
<footer>
<%@ include file="footer.jsp" %>  
</footer>
</body>
</html>