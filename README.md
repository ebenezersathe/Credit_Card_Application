Credit_Card_Application

This is a Single Page Application that will enable the user to Register and display the list of users of Registered Users. 

Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

Prerequisities

To Run this Software on your local machine
1. Install Eclipse on your local machine (Please refer https://eclipse.org/downloads/)
2. Install Apache Tomcat 7.0 (please refer https://tomcat.apache.org/download-70.cgi)
3. Install Maven plugin in eclipse (Download from Eclipse Market Place)
4. Install MySql 5.6 locally (Please refer - http://dev.mysql.com/doc/refman/5.6/en/macosx-installation.html)

Give examples
Installing

A step by step series of examples that tell you have to get a development env running

To install Eclipse:
Download Eclipse from http://www.eclipse.org/downloads/. Choose "Mac OS X" ⇒ "Eclipse IDE for Java Developers" (or "Eclipse Classic"). You will receive a TAR file (e.g., "eclipse-java-juno-SR1-macosx-cocoa-x86_64.tar.gz") in "~/Downloads" folder.
Double-click the downloaded TAR file to expand it into an folder called "eclipse".
Drag the expanded "eclipse" folder to the "Applications" folder.
To start Eclipse, open the "eclipse" folder and click on the "Eclipse" icon. You may drag the "Eclipse" icon to the dock.
Notes: To uninstall Eclipse, drag the "/Applications/eclipse" folder to trash.

To install MySQL
The default TCP port number used by MySQL Server is 3306.
[For novices: SKIP THIS STEP to run the MySQL Server on port 3306. Goto Step 3.]
You can change the port number by editing the configuration file "my.cnf" at directory "/usr/local/mysql".
[mysqld]
.....
port=8888
.....

[client]
port=8888
To create this file, open a new "Terminal" and run the "nano" editor using this command:
sudo nano /usr/local/mysql/my.cnf
Modify the lines in green and add in the lines in red; and press ctrl-X to exit. (We use the "nano" editor in this case, you can use any text editor, but run in superuser.)
Notes: On Unix/Mac, the MySQL read the options file in this order: "/etc/my.cnf", "SYSCONFDIR/mf.cnf", "$MYSQL_HOME/my.cnf", "~/.my.cnf".
Step 3: Start/Shutdown the MySQL Server
Open a new "Terminal" and issue these commands to start the MySQL server:
$ cd /usr/local/mysql/bin
$ sudo ./mysqld_safe --console
Enter your password: 
xxxxxx xx:xx:xx mysql_safe logging to '/usr/local/mysql/data/xxxxxx.err'
xxxxxx xx:xx:xx mysql_safe Starting mysqld daemon with databases from /usr/local/mysql/data
To shutdown the server, start a new terminal and issue:
$ cd /usr/local/mysql/bin
 
$ sudo ./mysqladmin -u root shutdown     // BEFORE you set a password for root
// OR
$ sudo ./mysqladmin -u root -p shutdown  // AFTER you set a password for root
Step 4: Start/Stop a MySQL Client
Open a new "Terminal" and issue this command to start a MySQL client with superuser root:
$ cd /usr/local/mysql/bin
 
$ ./mysql -u root      // BEFORE you set a password for root
// OR
$ ./mysql -u root -p   // AFTER you set a password for root
To terminate the client, issue command "exit" (or "quit") from the "mysql>" prompt:
mysql> exit
Notes:
You can use "Activity Monitor" (under Applications/Utilities) to check if the MySQL Server is running. Look for process starting with mysqld.
The log messages are written to /usr/local/mysql/data/xxx.err, where xxx denotes your machine name. Issue "sudo cat /usr/local/mysql/data/xxx.err" to view the messages.
If you get the following error message when starting a client: "Can't connect to local MySQL server through socket '....', check your "Activity Monitor" to see if the MySQL server has been started.
Step 5: (For Java Programmers) Install MySQL JDBC Driver
Download the latest JDBC driver from http://www.mysql.com/downloads ⇒ MySQL Connectors ⇒ Connector/J ⇒ Compressed TAR archive (e.g., mysql-connector-java-{5.x.xx}.tar.gz, where {5.x.xx} is the latest release number).
Double-click on the downloaded TAR file to expand into folder "mysql-connector-java-{5.x.xx}".
Open the expanded folder. Copy the JAR file "mysql-connector-java-{5.x.xx}-bin.jar" to JDK's extension directory at "/Library/Java/Extension".
6.2  How to Uninstall and Remove MySQL 5
Open a Terminal ⇒ Run the "nano" editor to edit /etc/hostconfig, as follows:
sudo nano /etc/hostconfig
Enter your password: ....
Delete this line if present: "MYSQLCOM=-YES-". Press cntl-x to exit "nano" and enter "Y" to save the file. The line "MYSQLCOM=-YES-" starts MySQL automatically during startup.
Make sure that MySQL is not running (Open the "Activity Monitor" under the "Applications/Utilities", and check for the process "mysqld"). Open a Terminal and issue "rm -r" to remove these directories and their sub-directories (with "f" indicating no confirmation prompt).
sudo rm /usr/local/mysql
sudo rm -rf /usr/local/mysql*
sudo rm -rf /Library/StartupItems/MySQLCOM
sudo rm -rf /Library/PreferencePanes/My*
sudo rm -rf /Library/Receipts/mysql*
sudo rm -rf /Library/Receipts/MySQL*
sudo rm /etc/my.cnf


To install Apache Tomcat
Here are the easy to follow steps to get it up and running on your Mac
Download a binary distribution of the core module: apache-tomcat-7.0.47.tar.gz from here. I picked the tar.gz in Binary Distributions / Core section.
Opening/unarchiving the archive will create a folder structure in your Downloads folder: (btw, this free Unarchiver app is perfect for all kinds of compressed files and superior to the built-in Archive Utility.app)
~/Downloads/apache-tomcat-7.0.47
Open to Terminal app to move the unarchived distribution to /usr/local
sudo mkdir -p /usr/local
sudo mv ~/Downloads/apache-tomcat-7.0.47 /usr/local
To make it easy to replace this release with future releases, we are going to create a symbolic link that we are going to use when referring to Tomcat (after removing the old link, you might have from installing a previous version):
sudo rm -f /Library/Tomcat
sudo ln -s /usr/local/apache-tomcat-7.0.47 /Library/Tomcat
Change ownership of the /Library/Tomcat folder hierarchy:
sudo chown -R <your_username> /Library/Tomcat
Make all scripts executable:
sudo chmod +x /Library/Tomcat/bin/*.sh


Running the tests

Explain how to run the automated tests for this system

Break down into end to end tests

Explain what these tests test and why

Give an example
And coding style tests

Explain what these tests test and why

Give an example
Deployment

Add additional notes about how to deploy this on a live system

Built With

Dropwizard - Bla bla bla
Maven - Maybe
Atom - ergaerga
Contributing

Please read CONTRIBUTING.md for details on our code of conduct, and the process for submitting pull requests to us.

Versioning

We use SemVer for versioning. For the versions available, see the tags on this repository.

Authors

Billie Thompson - Initial work - PurpleBooth
See also the list of contributors who participated in this project.

License

This project is licensed under the MIT License - see the LICENSE.md file for details

Acknowledgments

Hat tip to anyone who's code was used
Inspiration
etc