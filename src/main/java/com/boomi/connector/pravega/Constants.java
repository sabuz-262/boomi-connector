/*
 * Copyright (c) 2017 Dell Inc., or its subsidiaries. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *   
 */
package com.boomi.connector.pravega;

/**
 * Defines a handful of constants shared by classes in this package.
 *
 */
public class Constants {
    protected static final String DEFAULT_SCOPE = "examples";
    protected static final String DEFAULT_STREAM_NAME = "helloStream";
    protected static final String DEFAULT_CONTROLLER_URI = "tcp://127.0.0.1:9092";
    
    protected static final String DEFAULT_ROUTING_KEY = "helloRoutingKey";
    protected static final String DEFAULT_MESSAGE = "hello world";
    
    protected static final String URI_PROPERTY = "uri";
    protected static final String SCOPE_PROPERTY = "scope";
    protected static final String NAME_PROPERTY = "name";

    protected static final String READTIMEOUT_PROPERTY = "readTimeout";
    protected static final String ROUTINGKEY_PROPERTY = "routingKey";
}