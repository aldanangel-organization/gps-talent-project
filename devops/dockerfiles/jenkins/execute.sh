docker build -t jenkins-docker:latest .

docker run -d \
  --name jenkins \
  --restart=on-failure \
  -p 8080:8080 \
  -p 50000:50000 \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v /usr/bin/docker:/usr/bin/docker \
  -v jenkins-data:/var/jenkins_home \
  --group-add 138 \
  jenkins-docker:latest