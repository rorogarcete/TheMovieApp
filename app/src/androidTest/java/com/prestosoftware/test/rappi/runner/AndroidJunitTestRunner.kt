package com.prestosoftware.test.rappi.runner

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner
import com.prestosoftware.test.rappi.TestRappiApplication

@Suppress("unused")
class AndroidJunitTestRunner : AndroidJUnitRunner() {
  @Throws(InstantiationException::class, IllegalAccessException::class, ClassNotFoundException::class)
  override fun newApplication(cl: ClassLoader, className: String, context: Context): Application {
    return super.newApplication(cl, TestRappiApplication::class.java.name, context)
  }
}
