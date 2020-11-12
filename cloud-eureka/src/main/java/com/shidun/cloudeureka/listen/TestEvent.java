package com.shidun.cloudeureka.listen;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TestEvent {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        System.out.println("下线了"+ event.getServerId() +":" +event.getAppName());
    }
}
