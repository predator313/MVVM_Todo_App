package com.example.mvvmtodo.model


import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.text.DateFormat
@Entity(tableName = "task_table")
@Parcelize
data class Task(
    val name:String,
    val isImportant:Boolean=false,
    val isCompleted:Boolean=false,
    val timestamp:Long=System.currentTimeMillis(),
    @PrimaryKey(autoGenerate = true)val id:Long=0L

): Parcelable {
    val createdDataFormat:String
        get() = DateFormat.getDateInstance().format(timestamp)
}
