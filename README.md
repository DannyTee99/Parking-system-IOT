# Parking-system-IOT
A System created to check the availability of parking through a mobile app. This app uses Firebase as a database
<hr>
The user will be able to receiver real-time information on how parking slots are occupied. This information can be accessed by the user through web or mobile phone, thereby allowing the user to determine a possible and convenient parking space accordingly.  <br>
The device once set up correctly in an individual parking slot will measure the distance between the vehicle and the device. This information will be displayed to the customer through the customer through web or mobile app, according to the customer’s choice, and the customer is free to determine how to park his/her vehicle according to the real-time information provided.<br>

## Assembly
* NodeMCU

NodeMCU is an open source IoT platform which includes firmware which runs on the ESP8266 Wi-Fi SoC from Espressif Systems, and hardware which is based on the module ESP8266 SDK 1.4.<br>

NodeMCU was used instead of the any other technology, because of its inbuilt Wi-Fi adapter.  NodeMCU offers easy connection to the internet without much effort as well. A NodeMCU has a micro USB port for it to be connected to the laptop for coding and for a method for connecting to power.

* An Ultrasonic sensor HC-SR04

The HC-SR04 ultrasonic sensor uses sonar to determine distance to an object. (Random Nerd Tutorials, 2013) The sonar can detect within a 2cm to 400cm range(non-contact measurement function), with an accuracy of 3mm. Each ultrasonic sensor has its own transmitter, receiver and control unit.<br><br>
The Transmitter will emit a 40 kHz signal and detect a signal back with its receiver. Once received the control Unit will relay the information.
<br>

* Jumper wires

## Setting up the device

The NodeMCU and the HR-SR04 sensor should be connected as follows;

<div align="center">
  <img src="https://user-images.githubusercontent.com/33988886/90443145-5eca0d80-e0f9-11ea-9b5b-5d515da3b702.png"></div>
  
* The sensor VCC (power) should be connected to the NodeMCU +3.3v 
* The sensor GND(Ground) should be connected to the NodeMCU GND
* The sensor Trig (Trigger) Pin should be connected to the NodeMCU Digital I/O D4 (Input)
* The sensor Echo Pin should be connected to the NodeMCU Digital I/O D3 (Output)

### Setting up Wi-Fi and Database
This can be done by coding the SSID and the password of the Wi-Fi router, into the nodeMCU, which will provide the connection to the module to the internet. How it is coded is portrayed in the following;
<div align="center">
  <img src="https://user-images.githubusercontent.com/33988886/90443621-2ecf3a00-e0fa-11ea-81b4-eae3f1237397.png"><br>
  <img src="https://user-images.githubusercontent.com/33988886/90443624-31319400-e0fa-11ea-91fd-ba341ddf001c.png">
</div>

To set up firebase, head to the firebase console and add project. Follow the instructions and link your project to the database.
<div align="center">
  <img src="https://user-images.githubusercontent.com/33988886/90443791-70f87b80-e0fa-11ea-825a-387f35e8f5f3.png"><br>
  <img src="https://user-images.githubusercontent.com/33988886/90443797-748c0280-e0fa-11ea-992a-49e2037c2073.png">
</div>

By using the real-time database, all the information collected by the sensor and processed by the NodeMCU will be sent to firebase, and firebase will allow real-time updating of all values within the database.

> The website is hosted using firebase hosting services, which can be followed through the firebase docs <br>
https://firebase.google.com/docs
