# Basic sbt template 

A basic sbt template that features:

- Basic Scala project setup
- Versioning directly tied to git
- Continuous integration and automatic publishing to Sonatype when tags are pushed

## Usage

1. Initialize project 

		sbt new jodersky/standard.g8
	   
2. Set up github repository and travis

3. Add publishing credentials to travis

		travis encrypt GPG_PASS=$(pass infra/ci-gpg) --add
		travis encrypt SONATYPE_PASS=$(pass infra/ci-sonatype) --add

