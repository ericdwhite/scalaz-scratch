# Minimallist Scalaz Hello World App

This assumes you are using OSX, have Java 8 or greater
installed and have brew installed.

    $ brew install sbt

## Hello World

Using `https://github.com/scala/scala-seed.g8` create a Hello World application.

    $ sbt new scala/scala-seed.g8 --name=scalaz-scratch
    $ cd scalaz-scratch
    $ sbt run 
      [info] Running example.Hello
      hello
      [success]

## Adding in scalaz

As per https://github.com/scalaz/scalaz add to `build.sbt`:

    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.23",
    libraryDependencies += "org.scalaz" %% "scalaz-effect" % "7.2.23"

## Using scalaz in the HelloWorld App

Replace `src/main/example/Hello.scala` with:

```scala
    package example

    import scalaz.effect.IO
    import scalaz.effect.IO.putStrLn

    object Hello extends Greeting with App {
    
      def greeting: String = "hello"
    
      val printHello: IO[Unit] = putStrLn(greeting)
    
      printHello.unsafePerformIO
    }
    
    trait Greeting {
      def greeting: String
    }
```

Running the scalaz version

    $ sbt run
      [info] Running example.Hello
      hello
      [success]

or

    $ sbt console
    scala> example.Hello.main(Array())

## Running the tests

    $ sbt test

# Where to go next

http://eed3si9n.com/learning-scalaz/

