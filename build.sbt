name := "MUD"
version := "1.0"
scalaVersion := "2.12.8"

//mainClass in (Compile, packageBin) := Some("mud.Main")

//mainClass in (Compile, run) := Some("mud.Main")

libraryDependencies ++= Seq(
	"org.scala-lang.modules" %% "scala-xml" % "1.2.0",
	"com.novocode" % "junit-interface" % "0.11" % Test,
	"org.scalactic" %% "scalactic" % "3.0.8",
	"org.scalatest" %% "scalatest" % "3.0.8" % "test"
)

scalacOptions ++= Seq("-deprecation", "-feature")

