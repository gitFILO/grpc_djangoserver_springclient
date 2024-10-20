package grpc.demo.client;

import grpc.demo.client.GrpcClientService;
import grpc.demo.client.GrpcClientAsyncService;
import grpc.example.MessageProto.ResponseMessage;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {

    @Autowired
    private GrpcClientService grpcClientService;

    @Autowired
    private GrpcClientAsyncService grpcClientAsyncService;

    @GetMapping("/send")
    public String sendGrpcMessage(@RequestParam String message) {
        return grpcClientService.sendMessage(message);
    }

    @GetMapping("/sendasync")
    public String sendGrpcMessageAsync(@RequestParam String message) {
        // 비동기 gRPC 호출
        grpcClientAsyncService.sendMessageAsync(message, new StreamObserver<ResponseMessage>() {
            @Override
            public void onNext(ResponseMessage responseMessage) {
                // 서버로부터 응답이 도착했을 때 호출
                System.out.println("Received async response: " + responseMessage.getReply());
            }

            @Override
            public void onError(Throwable throwable) {
                // 오류가 발생했을 때 호출
                System.err.println("Async gRPC call error: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                // 서버의 응답 스트림이 완료되었을 때 호출
                System.out.println("Async request completed");
            }
        });

        // 비동기 호출이므로 즉시 응답
        return "Async request has been sent";
    }
}
