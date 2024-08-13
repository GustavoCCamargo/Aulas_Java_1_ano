all: build run

build:
	javac -d bin Main.java
	javac -d bin aulas/Aula20.java
	javac -d bin libs/*.java
run:
	java -cp bin Main	

clear: 
	rm -r bin/*
	
git: 
	git config --global user.email "gustavocamargo203@gmail.com"
	git config --global user.name "gustavo-aula"