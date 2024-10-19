# gRPC - Django Server - Spring Client - Starter
### This project demonstrates a basic setup of a gRPC-based communication between a Django server and a Spring client.

# How to Run
## 1. Start the Django Server
Run the following command to start the gRPC server in the Django project:

```python3 django_server/server/grpc_server/grpc_server.py```

## 2. Start the Spring Client
Follow the appropriate steps to start the Spring client application.

## 3. Test the Communication
Send a request to the Spring client by accessing the following URL in your browser or using a tool like curl:

web: ```http://localhost:8080/send?message=hello``` 

cmd: ```curl "http://localhost:8080/send?message=hello"```

Response: ```Received your message: hello :)```

## Questions
Feel free to reach out to me at x1xgudwls@naver.com.
