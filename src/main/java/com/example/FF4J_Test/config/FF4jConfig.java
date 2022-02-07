/*
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2013-2016 the original author or authors.
 */

package com.example.FF4J_Test.config;

import org.ff4j.FF4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * Definition of FF4j Bean. This definition should be done not only
 * in the backend with web console and rest API but also in your microservices.
 */
@Configuration
public class FF4jConfig {
    
    
	@SuppressWarnings("deprecation")
	@Bean
    public FF4j getFF4j() {
        /*
         * 0. Create bean needed for your stores based on the technology you want to use
         * 
         * Because I pick in memory store, I want to load init values from a file I can use 
         * YAML, XML or properties File. This is optional you can start with empty store
         * or even create feature programmatically.
         */
//        InputStream dataSet = FF4j.class.getClassLoader().getResourceAsStream("NewFile.xml");
//        // We imported ff4j-config-yaml to have this
//        FF4jConfiguration initConfig = new YamlParser().parseConfigurationFile(dataSet);
//        LOGGER.info("Default features have been loaded {}", initConfig.getFeatures().keySet());
//        
//        // 1. Define the store you want for Feature, Properties, Audit among 20 tech
//        FeatureStore  featureStore  = new InMemoryFeatureStore(initConfig);
//        PropertyStore propertyStore = new InMemoryPropertyStore(initConfig);
//        EventRepository logsAudit   = new InMemoryEventRepository();
//        
//        // 2. Build FF4j
//        FF4j ff4jBean = new FF4j();
//        ff4jBean.setPropertiesStore(propertyStore);
//        ff4jBean.setFeatureStore(featureStore);
//        ff4jBean.setEventRepository(logsAudit);
//        
//        // 3. Complete setup
//        ff4jBean.setEnableAudit(true);
//        ff4jBean.setAutocreate(true);
//        return ff4jBean;
//        
//        // you can do the same in 1 line
        return new FF4j("FF4JFeatures.xml").audit(true).autoCreate(true);
    }
}

