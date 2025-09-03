
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