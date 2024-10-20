package grpc.demo.client;

import grpc.example.MessageProto.RequestMessage;
import grpc.example.MessageProto.ResponseMessage;
import grpc.example.ExampleServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;


@Service
public class GrpcClientAsyncService {

    private final ExampleServiceGrpc.ExampleServiceStub asyncStub;

    public GrpcClientAsyncService() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        asyncStub = ExampleServiceGrpc.newStub(channel);
    }

    public void sendMessageAsync(String message, StreamObserver<ResponseMessage> responseObserver) {
        // RequestMessage 생성
        RequestMessage request = RequestMessage.newBuilder().setMessage(message).build();
        // 비동기 gRPC 서버 호출
        asyncStub.sendMessage(request, responseObserver);
    }
}
