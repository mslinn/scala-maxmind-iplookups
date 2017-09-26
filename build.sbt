name          := "scala-maxmind-iplookups"

organization  := "com.snowplowanalytics"

version       := "0.4.0"

description   := "Scala wrapper for MaxMind GeoIP library"

scalaVersion  := "2.12.3"

crossScalaVersions := Seq("2.11.11", "2.12.3")

licenses +=  ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  "-Ywarn-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture",
  "-Xlint",
  "-target:jvm-1.8",
  "-Ywarn-unused"
)

val maxMindVer = "1.2.11"
val specs2Ver  = "3.9.5"

libraryDependencies ++= Seq(
  "com.maxmind.geoip" % "geoip-api" % maxMindVer,
  "com.google.guava" % "guava" % "18.0",
  "org.specs2" %% "specs2-core"  % specs2Ver % Test,
  "org.specs2" %% "specs2-junit" % specs2Ver % Test,
  "org.specs2" %% "specs2-mock"  % specs2Ver % Test
)

resolvers += "ScalaTools snapshots at Sonatype" at "https://oss.sonatype.org/content/repositories/snapshots/"

/*publishTo := version { version =>
  val basePath = "target/repo/%s".format {
    if (version.trim.endsWith("SNAPSHOT")) "snapshots/" else "releases/"
  }
  Some(Resolver.file("Local Maven repository", file(basePath)) transactional())
}.value*/
