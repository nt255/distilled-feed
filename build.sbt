name := """play-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "com.rometools" % "rome" % "1.7.0-SNAPSHOT",
  "org.jdom" % "jdom2" % "2.0.6",
  "org.slf4j" % "slf4j-api" % "1.7.16"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
resolvers += "sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"


fork in run := true