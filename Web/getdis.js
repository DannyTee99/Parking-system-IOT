var database = firebase.database().ref().child("Parking Area 1/Slot 1");

database.on("value", snap => {
  var distance = snap.val();
  
  console.log(distance);
  if (distance>0 && distance<200){
  	var str = "Occupied";
  var result = str.fontcolor("black");
  document.getElementById("demo").innerHTML = result;
  }
  else {
  	var str = "Available";
  var result = str.fontcolor("black");
  document.getElementById("demo").innerHTML = result;

  }
   	var str1 = "TBC";
  var result = str1.fontcolor("black");
  document.getElementById("demo1").innerHTML = result;
 	var str2 = "TBC";
  var result = str2.fontcolor("black");
  document.getElementById("demo2").innerHTML = result;
 	var str3 = "TBC";
  var result = str3.fontcolor("black");
  document.getElementById("demo3").innerHTML = result;
 	var str4 = "TBC";
  var result = str4.fontcolor("black");
  document.getElementById("demo4").innerHTML = result;




});
