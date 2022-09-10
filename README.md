
# Statistics Calculation System

Statistics Calculation System for finding minimum/maximum/average/median/percentile. 


# Execution

use mvn clean install to build the system. (Tests can be tested separately )
Run MathProjApplication to run the system. (mvn spring-boot:run)
Then use below  operations to use the system.

min/max/avg/median uses basic list to transfer data
percentile uses the custom json object to transfer date

# GET
	http://localhost:8081/mathproj/min

["1", "23","22"]

# GET 
	http://localhost:8081/mathproj/max

["1", "23","22"]

# GET
	http://localhost:8081/mathproj/avg

["1", "23","22"]

# GET
	http://localhost:8081/mathproj/median

["1", "23","22"]

# GET
	http://localhost:8081/mathproj/percentile

	{
		"list" : [1234, 5678,89900,78],
		"percentile" : 95
	}
