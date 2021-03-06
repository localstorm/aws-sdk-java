/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.directory.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Radius Settings JSON Unmarshaller
 */
public class RadiusSettingsJsonUnmarshaller implements Unmarshaller<RadiusSettings, JsonUnmarshallerContext> {

    public RadiusSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        RadiusSettings radiusSettings = new RadiusSettings();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("RadiusServers", targetDepth)) {
                    context.nextToken();
                    radiusSettings.setRadiusServers(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("RadiusPort", targetDepth)) {
                    context.nextToken();
                    radiusSettings.setRadiusPort(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RadiusTimeout", targetDepth)) {
                    context.nextToken();
                    radiusSettings.setRadiusTimeout(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RadiusRetries", targetDepth)) {
                    context.nextToken();
                    radiusSettings.setRadiusRetries(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SharedSecret", targetDepth)) {
                    context.nextToken();
                    radiusSettings.setSharedSecret(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AuthenticationProtocol", targetDepth)) {
                    context.nextToken();
                    radiusSettings.setAuthenticationProtocol(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DisplayLabel", targetDepth)) {
                    context.nextToken();
                    radiusSettings.setDisplayLabel(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UseSameUsername", targetDepth)) {
                    context.nextToken();
                    radiusSettings.setUseSameUsername(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return radiusSettings;
    }

    private static RadiusSettingsJsonUnmarshaller instance;
    public static RadiusSettingsJsonUnmarshaller getInstance() {
        if (instance == null) instance = new RadiusSettingsJsonUnmarshaller();
        return instance;
    }
}
    