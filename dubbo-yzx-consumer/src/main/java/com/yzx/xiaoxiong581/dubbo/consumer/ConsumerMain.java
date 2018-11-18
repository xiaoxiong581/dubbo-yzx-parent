package com.yzx.xiaoxiong581.dubbo.consumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.yzx.xiaoxiong581.dubbo.provider.dubbo.api.HealthCheckService;
import com.yzx.xiaoxiong581.dubbo.provider.dubbo.api.constant.ApplicationName;
import com.yzx.xiaoxiong581.dubbo.provider.dubbo.api.constant.Zookeeper;

/**
 * @author xiaoxiong581
 */
public class ConsumerMain
{
    public static void main(String[] args)
    {
        ReferenceConfig<HealthCheckService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setApplication(new ApplicationConfig(ApplicationName.DUBBO_CONSUMER));
        referenceConfig.setRegistry(new RegistryConfig(Zookeeper.URL));
        referenceConfig.setInterface(HealthCheckService.class);
        HealthCheckService healthCheckService = referenceConfig.get();
        System.out.println(healthCheckService.healthCheck("health check"));
    }
}
