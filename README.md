#Design

###Classes:
ElevatorSystem
ElevatorCar
PassengerInfo


##Design

The system assumes basic passenger behavior: a passenger wanting to descend will not enter an ascending elevator, and vice versa.
A request for transit to or from a floor that does not exist will be rejected. Floors start at 1.

Elevator system is initialized with a list of elevator car floors, and a list for requests. System begins to cycle. 
For each cycle the list is checked for requests. If a request matches a car it is paired and removed from the request list. If no cars are moving the first car is sent. 
The list of cars is itterated and each car that has a passenger is moved one floor in the correct direction. Time passes after each car is moved simulating passage of time.
After this the cycle restarts. When a car reaches the top the direction is inversed. If it reaches bottom it will await new requests.

Empty cars will move down to the first floor and wait.
