# Assignment

[Click here to read the assignment](./docs/assignment.md)

## clipboard-recruiting-tht-sdet

- This frameworks follows page object model design pattern where object repository is created.
- This helps in instantiating the locators 


## External dependencies

For this project to run, you would need to install below 3 dependencies on your machine:

- **[Java 11](https://openjdk.java.net/projects/jdk/11/)** (as the core programming language)
- **[Maven 3.8.5](https://maven.apache.org/download.cgi)** (for dependency management)
- **[Google Chrome latest version](https://www.google.com/chrome/?brand=CHBD&gclid=Cj0KCQjwr-SSBhC9ARIsANhzu15P0PA-n9Zp4NpxKaOHVGtBD1TZQH0HlQQE6hUfsOFAU1nf-Rzdlf4aAoTJEALw_wcB&gclsrc=aw.ds)** (browser to run your tests)

> If your JAVA_HOME is set to anything other than JDK 11, you would need to update the path. Else your project
> will not run. Also, do remember to set the correct JDK settings in your IDE.

## Getting Started

- For easiest way to getting started, extract this project from git and open it from eclipse
- Test cases are coded in /*TestSandbox.java*/
- @FindBy annotation in /*AmazonOR.java*/ aids in locating the elements as per page factory model
- Dependencies are managed through pom.xml file 
- Test execution of the code through command line can be run done using the command  => mvn test -DTest=TestSandbox
- The output can be viewed through console 


## Success
