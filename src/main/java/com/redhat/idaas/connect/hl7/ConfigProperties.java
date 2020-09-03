/*
 * Copyright 2019 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package com.redhat.idaas.connect.hl7;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "idaas")
public class ConfigProperties {

    private String kafkaHost = "localhost";

    private int kafkaPort = 9092;

    private int adtPort = 10001;

    private int ormPort = 10002;

    private int oruPort = 10003;

    private int rdePort = 10004;

    private int mfnPort = 10005;

    private int mdmPort = 10006;

    private int schPort = 10007;

    private int vxuPort = 10008;

    public String getKafkaHost() {
        return kafkaHost;
    }

    public int getKafkaPort() {
        return kafkaPort;
    }

    public int getAdtPort() {
        return adtPort;
    }

    public int getOrmPort() {
        return ormPort;
    }

    public int getOruPort() {
        return oruPort;
    }

    public int getRdePort() {
        return rdePort;
    }

    public int getMfnPort() {
        return mfnPort;
    }

    public int getMdmPort() {
        return mdmPort;
    }

    public int getSchPort() {
        return schPort;
    }

    public int getVxuPort() {
        return vxuPort;
    }
}
