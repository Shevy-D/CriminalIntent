package com.example.criminalintent

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {

    private val crimeRepositiry = CrimeRepository.get()
    val crimeListLiveData = crimeRepositiry.getCrimes()
}