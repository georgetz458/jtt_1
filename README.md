# Java Technical Task 1
 I created a java project named jtt_1. I used openjdk 11.0.16.1.
I assumed that in the table the Id is the identifier of the employee and set it as a String, the In house / Outsource as a char, the date as String, hours as float, hourly rate as int and fixed cost as int.

For the logs I created the class Employee which represents a log. For the reports I created a class named Report which has two static methods. The costPerDay and rankingReport for the daily reports and the ranking reports respectively.

In the costPerDay it takes as an argument a list of logs. I represent a report using a Map with the key being the date and the value being the cost. I have two maps, one for in-house employees and one for outsourced ones. Then for every log the cost value is added to a date key to each corresponding map depending on whether the employee is outsourced or in-house. Then the reports are printed.
In the rankingReport it uses a similar logic to the previous one. The difference is that the key now is the id. After getting the maps, using stream the maps are sorted by total cost.

In the main method in Main class the sample of the logs is created and the aforementioned methods called.
