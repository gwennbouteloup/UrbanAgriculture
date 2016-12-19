Urban Agriculture / Gwenn project
=======================
Please contact Gwenn to know more about this project :)

Test the web app without installing development environment
=======================
1. Download the last version of the war working version inside "war working versions" directory
2. Download tomcat last version, uncompress it and place the war (see step 1.) inside webapps directory
3. Install MySQL last version and: 
3.1. Open MySQL. Create a schema by running the database script creation using the "Create database script.sql" file inside database directory (for my own configuration i used mysql workbench which includes the access to the msql server)
4. Start tomcat using "startup.bat" provided inside "tomcat start and stop" directory: You have to replace the original
file included in "<your tomcat directory>\bin" by this one
5. Launch the web app using following URL: "localhost:8080/UrbanAgriculture/" (MySQL server must be running)

For developers 
=======================
Following sections are addressed to developers. 
If you want to use this base to expand it or to do what ever you want with it, have fun :) 
Warning: the latest version could be not stable. If it is the case, you can be sure that a previous version
was working: Please refer to previous section. 

Installation
=======================
.Instal last JRE and last JDK from Oracle web site

.Download Tomcat on Apache web site and decompress it on a locale file (for example i did it on C:\INSTALLS\apache-tomcat-9.0.0.M10)

.Instal Eclipse J2ee last version

.Instal MySQL last version by downloading it from MySQL web site

Environment Configuration
=======================
.Environment system variables: 
..CATALINA_HOME: put the location of your tomcat directory (for example: "C:\INSTALLS\apache-tomcat-9.0.0.M10")

..JAVA_HOME: put the location of your installed jdk directory (for example: "C:\Program Files (x86)\Java\jdk1.8.0_102\" in the same java directory you have "C:\Program Files (x86)\Java\jre1.8.0_102")

..PATH: Check that the location of your installed jdk directory is present (for example: "C:\ProgramData\Oracle\Java\javapath;")
	
.Eclipse JDK: 
In eclipse Window menu/Java/Installed JREs: Add a reference to the jre directory inside your jdk directory (for example C:\Program Files (x86)\Java\jdk1.8.0_102\jre). Select this reference to be the one to use.
	
.Open MySQL. Create a schema by running the database script creation using the "Create database script.sql" file inside database directory. 

.Then run this configuration (MySQL server must be running) and enjoy!!! :)

Running process
=======================
1. Add Tomcat server pointing on your your tomcat instance

2. Import the project sources into eclipse

3. Right click on project and select run as / run on your tomcat server

4. The web app is available in eclispe or in your favorite web browser on following URL: "http://localhost:8080/spring/".

