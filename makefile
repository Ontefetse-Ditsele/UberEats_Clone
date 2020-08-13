# Makefile 
# Ontefetse Ditsele

# A simple Makefile
# HelloWorld.class: HelloWorld.java
# javac HelloWorld.java

SRCDIR = src
BINDIR = bin
DOCDIR = doc
TESTDIR = test

JUNIT = ./src ./src/$*.java


JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR)

#to check the src and test folders for the .java files
#also to ensure that class files are in bin 
vpath %.java $(SRCDIR):$(TESTDIR)
vpath %.class $(BINDIR)

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $(JFLAGS) $<

classes: Person.class Vehicle.class Bike.class Dish.class Customer.class Driver.class Database.class \
		UberEatsResturant.class Restaurant.class UberEatsMobileApp.class UberEatsRestaurantApp.class

default: $(CLASSES)

doc:
	javadoc -d $(DOCDIR) -cp $(DOCDIR) $(SRCDIR)/*.java

test_classes: Person.class Vehicle.class Bike.class Dish.class Customer.class Driver.class Database.class \
			UberEatsResturant.class Restaurant.class UberEatsMobileApp.class UberEatsRestaurantApp.class	      

junit: test_classes
	
Person.class: Person.java
	javac -d $(BINDIR) -cp $(JUNIT)
Vehicle.class: Vehicle.java
	javac -d $(BINDIR) -cp $(JUNIT)
Bike.class: Bike.java
	javac -d $(BINDIR) -cp $(JUNIT)
Dish.class: Dish.java
	javac -d $(BINDIR) -cp $(JUNIT)
Customer.class: Customer.java
	javac -d $(BINDIR) -cp $(JUNIT)
Driver.class: Driver.java
	javac -d $(BINDIR) -cp $(JUNIT)
Database.class: Database.java
	javac -d $(BINDIR) -cp $(JUNIT)
UberEatsResturant.class: UberEatsResturant.java
	javac -d $(BINDIR) -cp $(JUNIT)
Restaurant.class: Restaurant.java
	javac -d $(BINDIR) -cp $(JUNIT)
UberEatsMobileApp.class: UberEatsMobileApp.java
	javac -d $(BINDIR) -cp $(JUNIT)
UberEatsRestaurantApp.class: UberEatsRestaurantApp.java
	javac -d $(BINDIR) -cp $(JUNIT)


clean:
	rm -f  $(BINDIR)/*.class
	rm -Rf doc