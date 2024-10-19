package grpc.demo.client;

import grpc.example.MessageProto.RequestMessage;
import grpc.example.MessageProto.ResponseMessage;
import grpc.example.ExampleServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientService {

    private final ExampleServiceGrpc.ExampleServiceBlockingStub blockingStub;

    public GrpcClientService() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext() // gRPC 보안 설정을 비활성화 (개발 환경에서 사용)
                .build();
        blockingStub = ExampleServiceGrpc.newBlockingStub(channel);
    }

    public String sendMessage(String message) {
        // RequestMessage 생성
        RequestMessage request = RequestMessage.newBuilder().setMessage(message).build();
        // gRPC 서버에 요청 전송
        ResponseMessage response = blockingStub.sendMessage(request);
        // 응답 반환
        return response.getReply();
    }
}
