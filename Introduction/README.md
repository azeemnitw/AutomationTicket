
# Travel Booking Automation

This project automates the process of booking a dummy travel ticket using Selenium WebDriver with Java. The script interacts with the web elements on the [Dummy Ticket website](https://www.dummyticket.com/) to fill in the required fields, select options, and place an order.

## Prerequisites

- **Java Development Kit (JDK)**: Ensure Java is installed and properly configured in your system.
- **Maven**: Ensure Maven is installed for managing dependencies.
- **Selenium WebDriver**: Add Selenium dependencies to your project.
- **Browser Driver**: ChromeDriver is required to execute this script on Google Chrome.
- **IDE**: An IDE such as IntelliJ IDEA, Eclipse, or VS Code for Java development.

## Setup

1. **Install ChromeDriver**:
   - Download ChromeDriver from [ChromeDriver Downloads](https://sites.google.com/chromium.org/driver/).
   - Place the executable in a directory and add it to your system's PATH.

2. **Add Selenium Dependency**:
   - If using Maven, include the following in your `pom.xml`:
     ```xml
     <dependency>
         <groupId>org.seleniumhq.selenium</groupId>
         <artifactId>selenium-java</artifactId>
         <version>4.10.0</version>
     </dependency>
     ```

3. **Configure the Project**:
   - Create a new Java project in your IDE and add the Selenium dependency.
   - Ensure the ChromeDriver path is correctly set in your environment.

## How It Works

The script performs the following steps:

1. **Launch Chrome Browser**:
   - Initializes a ChromeDriver instance and maximizes the browser window.
   - Navigates to the [Dummy Ticket website](https://www.dummyticket.com/).

2. **Interact with Web Elements**:
   - Clicks the "Buy Ticket" link.
   - Fills out traveler details such as first name, last name, and date of birth.
   - Selects gender and travel type.
   - Inputs departure and destination cities.

3. **Select Dates**:
   - Selects departure and return dates using dropdowns for year, month, and specific date.

4. **Select Delivery Method**:
   - Chooses delivery method options for email and WhatsApp.

5. **Billing Information**:
   - Fills out billing details such as email, phone number, address, city, state, and postal code.

6. **Place Order**:
   - Submits the form by clicking the "Place Order" button.

## Code Walkthrough

The main functionalities of the script are organized as follows:

- **Initialization**:
  ```java
  WebDriver dr = new ChromeDriver();
  dr.manage().window().maximize();
  dr.get("https://www.dummyticket.com/");
  ```

- **Selecting Options**:
  ```java
  WebElement ddown = dr.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
  Select sel = new Select(ddown);
  sel.selectByValue("5");  // Example for selecting a month
  ```

- **Filling Forms**:
  ```java
  dr.findElement(By.id("billing_email")).sendKeys("prashant@gmail.com");
  dr.findElement(By.id("billing_phone")).sendKeys("9966885577");
  ```

- **Submitting the Form**:
  ```java
  dr.findElement(By.id("place_order")).click();
  ```

## Running the Script

1. **Compile and Run**:
   - Compile the program in your IDE or via the command line:
     ```sh
     javac TravelBooking.java
     java TravelBooking
     ```

2. **Observe Results**:
   - The browser will open, execute the automated steps, and place the order.

## Notes

- **Error Handling**: Ensure proper exception handling for elements not found or other runtime errors.
- **Dynamic Waits**: Use explicit waits to handle dynamically loaded elements instead of relying solely on implicit waits.
- **Customization**: Modify input fields and XPath values based on the changes in the website structure.

## Disclaimer

This script is for educational and demonstration purposes only. Ensure compliance with the website's terms of service before executing any automated scripts.
