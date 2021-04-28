/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.oauth.dcr.context;

import org.testng.annotations.Test;
import org.wso2.carbon.identity.application.authentication.framework.inbound.IdentityRequest;

import static org.powermock.api.mockito.PowerMockito.mock;
import static org.testng.Assert.assertNotNull;

public class DCRMessageContextTest {

    private DCRMessageContext dcrMessageContext;
    private IdentityRequest mockIdentityRequet;
    @Test
    public void testGetIdentityRequest() throws Exception {
        mockIdentityRequet = mock(IdentityRequest.class);
        dcrMessageContext = new DCRMessageContext(mockIdentityRequet);
        assertNotNull(dcrMessageContext.getIdentityRequest());
    }
}
