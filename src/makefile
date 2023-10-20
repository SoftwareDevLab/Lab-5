# Variables
JAVAC = javac
JAVA = java
CLASSPATH = ./

# Default target
default: compile

# Target to compile the program
compile:
	$(JAVAC) $(CLASSPATH)com/gradescope/DoubleQueue/code/*.java
	$(JAVAC) $(CLASSPATH)Driver/*.java

# Target to run the program
run:
	$(JAVA) -cp $(CLASSPATH) Driver.DoubleQueueDriver

# Target to clean the .class files
clean:
	rm $(CLASSPATH)com/gradescope/DoubleQueue/code/*.class
	rm $(CLASSPATH)Driver/*.class



