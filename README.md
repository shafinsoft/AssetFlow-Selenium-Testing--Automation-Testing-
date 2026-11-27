# AssetFlow – Selenium Automation Testing

Automated browser testing for **AssetFlow**, a full-stack Asset Management Web Application developed using PHP and MySQL. This repository contains Java-based Selenium WebDriver automation tests designed to validate the application's core functionalities using Maven and TestNG.

## Project Overview

AssetFlow is a web-based asset management system that helps users manage, organize, monitor, and track assets efficiently.

This repository focuses on automating functional testing of the AssetFlow application using Selenium WebDriver with Java.

### Application Under Test

- **Project Name:** AssetFlow
- **Application Type:** Full-Stack Web Application
- **Backend:** PHP
- **Database:** MySQL
- **Frontend:** HTML5, CSS3, JavaScript
- **Automation Framework:** Selenium WebDriver
- **Testing Framework:** TestNG
- **Build Tool:** Apache Maven

## Technology Stack

| Technology | Version / Usage |
|---|---|
| Java | 17 |
| Selenium WebDriver | 4.29.0 |
| Selenium ChromeDriver | 4.29.0 |
| TestNG | 7.10.2 |
| Apache Maven | Dependency and Build Management |
| Maven Compiler Plugin | 3.13.0 |
| Maven Surefire Plugin | 3.5.2 |
| Google Chrome | Browser Automation |
| PHP | Application Backend |
| MySQL | Database |

## Project Features Tested

The automation project currently covers the following application functionalities:

1. Homepage Loading
2. Login Page Loading
3. Valid User Login
4. Invalid User Login
5. User Registration
6. Dashboard Loading
7. Add New Asset
8. Edit Existing Asset

## Automated Test Cases

The project contains eight TestNG test classes.

| Test Class | Testing Scenario |
|---|---|
| HomepageTest | Verify homepage loading |
| LoginTest | Verify login page loading |
| ValidLoginTest | Verify login with valid credentials |
| InvalidLoginTest | Verify login with invalid credentials |
| SignupTest | Verify new user registration |
| DashboardTest | Verify dashboard loading |
| AssetAddTest | Verify adding a new asset |
| AssetEditTest | Verify editing an existing asset |

## Project Structure

```text
AssetFlow-Selenium-Test/
│
└── assetflow-testing/
    │
    ├── pom.xml
    │
    └── src/
        │
        ├── main/
        │   └── java/
        │       └── com/
        │           └── assetflow/
        │               └── Main.java
        │
        └── test/
            └── java/
                └── com/
                    └── assetflow/
                        │
                        ├── HomepageTest.java
                        ├── LoginTest.java
                        ├── ValidLoginTest.java
                        ├── InvalidLoginTest.java
                        ├── SignupTest.java
                        ├── DashboardTest.java
                        ├── AssetAddTest.java
                        └── AssetEditTest.java
```

## Prerequisites

Before running the automation tests, make sure the following software is installed:

- Java JDK 17 or later
- Apache Maven
- Google Chrome Browser
- XAMPP Server
- MySQL Database

## Application Setup

1. Download or clone the AssetFlow PHP application.
2. Place the application folder inside the XAMPP `htdocs` directory.
3. Start Apache and MySQL from the XAMPP Control Panel.
4. Open phpMyAdmin.
5. Import the provided SQL database file.
6. Configure the database connection in the PHP application.
7. Open the application in your browser.

**Application URL:**

```text
http://localhost/AssetFlow
```

## Automation Testing Setup

### Step 1: Clone the Repository

```bash
git clone https://github.com/shafinsoft/AssetFlow-Selenium-Testing--Automation-Testing-.git
```

### Step 2: Open the Project

Navigate to the directory containing `pom.xml`:

```bash
cd AssetFlow-Selenium-Testing--Automation-Testing-/assetflow-testing
```

### Step 3: Install Maven Dependencies

```bash
mvn clean install
```

Maven automatically downloads the required dependencies declared in `pom.xml`.

### Step 4: Run All Automation Tests

```bash
mvn clean test
```

### Step 5: Run a Specific Test Class

Example:

```bash
mvn -Dtest=ValidLoginTest test
```

You can replace `ValidLoginTest` with any other test class name.

## Test Execution and Reports

After executing the automation tests, Maven Surefire generates test reports in:

```text
target/surefire-reports/
```

The reports provide information about:

- Passed Test Cases
- Failed Test Cases
- Skipped Test Cases
- Test Execution Errors

Run `mvn clean test` to generate fresh reports.

## Testing Approach

The project uses Selenium WebDriver to automate browser interactions and TestNG to organize and execute automated test cases.

The testing process includes:

1. Launching the Chrome browser.
2. Navigating to the AssetFlow application.
3. Locating web elements using Selenium.
4. Performing automated user interactions.
5. Validating application behavior using TestNG assertions.
6. Closing the browser after test execution.

## Current Limitations

The following improvements can make the automation framework more reliable and maintainable:

- Implement the Page Object Model (POM).
- Replace Thread.sleep() with explicit waits.
- Move test credentials into configuration files.
- Generate unique test data for repeated execution.
- Improve exception handling and failure diagnostics.
- Add screenshots for failed test cases.
- Expand automation coverage for additional application modules.

## Future Improvements

Planned improvements for the automation framework include:

- Asset Delete Testing
- Category Management Testing
- Search and Filter Testing
- Maintenance Management Testing
- Favorites Functionality Testing
- Notification Testing
- Report and CSV Export Testing
- Profile Management Testing
- Role-Based Access Control Testing
- Cross-Browser Testing
- Automated Test Reporting
- CI/CD Integration

## Author

**MD Shakib Hasan Shafin**

Computer Science & Engineering

**Project:** AssetFlow – Selenium Automation Testing

---

⭐ If you find this project useful, feel free to explore the repository and provide feedback.

**Built with Java, Selenium WebDriver, Maven and TestNG.**
