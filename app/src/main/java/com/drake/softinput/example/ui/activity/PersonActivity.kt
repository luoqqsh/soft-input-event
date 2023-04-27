package com.drake.softinput.example.ui.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.drake.softinput.example.databinding.ActivityPersonBinding
import com.drake.softinput.setWindowSoftInput

class PersonActivity : AppCompatActivity() {
    private val vm by viewModels<PersonVM>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPersonBinding.inflate(layoutInflater)
        setContentView(binding.root)
        vm.editClickListener = { view, edit ->
            setWindowSoftInput(view, binding.group, edit)
        }
        binding.group.removeAllViews()

        binding.group.addView(vm.item("姓名", "aaa", "name"))
        binding.group.addView(vm.item("性别", "男", "gender"))
        binding.group.addView(vm.item("籍贯", "北京", "nativePlace"))
        binding.group.addView(vm.item("民族", "汉族", "nation"))
        binding.group.addView(vm.item("手机号码", "13300000000", "phone"))
        binding.group.addView(vm.item("身份证号", "32221111909", "idNumber"))
        binding.group.addView(vm.item("出生日期", "1990-01-01", "birthday"))
        binding.group.addView(vm.item("年龄", "20", "age"))
        binding.group.addView(
            vm.item("身份证地址", "北京西路1号", "censusRegisterAddress")
        )
        binding.group.addView(vm.item("姓名", "aaa", "name"))
        binding.group.addView(vm.item("性别", "男", "gender"))
        binding.group.addView(vm.item("籍贯", "北京", "nativePlace"))
        binding.group.addView(vm.item("民族", "汉族", "nation"))
        binding.group.addView(vm.item("手机号码", "13300000000", "phone"))
        binding.group.addView(vm.item("身份证号", "32221111909", "idNumber"))
        binding.group.addView(vm.item("出生日期", "1990-01-01", "birthday"))
        binding.group.addView(vm.item("年龄", "20", "age"))
        binding.group.addView(
            vm.item("身份证地址", "北京西路1号", "censusRegisterAddress")
        )
        binding.group.addView(vm.item("姓名", "aaa", "name"))
        binding.group.addView(vm.item("性别", "男", "gender"))
        binding.group.addView(vm.item("籍贯", "北京", "nativePlace"))
        binding.group.addView(vm.item("民族", "汉族", "nation"))
        binding.group.addView(vm.item("手机号码", "13300000000", "phone"))
        binding.group.addView(vm.item("身份证号", "32221111909", "idNumber"))
        binding.group.addView(vm.item("出生日期", "1990-01-01", "birthday"))
        binding.group.addView(vm.item("年龄", "20", "age"))
        binding.group.addView(
            vm.item("身份证地址", "北京西路1号", "censusRegisterAddress")
        )
        binding.group.addView(vm.item("姓名", "aaa", "name"))
        binding.group.addView(vm.item("性别", "男", "gender"))
        binding.group.addView(vm.item("籍贯", "北京", "nativePlace"))
        binding.group.addView(vm.item("民族", "汉族", "nation"))
        binding.group.addView(vm.item("手机号码", "13300000000", "phone"))
        binding.group.addView(vm.item("身份证号", "32221111909", "idNumber"))
        binding.group.addView(vm.item("出生日期", "1990-01-01", "birthday"))
        binding.group.addView(vm.item("年龄", "20", "age"))
        binding.group.addView(
            vm.item("身份证地址", "北京西路1号", "censusRegisterAddress")
        )
    }
}