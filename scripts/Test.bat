@echo off
set workspace=C:\Software\Workspaces\Eclipse\Neon\UPM-MIW-IWVG\FcoJavier.Reyes.SVC
set PATH=%PATH%C:\Program Files\Java\jdk1.8.0_102\bin;C:\Software\DevKits\apache-maven-3.3.9
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_102
set M2_HOME=C:\Software\DevKits\apache-maven-3.3.9
echo -----------------------------------------
echo . (C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo JAVA_HOME --- %JAVA_HOME%
echo M2_HOME   --- %M2_HOME%
echo .
cd %workspace%
echo ============ mvn clean test (profile: develop) =======================================================
echo .
call mvn clean test -Denvironment.type=develop
pause

