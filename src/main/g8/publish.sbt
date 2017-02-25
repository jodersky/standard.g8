organization in ThisBuild := "ch.jodersky"
publishTo in ThisBuild := {
  if (version.value.contains("SNAPSHOT"))
    Some("snapshots" at "https://oss.sonatype.org/content/repositories/snapshots")
  else
    Some("releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2")
}
publishArtifact in Test in ThisBuild := false
licenses in ThisBuild := Seq("GPL 3.0" -> url("http://www.gnu.org/licenses/gpl-3.0.en.html"))
homepage in ThisBuild := Some(url("http://github.com/jodersky/$project_name$"))
pomExtra in ThisBuild := {
  <scm>
    <url>git@github.com:jodersky/$project_name$.git</url>
    <connection>scm:git:git@github.com:jodersky/$project_name$.git</connection>
  </scm>
  <developers>
    <developer>
      <id>jodersky</id>
      <name>Jakob Odersky</name>
    </developer>
  </developers>
}
