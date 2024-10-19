package grpc.demo.client;

import grpc.demo.client.GrpcClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {

    @Autowired
    private GrpcClientService grpcClientService;

    @GetMapping("/send")
    public String sendGrpcMessage(@RequestParam String message) {
        return grpcClientService.sendMessage(message);
    }
}