Steps to create a jar file
--------------------------

##Server
-------
1) compile the source code and generate the corresponding class files

	javac caesarserver.java

2) create a manifest.txt file and add the following lines. Last line must be a blank line

	Main-class: caesarserver

3) create the jar file using the command 

	jar -cvfm caesarserver.jar manifest.txt *.class

4) set permission to execute the jar file

	chmod 777 caesarserver.jar

5) Finally double click the jar file to run


##Client
--------
1) compile the source code and generate the corresponding class files

	javac caesarclient.java

2) create a manifest.txt file and add the following lines. Last line must be a blank line

	Main-class: caesarclient

3) create the jar file using the command 

	jar -cvfm caesarclient.jar manifest.txt *.class

4) set permission to execute the jar file

	chmod 777 caesarclient.jar

5) Finally double click the jar file to run

