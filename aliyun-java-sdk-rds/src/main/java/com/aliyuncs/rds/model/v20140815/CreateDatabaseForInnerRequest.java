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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 */
public class CreateDatabaseForInnerRequest extends RpcAcsRequest<CreateDatabaseForInnerResponse> {

    public CreateDatabaseForInnerRequest() {
        super("Rds", "2014-08-15", "CreateDatabaseForInner");
    }

    private Long ownerId;

    private String resourceOwnerAccount;

    private Long resourceOwnerId;

    private String dBInstanceId;

    private String dBName;

    private String characterSetName;

    private String dBDescription;

    private String accountName;

    private String accountPrivilege;

    private String accountPassword;

    private String ownerAccount;

    public Long getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        putQueryParameter("OwnerId", String.valueOf(ownerId));
    }

    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
    }

    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public void setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        putQueryParameter("ResourceOwnerId", String.valueOf(resourceOwnerId));
    }

    public String getDBInstanceId() {
        return this.dBInstanceId;
    }

    public void setDBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
        putQueryParameter("DBInstanceId", dBInstanceId);
    }

    public String getDBName() {
        return this.dBName;
    }

    public void setDBName(String dBName) {
        this.dBName = dBName;
        putQueryParameter("DBName", dBName);
    }

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        putQueryParameter("CharacterSetName", characterSetName);
    }

    public String getDBDescription() {
        return this.dBDescription;
    }

    public void setDBDescription(String dBDescription) {
        this.dBDescription = dBDescription;
        putQueryParameter("DBDescription", dBDescription);
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
        putQueryParameter("AccountName", accountName);
    }

    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public void setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        putQueryParameter("AccountPrivilege", accountPrivilege);
    }

    public String getAccountPassword() {
        return this.accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        putQueryParameter("AccountPassword", accountPassword);
    }

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        putQueryParameter("OwnerAccount", ownerAccount);
    }

    @Override
    public Class<CreateDatabaseForInnerResponse> getResponseClass() {
        return CreateDatabaseForInnerResponse.class;
    }

}
