# grpc_server/grpc_server.py
import grpc
from concurrent import futures
from server.grpc_server.protobufs import service_pb2, service_pb2_grpc


class ExampleService(service_pb2_grpc.ExampleServiceServicer):
    def SendMessage(self, request, context):
        response = service_pb2.ResponseMessage()
        response.reply = f"Received your message: {request.message} :) "
        return response

def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    service_pb2_grpc.add_ExampleServiceServicer_to_server(ExampleService(), server)
    server.add_insecure_port('[::]:50051')
    server.start()
    print("gRPC server is running on port 50051...")
    server.wait_for_termination()

if __name__ == '__main__':
    serve()
