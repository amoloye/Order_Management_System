# Order_Management_System
ORDER MANAGEMENT SYSTEM API:

	MODEL DESCRIPTION: (this will have its own evaluation in points)
	- An Order is made of N OrderLine and is related to a Customer, and has a date of submission
	- Each OrderLine is made of a Product and a quantity
	- A Product has a name, skuCode, unitPrice
	- A Customer has a registrationCode, fullName, email, telephone

	DAO LAYER:
	- You can use Spring Data 												 

	SERVICE LAYER:
	- Implement OrderService, ProductService, CustomerService class with all business logic.

	API:
	- Provide api for following services:
	- Create customer
	- Create product
	- Create order
	- Search all orders by date
