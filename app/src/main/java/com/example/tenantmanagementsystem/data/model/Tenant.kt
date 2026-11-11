
package com.example.tenantmanagementsystem.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

// Each Tenant will be stored as one row in the tenants table
@Entity(tableName = "tenants")
data class Tenant(
    // These properties become database columns
    val name: String,
    val phone: String,
    val rent: String,

    // Room automatically generates a unique ID for each tenant
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0

) : Serializable {

    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent: KSh $rent"
    }
}
