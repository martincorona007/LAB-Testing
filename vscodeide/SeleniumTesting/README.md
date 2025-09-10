
gradle test //run the program 
gradle clean test //cache issues
gradle test --rerun-tasks //nothing changes want to see results
gradle test --test "mytest" // working on a specific feature


Adding .feature

tasks.named('test') {
    systemProperty "cucumber.options", System.getProperty("cucumber.options")
}
Qué hace: Permite pasar parámetros extra cuando ejecutes las pruebas desde la línea de comandos.

Selenium + JUnit + Cucumber +
Think of TestRunner as the "conductor" that coordinates the whole orchestra! 🎼


IDE
Intellij select maven and gradle and will create a single app project
CLI 
We can create 
single application project //simple files
application and library project // complex

Select build script DSL:
  1: Kotlin
  2: Groovy

Select type of build to generate:
  1: Application
    // includes main() and application plugin
  2: Library 
  // also ca be used, just remove unncessary code genarate 
  3: Gradle plugin 
  // the way it was used this project(with vscode extension,can also be used with gradle init), just remove java app bcs this is framework of automation
  4: Basic (build structure only) 
  // as the name says


  