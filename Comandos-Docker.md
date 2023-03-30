======================== config-server

.\mvnw clean package

docker build -t config-server:v1 .
docker network create spring-microservicios
docker run -p 8888:8888 --name config-server --network springcloud config-server:v1

======================== servicio-eureka-server

.\mvnw clean package

docker build -t servicio-eureka-server:v1 .
docker run -p 8761:8761 --name servicio-eureka-server --network springcloud servicio-eureka-server:v1

======================== mysql

docker pull mysql
docker run -p 3306:3306 --name microservicios-mysql --network springcloud -e MYSQL_ROOT_PASSWORD=12345678 -e MYSQL_DATABASE=db_springboot_cloud -d mysql
docker logs -f microservicios-mysql

======================== postgresql

docker pull postgres
docker run -p 5432:5432 --name microservicios-postgres --network springcloud -e POSTGRES_PASSWORD=12345678 -e POSTGRES_DB=db_springboot_cloud -d postgres
docker logs -f microservicios-postgres

======================== springboot-servicio-productos

.\mvnw clean package -DskipTests

docker build -t servicio-productos:v1 .
docker run -P --network springcloud servicio-productos:v1

======================== springboot-servicio-gateway-server

.\mvnw clean package -DskipTests

docker build -t servicio-gateway-server:v1 .
docker run -p 8090:8090 --network springcloud servicio-gateway-server:v1

======================== springboot-servicio-usuarios

.\mvnw clean package -DskipTests

docker build -t servicio-usuarios:v1 .
docker run -P --network springcloud servicio-usuarios:v1

======================== springboot-servicio-item

.\mvnw clean package -DskipTests

docker build -t servicio-items:v1 .
docker run -p 8002:8002 -p 8005:8005 -p 8007:8007 --network springcloud servicio-items:v1

======================== Otros comandos

detener y eliminar todos los contenedores:

docker stop $(docker ps -q)
docker rm $(docker ps -a -q)

eliminar todas las imagenes:

docker rmi $(docker images -a -q)
