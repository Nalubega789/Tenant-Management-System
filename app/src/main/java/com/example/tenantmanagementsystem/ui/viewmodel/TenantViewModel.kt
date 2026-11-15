
package com.example.tenantmanagementsystem.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import com.example.tenantmanagementsystem.data.model.Tenant
import com.example.tenantmanagementsystem.data.repository.TenantRepository

class TenantViewModel : ViewModel() {

    // Holds the list of tenants
    private val _tenants = MutableLiveData<List<Tenant>>(
        TenantRepository.tenants.toList()
    )

    // Public read-only tenant list
    val tenants: LiveData<List<Tenant>> = _tenants

    // Calculates the number of tenants
    val tenantCountText: LiveData<String> = tenants.map { list ->
        "Tenants\n${list.size}"
    }

    // Calculates total rent
    val totalRentText: LiveData<String> = tenants.map { list ->
        val total = list.sumOf {
            it.rent.toDoubleOrNull() ?: 0.0
        }

        "Total rent\nKSh %,.0f".format(total)
    }

    // Displays all tenant information
    val allTenantsText: LiveData<String> = tenants.map { list ->
        if (list.isEmpty()) {
            "No tenants yet. Add one from the Dashboard."
        } else {
            list.joinToString("\n\n") { it.summary() }
        }
    }

    // Adds a new tenant
    fun addTenant(
        name: String,
        phone: String,
        rent: String
    ): Tenant? {

        val cleanName = name.trim()
        val cleanPhone = phone.trim()
        val cleanRent = rent.trim()

        if (cleanName.isEmpty() ||
            cleanPhone.isEmpty() ||
            cleanRent.isEmpty()
        ) {
            return null
        }

        val tenant = Tenant(
            name = cleanName,
            phone = cleanPhone,
            rent = cleanRent
        )

        TenantRepository.addTenant(tenant)

        // Refreshes the observable tenant list
        _tenants.value = TenantRepository.tenants.toList()

        return tenant
    }

    init {
        Log.d("TenantViewModel", "ViewModel created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("TenantViewModel", "ViewModel cleared")
    }
}
