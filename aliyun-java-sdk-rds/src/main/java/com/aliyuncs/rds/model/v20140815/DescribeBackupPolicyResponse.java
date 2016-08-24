/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeBackupPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 */
public class DescribeBackupPolicyResponse extends AcsResponse {

    private String requestId;

    private Integer backupRetentionPeriod;

    private String preferredNextBackupTime;

    private String preferredBackupTime;

    private String preferredBackupPeriod;

    private String backupLog;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    public String getPreferredNextBackupTime() {
        return this.preferredNextBackupTime;
    }

    public void setPreferredNextBackupTime(String preferredNextBackupTime) {
        this.preferredNextBackupTime = preferredNextBackupTime;
    }

    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public void setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
    }

    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public void setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
    }

    public String getBackupLog() {
        return this.backupLog;
    }

    public void setBackupLog(String backupLog) {
        this.backupLog = backupLog;
    }

    @Override
    public DescribeBackupPolicyResponse getInstance(UnmarshallerContext context) {
        return DescribeBackupPolicyResponseUnmarshaller.unmarshall(this, context);
    }
}
