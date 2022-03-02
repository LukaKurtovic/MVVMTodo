package com.codinginflow.mvvmtodo.ui.delete_all_completed

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codinginflow.mvvmtodo.data.TaskDao
import kotlinx.coroutines.launch

class DeleteAllCompletedViewModel @ViewModelInject constructor(
    private val taskDao: TaskDao
) : ViewModel() {

    fun onConfirmClick() = viewModelScope.launch {
        taskDao.deleteCompletedTasks()
    }
}