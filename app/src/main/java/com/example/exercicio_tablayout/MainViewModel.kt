package com.example.exercicio_tablayout

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.exercicio_tablayout.model.Socio

class MainViewModel : ViewModel(){

    val socioAtualizado: MutableLiveData<Socio> = MutableLiveData()

    fun setNovoSocio (socio: Socio) {
        socioAtualizado.postValue(socio)
    }
}