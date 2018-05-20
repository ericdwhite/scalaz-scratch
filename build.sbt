import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "scalaz-scratch",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.23",
    libraryDependencies += "org.scalaz" %% "scalaz-effect" % "7.2.23"
  )
