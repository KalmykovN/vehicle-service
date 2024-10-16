# 🚗 Vehicle Service

![Vehicle Service](https://img.shields.io/badge/Vehicle%20Service-Microservice-orange)  
The **Vehicle Service** is part of the Asset Tracking System, responsible for managing vehicle-related data and operations. It provides APIs to create, read, update, and delete vehicle information, allowing for effective tracking and management.

## 🔧 Git Clone ![Git](https://img.shields.io/badge/Git-Clone-orange)

To get started with the **Vehicle Service**, you can clone the repository to your local machine:

1. **Clone the repository**:  
   Open your terminal and run the following command:

   ```bash
   git clone https://github.com/your-username/vehicle-service.git
   cd vehicle-service

## ⚙️ Maven Build ![Maven](https://img.shields.io/badge/Maven-Build-orange)

To build the **Vehicle Service**, you will use **Maven**. This process compiles the source code and packages it into a JAR file.

### Steps:

1. **Navigate to the project directory**:  
   Ensure you are in the root directory of the **Vehicle Service**.

2. **Run the Maven build command**:  
   Execute the following command to build the service:

   ```bash
   mvn clean install

## 🐳 Docker Deployment ![Docker](https://img.shields.io/badge/Docker-Deploy-orange)

The **Vehicle Service** can be easily deployed using Docker. Follow the steps below to get it running in a container.

### Steps:

1. **Ensure Docker is running**:  
   Make sure that Docker is installed and running on your machine.

2. **Build the Docker image**:  
   In the root directory of the **Vehicle Service**, run the following command to build the Docker image:
   docker build -t vehicle-service .

3. **Run the Docker container:**: 
   docker run -p 8081:8081 vehicle-service

4. **Verify the service is running:**: 
   http://localhost:8081/api/vehicles

### Troubleshooting:
   docker logs <container_id>

