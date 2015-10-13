/*
 *  Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.mss.internal.router.beanconversion;

import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * Media type converter for text/json,
 * application/json mime types
 */
public class JsonConverter implements MediaTypeConverter {

    private final static Gson gson = new Gson();

    @Override
    public Object toMedia(Object object) {
        return gson.toJson(object);
    }

    @Override
    public Object toObject(String content, Type targetType) {
        return gson.fromJson(content, targetType);
    }
}