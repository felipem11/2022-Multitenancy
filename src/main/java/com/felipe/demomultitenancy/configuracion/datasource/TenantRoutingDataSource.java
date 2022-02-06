package com.felipe.demomultitenancy.configuracion.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.felipe.demomultitenancy.configuracion.tenant.ThreadTenantStorage;

public class TenantRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        
        return ThreadTenantStorage.getTenantId();
    }
}
