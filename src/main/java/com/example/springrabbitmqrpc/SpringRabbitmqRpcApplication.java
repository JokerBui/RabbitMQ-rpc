package com.example.springrabbitmqrpc;

import com.example.springrabbitmqrpc.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRabbitmqRpcApplication implements CommandLineRunner {

    @Autowired
    private Client client;

    public static void main(String[] args) {
        SpringApplication.run(SpringRabbitmqRpcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i < 10; i++) {
            client.send(i);
        }
    }
}
