package com.drake.softinput.example.ui.activity

import android.app.Application
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.AndroidViewModel
import com.drake.softinput.example.R

class PersonVM(application: Application) : AndroidViewModel(application) {
    var editClickListener: ((View, View) -> Unit)? = null//输入法遮挡适配

    fun item(key: String, value: String?, tag: String): View {
        return item1(key, value, tag, "root")
    }

    /**
     * 添加item
     * @param key 显示key
     * @param value 显示值
     * @param tag 提交字段
     * @param root 根字段
     */
    private fun item1(key: String, value: String?, tag: String, root: String): View {
        val view = LayoutInflater.from(getApplication<Application>().applicationContext).inflate(R.layout.item_person_info, null)
        val infoKeyText = view.findViewById<TextView>(R.id.infoKeyText)
        val infoValueText = view.findViewById<EditText>(R.id.infoValueText)
        infoKeyText.text = key
        infoValueText.setText(value)
        editClickListener?.invoke(view, infoValueText)
        infoValueText.apply {
            hint = "请输入"
        }

        return view
    }
}