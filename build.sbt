lazy val akkaHttpVersion = "10.0.10"
lazy val akkaVersion    = "2.5.4"
lazy val slickVersion   = "3.2.1"

//scalastyleSources in Compile := (unmanagedSourceDirectories in Compile).value

lazy val root = (project in file(".")).
  settings(
  inThisBuild(List(
    organization := "ko_gir.trial.http.akka",
    scalaVersion := "2.12.8")),
    name := "akka-http-trial",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest"       % "3.0.5"  % Test,
      "org.mockito"   %  "mockito-core"    % "2.21.0" % Test,

      "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-xml"        % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-stream"          % akkaVersion,
      "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion % Test,
      "com.typesafe.akka" %% "akka-testkit"         % akkaVersion     % Test,
      "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion     % Test,

      "org.postgresql" % "postgresql" % "42.2.17",

      "com.typesafe.slick"%% "slick"          % slickVersion,
      "com.typesafe.slick"%% "slick-hikaricp" % slickVersion,

      "org.json4s"     %% "json4s-native" % "3.5.3",
      "com.h2database" %  "h2"            % "1.4.196" % "test"))
