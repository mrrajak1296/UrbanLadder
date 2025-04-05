# UrbanLadder

## Overview
This project is a Selenium-based automation framework developed for testing the Urban Ladder website. It uses TestNG for test execution and reporting, and Maven for project management.

## Project Structure
```
mrrajak1296-urbanladder/
├── pom.xml                     # Maven configuration file
├── testng.xml                  # TestNG suite configuration
│
├── src/
│   └── test/
│       └── java/
│           └── urbantest/
│               └── urban.java  # Main test class containing test scripts
│
└── test-output/
    ├── emailable-report.html     # Email-friendly summary report
    ├── index.html                # Main TestNG report dashboard
    ├── testng-results.xml        # Test results in XML format
    ├── Default suite/            # Default suite reports
    ├── junitreports/             # JUnit-compatible reports
    └── Suite/                    # Custom TestNG suite reports
```

## Getting Started

### Prerequisites
- Java (JDK 8 or above)
- Maven
- TestNG
- IDE (Eclipse)

### Installation
1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/mrrajak1296-urbanladder.git
   cd mrrajak1296-urbanladder
   ```
2. **Build the project:**
   ```sh
   mvn clean install
   ```
3. **Run the tests:**
   ```sh
   mvn test
   ```
   Or use the `testng.xml` file in your IDE for manual execution.

## Test Reports
After test execution, open `test-output/index.html` in any browser to view the detailed TestNG report.

## Technologies Used
- **Java** - Core programming language
- **Selenium WebDriver** - Web automation tool
- **TestNG** - Testing framework for test case execution and reporting
- **Maven** - Project build and dependency management


