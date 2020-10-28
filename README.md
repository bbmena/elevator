#Design

###Classes:
ElevatorSystem
ElevatorCar
PassengerInfo


##Design

The system assumes basic passenger behavior: a passenger wanting to descend will not enter an ascending elevator, and vice versa.
A request for transit to or from a floor that does not exist will be rejected.

Elevator system is initialized with a list of elevator car floors, and a queue for requests. System begins to cycle. 
For each cycle the queue is checked for requests. If a request is present it is offloaded to the nearest car based on the car's current direction. If no cars are moving the first car is sent. 
The list of cars is itterated and each car that has a passenger is moved one floor in the correct direction. Time passes after each car is moved simulating passage of time.
After this the cycle restarts. When a car reaches the top the direction is inversed. If it reaches bottom it will await new requests.
