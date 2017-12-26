#!/usr/bin/env bash
cd ..
gradle clean; gradle build
cd -

cp ../build/libs/notes-backend-1.0.0.jar notes-backend-1.0.0.jar
cp ../application.yml application.yml

docker build -t yashvijaydocker/notes-backend:YV241117 .
"To push execute:"
echo "docker push yashvijaydocker/notes-backend:YV241117"
