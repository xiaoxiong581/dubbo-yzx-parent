package com.yzx.xiaoxiong581.dubbo.provider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.yzx.xiaoxiong581.dubbo.provider.dubbo.api.HealthCheckService;
import com.yzx.xiaoxiong581.dubbo.provider.dubbo.api.constant.ApplicationName;
import com.yzx.xiaoxiong581.dubbo.provider.dubbo.api.constant.Zookeeper;
import com.yzx.xiaoxiong581.dubbo.provider.impl.HealthCheckServiceImpl;

import java.io.IOException;

/**
 * @author xiaoxiong581
 */
public class ProviderMain
{
    public static void main(String[] args) throws IOException
    {
        ServiceConfig<HealthCheckService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setApplication(new ApplicationConfig(ApplicationName.DUBBO_PROVIDER));
        serviceConfig.setRegistry(new RegistryConfig(Zookeeper.URL));
        serviceConfig.setInterface(HealthCheckService.class);
        serviceConfig.setRef(new HealthCheckServiceImpl());
        serviceConfig.export();
        System.in.read();
    }
}
