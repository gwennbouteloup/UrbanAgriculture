Urban Agriculture / Gwenn project
=======================
Please contact Gwenn to know more about this project :)


Installation
=======================
Instal last JRE and last JDK from Oracle web site
Download Tomcat on Apache web site and decompress it on a locale file
Instal Eclipse J2ee last version
Instal PostgreSQL by downloading it from PostgreSQL web site

Configuration
=======================
Environment systeme variables: 
	CATALINA_HOME: put the location of your tomcat directory
	JAVA_HOME: put the location of your installed jdk directory
	PATH: Check that the location of your installed jdk directory is present
	
Eclipse JDK: 
	In eclipse in Window menu/Java/Installed JREs: Add a reference to the jre directory inside your jdk directory (for example C:\Program Files (x86)\Java\jdk1.8.0_102\jre). 
		Select this reference to be the one to use.
	
Open PostgreSQL. Run the database script creation using the "Create database script.sql" file inside database directory.
Run PostgreSQL server with an instance of the database.

Then run this configuration and enjoy!!! :)

Running process
=======================
1. Add Tomcat server pointing on your your tomcat instance
2. Import the projet sources into eclipse
3. Right click on prject and select run as / run on your tomcat server
4. The web app is available in eclispe or in your favorite web browser on "http://localhost:8080/UrbanAgriculture-0.0.1-SNAPSHOT/" address.

