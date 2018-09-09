#	Virtual Pet Project

**WeCanCodeIt Module 2 Project**

##	Objectives

Create a virtual pet with multiple attributes.  Main method will cause a tick() rate to calculate the amount of time that has passed, and likely change attributes of the pet.  User will be able to interact with the pet during the process, also modifying attributes with those interactions.

###	Attributes for the virtual pet

Attributes will have various ratings.  Ratings will be displayed to the user as an adjective, telling the user the well-being of the pet.  The pet will leave if any attribute gets out of control.

*	Hunger
*	Thirst
*	Sickness
*	Boredom


### Additions to the Project that may differ from others

*	There are a variety of pets, utilizing an abstract base and all pets inherit this base.
	*	Each pet has their own ascii display
		* Though the "Simple" pet has mulitple ones.  It will be chosen at runtime creation
	*	Each pet has their own starting attribute values and issues
*	While all attributes have an int value, user will only see adjectives and have to make appropriate decisions to keep care of their pet
*	Pet can be ignored.  It is not advised.
*	Tick does pass a parameter, checking the previous Action and not affecting that attribute (pet that's fed shouldn't suddenly get hungrier, right??)



###	Rubric Items that are scored in the process (must be present)

*	tick() method	
*	Three VirtualPet instance variable	
*	Three VirtualPet methods	
*	implement game loop	
*	ask for user input	
*	write output to the console	
*	style/formatting/code quality