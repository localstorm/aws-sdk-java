/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 */
public class GetCloudFrontOriginAccessIdentityResult {

    /**
     * The origin access identity's information.
     */
    private CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity;

    /**
     * The current version of the origin access identity's information. For
     * example: E2QWRUHAPOMQZL.
     */
    private String eTag;

    /**
     * The origin access identity's information.
     *
     * @return The origin access identity's information.
     */
    public CloudFrontOriginAccessIdentity getCloudFrontOriginAccessIdentity() {
        return cloudFrontOriginAccessIdentity;
    }
    
    /**
     * The origin access identity's information.
     *
     * @param cloudFrontOriginAccessIdentity The origin access identity's information.
     */
    public void setCloudFrontOriginAccessIdentity(CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity) {
        this.cloudFrontOriginAccessIdentity = cloudFrontOriginAccessIdentity;
    }
    
    /**
     * The origin access identity's information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cloudFrontOriginAccessIdentity The origin access identity's information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetCloudFrontOriginAccessIdentityResult withCloudFrontOriginAccessIdentity(CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity) {
        this.cloudFrontOriginAccessIdentity = cloudFrontOriginAccessIdentity;
        return this;
    }
    
    
    /**
     * The current version of the origin access identity's information. For
     * example: E2QWRUHAPOMQZL.
     *
     * @return The current version of the origin access identity's information. For
     *         example: E2QWRUHAPOMQZL.
     */
    public String getETag() {
        return eTag;
    }
    
    /**
     * The current version of the origin access identity's information. For
     * example: E2QWRUHAPOMQZL.
     *
     * @param eTag The current version of the origin access identity's information. For
     *         example: E2QWRUHAPOMQZL.
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }
    
    /**
     * The current version of the origin access identity's information. For
     * example: E2QWRUHAPOMQZL.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eTag The current version of the origin access identity's information. For
     *         example: E2QWRUHAPOMQZL.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetCloudFrontOriginAccessIdentityResult withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("CloudFrontOriginAccessIdentity: " + cloudFrontOriginAccessIdentity + ", ");
        sb.append("ETag: " + eTag + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    