package com.nepxion.discovery.plugin.strategy.extension.gateway.adapter;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import com.nepxion.discovery.common.constant.DiscoveryConstant;
import com.nepxion.discovery.plugin.strategy.adapter.AbstractVersionDiscoveryEnabledAdapter;
import com.nepxion.discovery.plugin.strategy.extension.gateway.context.GatewayStrategyContext;

public class VersionDiscoveryEnabledAdapter extends AbstractVersionDiscoveryEnabledAdapter {
    @Override
    protected String getVersionJson() {
        GatewayStrategyContext context = GatewayStrategyContext.getCurrentContext();

        return context.getExchange().getRequest().getHeaders().getFirst(DiscoveryConstant.VERSION);
    }
}