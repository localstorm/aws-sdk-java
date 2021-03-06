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
package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * A code and name pair that represent a severity level that can be
 * applied to a support case.
 * </p>
 */
public class SeverityLevel implements Serializable, Cloneable {

    /**
     * One of four values: "low," "medium," "high," and "urgent". These
     * values correspond to response times returned to the caller in
     * <code>SeverityLevel.name</code>.
     */
    private String code;

    /**
     * The name of the severity level that corresponds to the severity level
     * code.
     */
    private String name;

    /**
     * One of four values: "low," "medium," "high," and "urgent". These
     * values correspond to response times returned to the caller in
     * <code>SeverityLevel.name</code>.
     *
     * @return One of four values: "low," "medium," "high," and "urgent". These
     *         values correspond to response times returned to the caller in
     *         <code>SeverityLevel.name</code>.
     */
    public String getCode() {
        return code;
    }
    
    /**
     * One of four values: "low," "medium," "high," and "urgent". These
     * values correspond to response times returned to the caller in
     * <code>SeverityLevel.name</code>.
     *
     * @param code One of four values: "low," "medium," "high," and "urgent". These
     *         values correspond to response times returned to the caller in
     *         <code>SeverityLevel.name</code>.
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * One of four values: "low," "medium," "high," and "urgent". These
     * values correspond to response times returned to the caller in
     * <code>SeverityLevel.name</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code One of four values: "low," "medium," "high," and "urgent". These
     *         values correspond to response times returned to the caller in
     *         <code>SeverityLevel.name</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SeverityLevel withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * The name of the severity level that corresponds to the severity level
     * code.
     *
     * @return The name of the severity level that corresponds to the severity level
     *         code.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the severity level that corresponds to the severity level
     * code.
     *
     * @param name The name of the severity level that corresponds to the severity level
     *         code.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the severity level that corresponds to the severity level
     * code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the severity level that corresponds to the severity level
     *         code.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SeverityLevel withName(String name) {
        this.name = name;
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
        if (getCode() != null) sb.append("Code: " + getCode() + ",");
        if (getName() != null) sb.append("Name: " + getName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SeverityLevel == false) return false;
        SeverityLevel other = (SeverityLevel)obj;
        
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        return true;
    }
    
    @Override
    public SeverityLevel clone() {
        try {
            return (SeverityLevel) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    