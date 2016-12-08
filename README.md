Urban Agriculture / Gwenn project
=======================
Please contact Gwenn to know more about this project :)


Installation
=======================
.Instal last JRE and last JDK from Oracle web site

.Download Tomcat on Apache web site and decompress it on a locale file (for example i did it on C:\INSTALLS\apache-tomcat-9.0.0.M10)

.Instal Eclipse J2ee last version

.Instal MySQL by downloading it from MySQL web site


Configuration
=======================
.Environment system variables: 
..CATALINA_HOME: put the location of your tomcat directory (for example: "C:\INSTALLS\apache-tomcat-9.0.0.M10")

..JAVA_HOME: put the location of your installed jdk directory (for example: "C:\Program Files (x86)\Java\jdk1.8.0_102\" in the same java directory you have "C:\Program Files (x86)\Java\jre1.8.0_102")

..PATH: Check that the location of your installed jdk directory is present (for example: "C:\ProgramData\Oracle\Java\javapath;")
	
.Eclipse JDK: 
In eclipse Window menu/Java/Installed JREs: Add a reference to the jre directory inside your jdk directory (for example C:\Program Files (x86)\Java\jdk1.8.0_102\jre). Select this reference to be the one to use.
	
.Open MySQL. Run the database script creation using the "Create database script.sql" file inside database directory.

.Run MySQL server with an instance of the database.

.Then run this configuration and enjoy!!! :)


Running process
=======================
1. Add Tomcat server pointing on your your tomcat instance

2. Import the project sources into eclipse

3. Right click on project and select run as / run on your tomcat server

4. The web app is available in eclispe or in your favorite web browser on "http://localhost:8080/spring/" address.

