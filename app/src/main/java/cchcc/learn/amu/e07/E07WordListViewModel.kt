package cchcc.learn.amu.e07

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cchcc.learn.amu.e07.coordinator.E07WordListCoordinator

class E07WordListViewModel(val coordinator: E07WordListCoordinator) : ViewModel() {
    val wordList = MutableLiveData<List<String>>().apply {
        value = sampleText.split(" ")
    }

    fun <T> goWordScreen(getArgs: () -> Map<String, T>) {
        coordinator.goWordScreen(getArgs())
    }

    override fun onCleared() {
        coordinator.navigator = null  // avoid memory leak
    }

    companion object {
        const val sampleText = """Activity transitions in material design apps provide visual connections between different states through motion and transformations between common elements. You can specify custom animations for enter and exit transitions and for transitions of shared elements between activities."""
    }
}