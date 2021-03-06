#!/usr/bin/env bash
apt-get update
apt-get upgrade -y
apt-get install git -y
apt-get install maven -y 
add-apt-repository ppa:webupd8team/java -y
apt-get update
apt-get install oracle-java8-installer -y
bash -c 'echo "JAVA_HOME=/usr/lib/jvm/java-8-oracle" >> /etc/environment'
bash -c 'echo "CATALINA_HOME=/opt/tomcat"  >> /etc/environment'
source /etc/environment

wget http://mirrors.gigenet.com/apache/tomcat/tomcat-8/v8.5.11/bin/apache-tomcat-8.5.11.tar.gz
tar xvzf apache-tomcat-8.5.11.tar.gz
mv apache-tomcat-8.5.11 /opt/tomcat

apt-get install mysql-server -y
echo "create database if not exists nimbits" | mysql -u root -p

#if you want to install nimbits server on a device that may not have the ram to build from source, you can run these commands
#on another machine - comment out the next two lines and run them manually to build and copy the resulting .war file. 
cd ..
mvn clean install
cp ./nimbits_server/target/nimbits_server.war /opt/tomcat/webapps/nimbits.war
cp ./scripts/tomcat8 /etc/init.d/tomcat8
chmod 755 /etc/init.d/tomcat8
update-rc.d tomcat8 defaults
reboot


