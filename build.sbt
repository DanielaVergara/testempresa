name := """testEmpresa"""
organization := "testEmpresa"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += javaJdbc
libraryDependencies += "com.h2database" % "h2" % "1.4.192"
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.16"
libraryDependencies += javaWs
