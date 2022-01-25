package com.anggapambudi.pinterestbyanggapamb.base.viewmodel

import androidx.lifecycle.viewModelScope
import com.anggapambudi.pinterestbyanggapamb.api.ApiService
import com.crocodic.core.base.viewmodel.CoreViewModel
import kotlinx.coroutines.launch

open class BaseViewModel(private val apiService: ApiService) : CoreViewModel() {

    override fun apiLogout() = viewModelScope.launch { }

    override fun apiRenewToken() = viewModelScope.launch { }

}