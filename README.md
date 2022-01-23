# MercedesBenz

This repository is just to share the answers for the Mercedes-Benz challenge for Quality assurange engineer.

####For the Task 1: Black Box Testing####
Please, refer to the file available in this repository named BugReportTemplate_1.0.docx

####For the Taks 2: Task 2: Automation Testing####

-> Tools & Languages:
Language used: Java
Test framework used: Selenium Webdriver, TestNG
Dependencies manager used: Maven


-> Implementation details:
All the code is inside the src/test/java folder. 
The implementation is based on page object design pattern. Refer to the following structure:
-resources - this package contains all the classes for each page from the system under test.
-testcases - this package contains all the testsuites/testcases
-utils - this package contains additional classes to support the testcase executions sush as the ShadowElements and Webdriver classes.
-folder results - this folder contains all the outputs generated during test executions.

-> Instructions to run the framework.
In order to run the automated test case be sure to have the following requirements are met:
1) Download and configure testNG in your project.
2) Be sure that all the maven dependencies are installed properly.
3) After install and set the tools in the steps above, Go to Run As and select testNG.

######KNWON ISSUES#####
The automated test scenario not cover the last required step:Save the value “£” of the highest and lowest price results in a text file


