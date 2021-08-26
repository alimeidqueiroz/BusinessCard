package br.com.arquitetoandroid.businesscard

import android.app.Application
import br.com.arquitetoandroid.businesscard.data.AppDataBase
import br.com.arquitetoandroid.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDataBase.getDataBase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}