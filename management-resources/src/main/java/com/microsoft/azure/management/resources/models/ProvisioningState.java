/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.resources.models;

/**
* Common provisioning states.
*/
public abstract class ProvisioningState {
    /**
    * The provisioning state is not specified.
    */
    public static final String NOTSPECIFIED = "NotSpecified";
    
    /**
    * The provisioning state is accepted.
    */
    public static final String ACCEPTED = "Accepted";
    
    /**
    * The provisioning state is running.
    */
    public static final String RUNNING = "Running";
    
    /**
    * The provisioning state is registering.
    */
    public static final String REGISTERING = "Registering";
    
    /**
    * The provisioning state is creating.
    */
    public static final String CREATING = "Creating";
    
    /**
    * The provisioning state is created.
    */
    public static final String CREATED = "Created";
    
    /**
    * The provisioning state is deleting.
    */
    public static final String DELETING = "Deleting";
    
    /**
    * The provisioning state is deleted.
    */
    public static final String DELETED = "Deleted";
    
    /**
    * The provisioning state is canceled.
    */
    public static final String CANCELED = "Canceled";
    
    /**
    * The provisioning state is failed.
    */
    public static final String FAILED = "Failed";
    
    /**
    * The provisioning state is succeeded.
    */
    public static final String SUCCEEDED = "Succeeded";
}
