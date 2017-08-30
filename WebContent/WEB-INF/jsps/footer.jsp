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
<style type="text/css">
  @charset "ISO-8859-1";

body {
  margin:0; /*gets rid of white space around body*/
  height:200vh;
  position:relative; /*REQUIRED Sets up positioning for your footer*/
}

#sticky {
  width:100%;
  padding:20px;
  padding-bottom:4px;
  background:black;
  color:white;
  font-weight:bold;
  font-size:18px;
  position:fixed;    /*Here's what sticks it*/
  bottom:0;          /*to the bottom of the body*/
  left:0;            /*and to the left of the body.*/
  
  text-align:center; /*this will center the containers*/
}

#sticky * {
  margin:0;
  padding:0;
}

#sticky .container {
  display:inline-block; /*required for centering containers and allowing wrap*/
  margin-bottom:16px;
  width:20%; /*relative unit for responsive design*/
  min-width:150px; /*containers won't get smaller than 200px*/
  vertical-align:top;
}

/*----------------------------------------------------------*/
/*nothing below is necessary; it's just for styling purposes*/
/*----------------------------------------------------------*/

#sticky .container nav span {
  display:inline-block;
  margin-bottom:8px;
}

#sticky li {
  list-style:none;
}

#sticky .container h4 {
  margin-bottom:8px;
}

#sticky .cta button {
  margin-top:16px;
  padding:12px 20px;
  background:white;
  font-weight:bold;
  border:none;
  border-radius:8px;
  cursor:pointer;
  position:relative;
}
#sticky .cta button:focus {
  outline:none;
}
#sticky .cta button:active {
  top:4px
}
</style>
</head>
<body>
<footer id="sticky">
  <!--containers for footer content-->
  <div class="container siteNav">
    <nav><span style="border-bottom:2px solid">Site Nav</span>
      <ul>
        <li>
          <a>Home</a>
        </li>
        <li>
          <a>Here</a>
        </li>
        <li>
          <a>There</a>
        </li>
        <li>
          <a>Away</a>
        </li>
      </ul>
    </nav>
  </div>
  
  <div class="container contact">
    <h4>--- Contact Us! ---</h4>
    <a>email@mail.com</a>
    <address>
      123 Street<br/>
      Anywhere, USA</br>
      1.800.555.6666
    </address>
  </div>
  
  <div class="container cta">
    <h4>Want more info?</br>
    Click below!</h4>
    <button>Learn More!</button>
  </div>
  
</footer>
</body>
</html>