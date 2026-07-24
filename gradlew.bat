@echo off
setlocal
set APP_HOME=%~dp0
set CLASSPATH=
if not exist "%APP_HOME%gradle\wrapper\gradle-wrapper.jar" (
    echo Downloading Gradle Wrapper...
    powershell -Command "Invoke-WebRequest -Uri https://raw.githubusercontent.com/gradle/gradle/v8.10.2.0/gradle/wrapper/gradle-wrapper.jar -OutFile '%APP_HOME%gradle\wrapper\gradle-wrapper.jar'"
)
@rem Execute Gradle
"%JAVA_HOME%\bin\java.exe" -classpath "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*
