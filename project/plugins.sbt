addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
//addSbtPlugin("org.scalameta"  %% "sbt-scalafmt"          % "2.7.5")

libraryDependencies += { "org.scalatest" %% "scalatest"       % "3.0.5"  % Test }
libraryDependencies += { "org.mockito"   %  "mockito-core"    % "2.21.0" % Test }

val AkkaVersion     = "2.6.8"
val AkkaHttpVersion = "10.2.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion
)

scalacOptions ++= Seq("-encoding", "UTF-8")
