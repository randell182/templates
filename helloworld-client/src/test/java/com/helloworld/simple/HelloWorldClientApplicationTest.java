/*
 * Copyright 2012-2014 the original author or authors.
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

package com.helloworld.simple;

import com.helloworld.HelloWorldClientApplication;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * Tests for {@link com.helloworld.HelloWorldClientApplication}.
 * 
 * @author Randell
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HelloWorldClientApplication.class)
public class HelloWorldClientApplicationTest {


    @Autowired
    private RestTemplate restTemplate;

	@Test
    @Ignore
	public void testSayHello() throws Exception {

        Map response  =
                this.restTemplate.getForObject("http://helloworld-service/helloworld",Map.class);
        Assert.assertEquals("Hello World", response.get("msg"));

	}

}
