name := "$project_name$"

crossScalaVersions in ThisBuild := List("2.12.1")
scalaVersion in ThisBuild := (crossScalaVersions in ThisBuild).value.head
scalacOptions in ThisBuild ++= Seq(
  "-deprecation",
  "-feature",
  "-Xfatal-warnings",
  "-Xlint"
)
