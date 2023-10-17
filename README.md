# iTunes Framework
- A framework to automate api for iTunes

**Getting Started**
- Install maven
- Install Java version 20
- git clone `https://github.com/rakesh436/veevaNba.git`
- `run` : mvn clean install

**Writing Tests**

- To write tests create a java file and extend the file to `BaseSetup`
- In `ServiceMethods` package implement base implementation of the specific service and extend to `GenericMethods`
- Dataprovider should be mentioned for each test
- 
1. Tests should be in the required package
2. Create Service classes for each service
3. Put assertions in class level
4. Don't use hardcoded values

**Executing Test**
- To run any TEST in local right-click on the test and click run/debug.
- To run TEST from terminal execute command `mvn clean test`

**REPORTS**
Reports can be found in `target` folder and screenshots for failed test in `screenshots` directory

`TOOLS USED`
1. Java
2. Maven
3. Rest-Assured
4. TestNG