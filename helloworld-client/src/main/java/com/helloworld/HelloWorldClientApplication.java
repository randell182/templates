/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.helloworld;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@SpringBootApplication
@EnableEurekaClient
public class HelloWorldClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloWorldClientApplication.class)
                .web(false)
                .run(args);
    }
}

@Component
class HelloWorldClient implements CommandLineRunner {

    private Log log = LogFactory.getLog(HelloWorldClient.class);

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void run(String... strings) throws Exception {

        Map response  =
                this.restTemplate.getForObject("http://helloworld-service/helloworld",Map.class);
        log.info(response.get("msg"));
    }

}
