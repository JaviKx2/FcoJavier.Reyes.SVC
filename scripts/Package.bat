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
echo .
echo .

cd %workspace%

echo ============ mvn -ff clean test (profile: develop) =========================================================================
echo .
call mvn -ff clean test -Denvironment.type=develop
if errorLevel 1 goto errorDevelop
echo .
echo ============ call mvn -Dmaven.test.skip=true install -Denvironment.type=preproduction (profile: preproduction) ================
echo .
call mvn -Dmaven.test.skip=true install -Denvironment.type=preproduction
pause
exit

:errorDevelop
echo .
echo .
echo .
echo ########  ERRORES...
pause
