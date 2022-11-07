# Factors
### 1.Codebase
```
https://github.com/serbalta/12factorSwe
```
### 2.Dependencies
There are 5 different pom.xml in the project. The parent module, microservice-app, contains the dependencies that all other modules use, while the child modules contain more specific dependencies.

### 3.Config
Each module has its own configuration (.yml) file. These configurations are collected under the config-server module.

### 4.Backing services
Cassandra DB is used as a backing service.
### 5.Build, release, run
There are 2 releases created on github. Moreover, since the branches used during the development phase are not deleted, the desired version can be rool
### 6.Processes
Since the twelve factor app is old, I think this factor was written before the contaniers. Each container is a process.
### 7. Port Binding
```
account-service = 8080
admin-server = 8500
config-server = 8888
```
### 9. Disposability
Since micro services are small applications, they can be started and stopped quickly.
I added restart option to all containers in dockerization branch. but I couldn't push it because I couldn't run it.
### 10.Dev/prod parity
Nowadays, through Contaniers and devOps applications, most applications provide this factor.
### 11.Logs
From the admin-service we can see the output of all microservices logs.
