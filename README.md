Items API Project
Overview

This is a simple Java Spring Boot backend application with a minimal UI that allows you to:

Add items (ID, Name, Description)

Get item details by ID

Validation for empty fields, ID > 0, and unique IDs

The project uses in-memory storage (ArrayList), so data is lost when the app restarts.

Features

Add Item

Enter ID, Name, Description → submit → item added

Validations: ID > 0, Name & Description required, ID must be unique

Get Item by ID

Enter existing ID → submit → see item details

If ID not found → error message shown

UI

Single-page UI using Thymeleaf

Displays success/error messages

Simple styling for professional look

Requirements

Java=21+

Maven=3+

Spring Boot=3+

Browser to test UI (Chrome/Edge/Firefox)

Running the Project

Clone or extract project ZIP to local machine

Open the project in your IDE (IntelliJ/Eclipse/VS Code)

Build the project with Maven:

mvn clean install


Run the project:

mvn spring-boot:run


Open your browser → go to:

http://localhost:8081/


Note: If port 8081 is busy, update application.properties:

server.port=8081

How to Use
1. Add Item

Enter ID, Name, and Description in the “Add New Item” form

Click Add Item

See success or error messages

2. Get Item

Enter ID in “Get Item by ID” form

Click Get Item

See item details or “Item not found” message