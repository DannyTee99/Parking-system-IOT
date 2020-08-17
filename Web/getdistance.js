var database = firebase.database().ref().child("Parking Area 1/Slot 1");

database.on("child_added", snap => {
  var distance = snap.child("Distance").val();

   console.log(distance);
});


