package com.example.workmanagerexample

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class PhotoCompressionWorker(
    private val appContext: Context,
    private val params: WorkerParameters,
): CoroutineWorker(appContext, params) {

    override suspend fun doWork(): Result {
        TODO("Not yet implemented")
    }
}