.PHONY = run build clean

run:
	java -jar ./target/App-jar-with-dependencies.jar

build:
	mvn clean compile assembly:single

clean:
	mvn clean
