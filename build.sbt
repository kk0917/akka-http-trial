// give the user a nice default project!
ThisBuild / organization := "ko_gir.trial.http.akka"
ThisBuild / scalaVersion := "2.12.8"

//scalastyleSources in Compile := (unmanagedSourceDirectories in Compile).value

lazy val root = (project in file(".")).
  settings(
    name := "akka-http-trial")
