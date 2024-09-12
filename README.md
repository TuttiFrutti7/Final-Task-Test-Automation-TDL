# TDL_SS_Final_Task
Final task for TDL School Test Automation
# Maven commands
### **How can you run one specific test class**
    mvn test -Dtest="NameOfTheTestClass"
###### mvn - runs maven command
###### test - runs tests in maven
###### -Dtest="NameOfTheTestClass" - runs the test class specified
####
### **How can you run one specific test in class**
    mvn test -Dtest="NameOfTheTestClass#nameOfTheTestMethod"
###### added "#" after the name of the test class allows you to specify specific test method to run
####
### **How can you run all ‘Regression tests'**
     mvn test -Dgroups=Regression
###### -Dgroups=Regression - runs all the tests with the "Regression" group
####
### **Write an explanation on how you can exclude tests from execution**
###### 1. If using Maven Surefire plugin - adding "!" after the "-Dtest=" and before the class name:
    mvn test -Dtest=!TestClass1, !TestClass2
###### 2. If using TestNG with groups:
    mvn test -DexcludedGroups=NameOfTheGroup
###### 3. If using Maven Surefire plugin - In the pom.xml file go to the Maven Surefire plugin and in the configuration tags add tags "\<excludes>\" and then between tags "\<exclude>\" add the Java Test class like so:
    <configuration>
        <excludes>
            <exclude>**/TestClass1</exclude>
            <exclude>**/TestClass2</exclude>
            <exclude>**/TestClass3</exclude>
        </excludes>
    </configuration>
###### 4. if using TestNG - Adding to the TestNG xml file in the "\<mehtods>\" and "\<exclude>\" tags methods to exclude like so:
    <classes>
        <class name="com.example.TestClass1" />
    </classes>
    <methods>
        <exclude name="testMethod1" />
    </methods>
#
# About project
##
### For running project:
###### ChromeDriver is set to windows, you may have to change it according to your OS
###### Tests have not been finished and don't work properly
###### All test cases have been enabled
###### I tried to implement the POM model by seperating everything into unique packages and classes (for example seperate page classes and a seperate package for reading the config and initializing the chrome-driver)
###### for html report I used extent reports by implementing dependency in pom.xml, creating necessery config files and reports package.
###### Configuration file contains my name, name of the project and main link to the website tested
###### extent report is opened before the tests run and closed after they have finished running
#
