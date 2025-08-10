mvn clean package -DskipTests
java -jar target/proj-10-0.0.1-SNAPSHOT.jar

# com --type
az webapp deploy \
  --resource-group rg-java-runner \
  --name java-runner-app \
  --src-path target/proj-10-0.0.1-SNAPSHOT.jar \
  --type jar

# sem o --type
az webapp deploy \
  --resource-group rg-java-runner \
  --name java-runner-app \
  --src-path target/proj-10-0.0.1-SNAPSHOT.jar