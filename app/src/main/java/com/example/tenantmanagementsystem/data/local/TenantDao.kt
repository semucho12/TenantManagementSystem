package com.example.tenantmanagementsystem.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.tenantmanagementsystem.data.model.Tenant

@Dao
interface TenantDao {

    @Insert
    suspend fun insertTenant(tenant: Tenant)

    @Query("SELECT * FROM tenants ORDER BY name")
    fun getAllTenants(): LiveData<List<Tenant>>
}