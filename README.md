# EclipseRAP-E4-Application
This small project is intended to provide a predefined Eclipse RAP E4 application that may be used as a blueprint for other. 
The actual application is very small and just contains an application model (Application.e4xmi) and a single view (part). 
Main focus was set to the structure that should allow to test developments locally and deploy an RAP application to a servlet container (e.g. for Tomcat or Wildfly/JBoss). For building the application (*.war-file) the maven-tycho plugin is used.

Following the common structure of Eclipse plugin projects, the directory 'eclipseProjects' contains the top level directory of the application, namely the directory 'de.enflexit.web'. Underneath, the sub directories for bundles, features and the release engineering (releng) are locate. To start the application or the build process, one can use the *.launch files that are located in the releng directory.

The project is currently under development and serves as discussion base. 


