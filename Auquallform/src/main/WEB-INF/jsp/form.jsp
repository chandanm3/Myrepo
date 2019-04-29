<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Auquall Form</title>
<link rel="stylesheet" type="text/css" href="Auquallform.css">
    <style>
        body{
            background-color:aliceblue;
        }
    h1{
    font-family:calibri;
        text-align: center;
        color:firebrick;  
        font-size: 50px;
        }
        #reg{
            
            margin-left:400px;
            font-family: sans-serif;
            font-weight: bold;
        }
        #button{
            padding: 10px 20px;
            font-family: sans-serif;
            font-weight: bold;
            font-size: 20px;
            background-color: cornsilk;
            border-color: black;
           border-radius: 10px;
           margin-right: 50px;
          }
        .left{
            float:left;
            width: 45%;
            margin-left: 50px;
        }
        .right{
            float: right;
            width: 45%;
            margin-right: 50px;
        }
    </style>
</head>
<body>
<div>
    <h1>Agent Activation Form</h1>
    ${msg}
    </div>
    <form method="post">
   <span class="left"> 
   <div id="label">Agent Id<span>*</span>:</div>    
    <input type="text" id="box" name="agentid" placeholder="Your Answer"/>
    </div>
    <div><div id="label">
        User Name<span>*</span>:</div>
    <input type="text" id="box" name="uname" placeholder="Your Answer"/></div>
  <div>
      <div id="label">  Request Date<span>*</span>:</div>
<input type="date" id="box"/></div>
<div>
    <div id="label">Request Time<span>*</span>:</div>
<input type="time" id="box"/></div>
<div>
    <div id="label">  Agency Name<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/>
</div>
<div><div id="label">
    Contact Person<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/></div>
<div><div id="label">
    Designation<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/></div>
<div><div id="label">
    Currently Selected<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/>
</div>
<div><div id="label">
    Address<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/>
    </div>
<div><div id="label">
    City<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/></div>
<div><div id="label">
    Pin Code<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/></div>
<div><div id="label">
    Country<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/></div>
<div><div id="label">
    State<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/></div>
<div><div id="label">
    Phone<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/></div>
<div><div id="label">
    Mobile<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/></div>
<div><div id="label">
    Email Address<span>*</span>:</div>
<input type="email" id="box" placeholder="Your Answer"/></div>
    <div><div id="label">
    Latitude<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/></div>
<div><div id="label">
    Longitude<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/></div>
 <div><div id="label">
     Pan No.<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/></div>
 <div><div id="label">
     GST No.<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/></div>
    <div><div id="label">
        Company Account No.<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/></div>
  <div><div id="label">
      IATA Status<span>*</span>:</div>
      <div class="1"><input type="radio" name="iata" /><label id="check">Yes</label></div>
      <div class="1"><input type="radio" name="iata"/><label id="check">No</label></div>
      <div class="1"><input type="radio" name="iata"/><label id="check">Applied</label></div>
</div>
    </span>
<span class="right">
  <div> <div id="label">
      FIT/Group<span>*</span>: </div>
<input type="checkbox" name="fit"/><label id="check">FIT</label></br>
        <input type="checkbox" name="group"/><label id="check">Group</label></br>
</div>
<div> <div id="label">
    Company Website<span>*</span>:</div>
<input type="text" id="box" placeholder="Your Answer"/></div>
 <div> <div id="label">
     Business Specialization<span>*</span>:</div>
     <input type="checkbox" name="mice"/><label id="check">MICE</label></br>
<input type="checkbox" name="adhoc"/><label id="check">ADHOC Groups</label></br>
<input type="checkbox" name="wed"/><label id="check">Weddings</label></br>
<input type="checkbox" name="fit"/><label id="check">FIT</label></br>
<input type="checkbox" name="student"/><label id="check">Student Groups</label></br>
<input type="checkbox" name="senior"/><label id="check">Senior Citizen Travel</label></br>
<input type="checkbox" name="expert"/><label id="check">Experimental Holidays</label></br>
<input type="checkbox" name="luxury"/><label id="check">Luxury Holidays</label></br>
<input type="checkbox" name="group"/><label id="check">Groups-Series Departures</label></br>
<input type="checkbox" name="corporate"/><label id="check">Corporate Travel</label></br>
<input type="checkbox" name="medical"/><label id="check">Medical Tourism</label></br>
<input type="checkbox" name="sports"/><label id="check">Sports Tourism</label></br>
<input type="checkbox" name="adventure"/><label id="check">Adventure Travel</label></br>
</div>
      <div> <div id="label">
          Number Of Staff (Including Yourself/Owner)<span>*</span>:</div>
     <input type="number" id="box" placeholder="Your Answer"/>
     </div>
   <div> <div id="label">
       Break Up of Staff Ticketing and Tours Business<span>*</span>:</div>
     <input type="text" id="box" placeholder="Your Answer"/>
     </div>
  <div> <div id="label">
      Head Office Location<span>*</span>:</div>
     <input type="text" id="box" placeholder="Your Answer">
     </div>
     <div> <div id="label">
         Number of Years in Operations<span>*</span>:</div>
    <input type="number" id="box" placeholder="Your Answer"/>
     </div>
     <div> <div id="label">
         Destination Sold Yearly (Ask for 2016, 2017, 2018)<span>*</span>:</div>
     <input type="text" id="box" placeholder="Your Answer"/>
     </div>
     <div> <div id="label">
         Proprietorship / Partnership<span>*</span>:</div>
         <input type="text" id="box" placeholder="Your Answer"/>                      
     </div>
     <div> <div id="label">
         Number of Branches<span>*</span>:</div>
     <input type="number" id="box" placeholder="Your Answer"/>
     </div>
     <div> <div id="label">
         Markets you Service<span>*</span>:</div>
         <input type="checkbox" name="south"/><label id="check">South East Asia</label></br>
<input type="checkbox" name="europe"/><label id="check">Europe</label></br>
<input type="checkbox" name="middle"/><label id="check">Middle East</label></br>
<input type="checkbox" name="america"/><label id="check">Americas</label></br>
<input type="checkbox" name="australia"/><label id="check">Australia</label></br>
<input type="checkbox" name="new"/><label id="check">New Zealand</label></br>
<input type="checkbox" name="domestic"/><label id="check">Domestic</label></br>
     </div>
 <div> <div id="label">
         Customer Base<span>*</span>:</div>
         <input type="checkbox" name="walk"/><label id="check">Walk-Ins</label></br>
<input type="checkbox" name="corporate"/><label id="check">Corporate</label></br>
<input type="checkbox" name="refferals"/><label id="check">Refferals</label></br>
<input type="checkbox" name="online"/><label id="check">Online</label></br>
 </div>
     <div> <div id="label">
         Do you have your own Online system ?<span>*</span>:</div>
         <input type="radio" name="system"/><label id="check">Yes</label></br>
<input type="radio"name="system"/><label id="check">No</label></br>
     </div>
     <div> <div id="label">
         Support Needed from Red Apple Travel<span>*</span>:</div>
         <input type="checkbox" name="product"/><label id="check">Product Promotions</label></br>
<input type="checkbox" name="training"/><label id="check">Product Training</label></br>
<input type="checkbox" name="support"/><label id="check">Online Training Support</label></br>
<input type="checkbox" name="api"/><label id="check">APIs (this applicable if they have online platform to integrate API)</label></br>
     </div>

     <div> <div id="label">
         Rep Name<span>*</span>:</div></br>
    <select id="select" name="fruit">
<option value ="none">Choose</option>
<option value ="pradeep">Pradeep</option>
<option value ="monika">Monika</option>
<option value ="gaurav">Gaurav</option>
</select> 
</div></br>
     <div>
     <input id="button" type="button" name="submit" value="Submit" />                                              
     </div>
</form>
</span>

</body>
</html>