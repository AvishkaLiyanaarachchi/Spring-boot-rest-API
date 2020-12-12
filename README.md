# Steps to run the Sprint Boot Rest API

- ### Prerequisite

 1. Wamp/xampp server
 2. IDE(IntellijIDEA/Eclipse)
 3. Soup UI/ Postman
 
 - ### Steps
 
 1. Start Wamp/xampp server
 2. Import coffee_shop_db.sql to phpMyAdmin
 3. Open coffee shop system in the IDE
 4. Go to src/main/resources/application.properties and change or reuse the server.port

 
 <img src="Images/ApplicationProperties.PNG">
 
 5. Run the project in IDE (if port changed save the project)
 6. Open Soup UI/Postman and test endpoints as bellow ( use "localhost:portnumber")
 

# End points 

- Bakery Types
1. /bakeryTypes - Fetch all bakery types from database - (GET)
2. /bakeryTypes/ID - Fetch bakery types by ID - (GET)
3. /bakeryTypes - Insert bakery types to the database - (POST)
4. /bakeryTypes - Update bakery types from database - (PUT)
5. /bakeryTypes/ID - Delete bakery types by ID - (DELETE)

- Coffee items
1. /coffeeitems - Fetch all coffee items from the database - (GET)
2. /coffeeitems/ID - Fetch coffee items by ID - (GET)
3. /coffeeitems - Insert coffee items to the database - (POST)
4. /coffeeitems - Update coffee items from database - (PUT)
5. /coffeeitems/ID - Delete coffee items by ID - (DELETE)

- Coffee Types
1. /coffeeTypes - Fetch all coffee types from database - (GET)
2. /coffeeTypes/ID - Fetch coffee types by ID - (GET)
3. /coffeeTypes - Insert coffee types to the database - (POST)
5. /coffeeTypes - Update coffee types from database - (PUT)
6. /coffeeTypes/ID - Delete coffee types by ID - (DELETE)

- Coffee shop
1. /coffeeshop - fetch all coffee shop details from database - (GET)
2. /coffeeshop/ID - Fetch coffee shop details by ID - (GET)
3. /coffeeshop - Insert coffee shop details to the database - (POST)
4. /coffeeshop - Update coffee shop details from database - (PUT)
5. /coffeeshop/ID - Delete coffee shop details by ID - (DELETE)

- Customer
1. /customer - fetch all customers from database - (GET)
2. /customer/ID - Fetch customers by ID - (GET)
3. /customer - Insert customers to the database - (POST)
4. /customer - Update customers from database - (PUT)
5. /customer/ID - Delete customers by ID - (DELETE)

- Employee
1. /employee - Fetch all employee from database - (GET)
2. /employee/ID - Fetch employees by ID - (GET)
3. /employee - Insert employee to the database - (POST)
4. /employee - Update employee from database - (PUT)
5. /employee/ID - Delete employees by ID - (DELETE)

- Order
1. /order - Fetch all order details from database - (GET)
2. /order/ID - Fetch order details by ID - (GET)
3. /order - Insert order details to the database - (POST)
4. /order - Update order details from database - (PUT)
5. /order/ID - Delete order details by ID - (DELETE)

- Payment
1. /payment - Fetch all payment details from database - (GET)
2. /payment/ID - Fetch payment details by ID - (GET)
3. /payment - Insert payment details to the database - (POST)
4. /payment - Update payment details from database - (PUT)
5. /payment/ID - Delete payment details by ID - (DELETE)

