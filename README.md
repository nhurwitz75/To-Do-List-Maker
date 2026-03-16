#To-DO List Maker 
A command-line to-do list app that organizes tasks by category (work, personal, school).

##Requirements 
- Java JDK 17 or higher

## How to Run 

###Option 1: Compile and Run Directly 
```bash
javac -d . Todo.java
java todo.Todo
```
###Option 2: Package and Run as a JAR 
```bash
javac -d . Todo.java
jar cfe Todo.jar todo.Todo todo/Todo.class
java -jar Todo.jar
```

##Usage 
- Type `add` to add a task
- Type `remove` to remove a task
- Type `change` to edit a task
- Type `done` to finish and see your final lists 
