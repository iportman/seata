/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.spring.boot.autoconfigure.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import static io.seata.common.DefaultValues.DEFAULT_ENABLE_CLIENT_BATCH_SEND_REQUEST;
import static io.seata.common.DefaultValues.DEFAULT_ENABLE_RM_CLIENT_BATCH_SEND_REQUEST;
import static io.seata.common.DefaultValues.DEFAULT_ENABLE_TM_CLIENT_BATCH_SEND_REQUEST;
import static io.seata.common.DefaultValues.DEFAULT_TRANSPORT_HEARTBEAT;
import static io.seata.spring.boot.autoconfigure.StarterConstants.TRANSPORT_PREFIX;

/**
 * @author xingfudeshi@gmail.com
 */
@Component
@ConfigurationProperties(prefix = TRANSPORT_PREFIX)
public class TransportProperties {
    /**
     * tcp, unix-domain-socket
     */
    private String type = "TCP";
    /**
     * NIO, NATIVE
     */
    private String server = "NIO";
    /**
     * enable heartbeat
     */
    private boolean heartbeat = DEFAULT_TRANSPORT_HEARTBEAT;
    /**
     * serialization
     */
    private String serialization = "seata";
    /**
     * compressor
     */
    private String compressor = "none";

    /**
     * enable client batch send request
     */
    private boolean enableClientBatchSendRequest = DEFAULT_ENABLE_CLIENT_BATCH_SEND_REQUEST;

    /**
     * enable TM client batch send request
     */
    private boolean enableTmClientBatchSendRequest = DEFAULT_ENABLE_TM_CLIENT_BATCH_SEND_REQUEST;

    /**
     * enable RM client batch send request
     */
    private boolean enableRmClientBatchSendRequest = DEFAULT_ENABLE_RM_CLIENT_BATCH_SEND_REQUEST;

    public String getType() {
        return type;
    }

    public TransportProperties setType(String type) {
        this.type = type;
        return this;
    }

    public String getServer() {
        return server;
    }

    public TransportProperties setServer(String server) {
        this.server = server;
        return this;
    }

    public boolean isHeartbeat() {
        return heartbeat;
    }

    public TransportProperties setHeartbeat(boolean heartbeat) {
        this.heartbeat = heartbeat;
        return this;
    }

    public String getSerialization() {
        return serialization;
    }

    public TransportProperties setSerialization(String serialization) {
        this.serialization = serialization;
        return this;
    }

    public String getCompressor() {
        return compressor;
    }

    public TransportProperties setCompressor(String compressor) {
        this.compressor = compressor;
        return this;
    }

    public boolean isEnableClientBatchSendRequest() {
        return enableClientBatchSendRequest;
    }

    public TransportProperties setEnableClientBatchSendRequest(boolean enableClientBatchSendRequest) {
        this.enableClientBatchSendRequest = enableClientBatchSendRequest;
        return this;
    }

    public boolean isEnableTmClientBatchSendRequest() {
        return enableTmClientBatchSendRequest;
    }

    public TransportProperties setEnableTmClientBatchSendRequest(boolean enableTmClientBatchSendRequest) {
        this.enableTmClientBatchSendRequest = enableTmClientBatchSendRequest;
        return this;
    }

    public boolean isEnableRmClientBatchSendRequest() {
        return enableRmClientBatchSendRequest;
    }

    public TransportProperties setEnableRmClientBatchSendRequest(boolean enableRmClientBatchSendRequest) {
        this.enableRmClientBatchSendRequest = enableRmClientBatchSendRequest;
        return this;
    }
}
