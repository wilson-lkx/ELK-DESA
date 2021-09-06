<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
}

.navbar {
  overflow: hidden;
  background-color: #808080;
}

.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.subnav {
  float: left;
  overflow: hidden;
}

.subnav .subnavbtn {
  font-size: 16px;
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .subnav:hover .subnavbtn {
  background-color: #0000FF;
}

.subnav-content {
  display: none;
  position: absolute;
  left: 0;
  background-color: #0000FF;
  width: 100%;
  z-index: 1;
}

.subnav-content a {
  float: left;
  color: white;
  text-decoration: none;
}

.subnav-content a:hover {
  background-color: #eee;
  color: black;
}

.subnav:hover .subnav-content {
  display: block;
}

.container {
  position: relative;
}

.logo-image {
  position: absolute;
 top:0;
   right:0;
}

</style>
</head>

<!--
  sample: https://community.splunk.com/t5/Community/ct-p/en-us
-->

<body>

<div class="container">
<div class="logo-image">
    <img src="/images/logo.jpg" width="100" height="50" style="top:10px;right: 10px;'">
</div>
<br>
<br>
<br>
<div class="navbar">
    <div class="subnav">
        <button class="subnavbtn">Administrator<i class="fa fa-caret-down"></i></button>
        <div class="subnav-content">
            <a href="#company">Report</a>
            <a href="#company">Company</a>
        </div>
    </div>
    <div class="subnav">
        <button class="subnavbtn">Account<i class="fa fa-caret-down"></i></button>
        <div class="subnav-content">
            <a href="#journalType">Journal Type</a>
        </div>
    </div>
    <div class="subnav">
        <button class="subnavbtn">Finance<i class="fa fa-caret-down"></i></button>
        <div class="subnav-content">
            <a href="#link1">Link 1</a>
        </div>
    </div>
    <div class="subnav">
        <button class="subnavbtn">EDP<i class="fa fa-caret-down"></i></button>
        <div class="subnav-content">
            <a href="#link1">Link 1</a>
        </div>
    </div>
</div>
</div>

</body>
</html>
