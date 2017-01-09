/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.gateway.artifact;


import org.wso2.carbon.identity.gateway.artifact.model.ServiceProvider;
import org.wso2.carbon.identity.gateway.util.FileUtil;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ArtifactReader {

    public static ServiceProvider loadServiceProvider() {

        Path file = Paths
                .get("/home/harshat/wso2/repo/is/new-framework-poc/original-repo/carbon-identity-framework/components/gateway/org.wso2.carbon.identity.gateway/src/main/resources/sample-sp.yml");

        // domain-config.yaml is a mandatory configuration file.
        ServiceProvider serviceProviderEntry =  FileUtil.readConfigFile(file, ServiceProvider.class);
        return serviceProviderEntry ;
    }

}
