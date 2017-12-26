#!/bin/bash

#docker pull yashvijaydocker/notes-backend:YV241117

#docker rm -f notes-backend

docker run \
     -d \
     --name notes-backend \
     --restart always \
     --link mongodb \
      -e spring.datasource.url='jdbc:mysql://mysql_test:3309/sampledb' \
      -e spring.datasource.userName='root' \
      -e spring.datasource.password='root' \
      -e spring.jpa.hibernate.ddl-auto='update' \
    -p 8892:8080 \
    yashvijaydocker/notes-backend:YV101117
