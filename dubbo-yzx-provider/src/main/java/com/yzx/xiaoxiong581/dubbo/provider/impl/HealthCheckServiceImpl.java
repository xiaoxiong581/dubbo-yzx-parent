package com.yzx.xiaoxiong581.dubbo.provider.impl;

import com.yzx.xiaoxiong581.dubbo.provider.dubbo.api.HealthCheckService;

/**
 * @author xiaoxiong581
 */
public class HealthCheckServiceImpl implements HealthCheckService
{
    @Override
    public String healthCheck(String param)
    {
        return String.format("success %s", param);
    }
}
