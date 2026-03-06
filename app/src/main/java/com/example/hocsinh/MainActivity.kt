package com.example.hocsinh

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var db: DatabaseHandler
    private lateinit var etId: EditText
    private lateinit var etName: EditText
    private lateinit var etAddress: EditText
    private lateinit var etPhone: EditText
    private lateinit var btnAdd: Button
    private lateinit var btnUpdate: Button
    private lateinit var btnDelete: Button
    private lateinit var btnView: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        db = DatabaseHandler(this)

        etId = findViewById(R.id.etId)
        etName = findViewById(R.id.etName)
        etAddress = findViewById(R.id.etAddress)
        etPhone = findViewById(R.id.etPhone)
        btnAdd = findViewById(R.id.btnAdd)
        btnUpdate = findViewById(R.id.btnUpdate)
        btnDelete = findViewById(R.id.btnDelete)
        btnView = findViewById(R.id.btnView)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            val name = etName.text.toString()
            val address = etAddress.text.toString()
            val phone = etPhone.text.toString()
            if (name.isNotEmpty() && address.isNotEmpty() && phone.isNotEmpty()) {
                db.addStudent(Student(name, address, phone))
                Toast.makeText(this, "Đã thêm thành công", Toast.LENGTH_SHORT).show()
                clearFields()
                displayStudents()
            } else {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show()
            }
        }

        btnUpdate.setOnClickListener {
            val idStr = etId.text.toString()
            val name = etName.text.toString()
            val address = etAddress.text.toString()
            val phone = etPhone.text.toString()
            if (idStr.isNotEmpty() && name.isNotEmpty() && address.isNotEmpty() && phone.isNotEmpty()) {
                db.updateStudent(Student(idStr.toInt(), name, address, phone))
                Toast.makeText(this, "Đã cập nhật thành công", Toast.LENGTH_SHORT).show()
                clearFields()
                displayStudents()
            } else {
                Toast.makeText(this, "Vui lòng nhập ID và thông tin cần sửa", Toast.LENGTH_SHORT).show()
            }
        }

        btnDelete.setOnClickListener {
            val idStr = etId.text.toString()
            if (idStr.isNotEmpty()) {
                val student = db.getStudent(idStr.toInt())
                if (student != null) {
                    db.deleteStudent(student)
                    Toast.makeText(this, "Đã xóa thành công", Toast.LENGTH_SHORT).show()
                    clearFields()
                    displayStudents()
                } else {
                    Toast.makeText(this, "Không tìm thấy học sinh với ID này", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Vui lòng nhập ID để xóa", Toast.LENGTH_SHORT).show()
            }
        }

        btnView.setOnClickListener {
            displayStudents()
        }
    }

    private fun displayStudents() {
        val students = db.getAllStudents()
        var text = "DANH SÁCH HỌC SINH:\n\n"
        for (st in students) {
            text += "ID: ${st.id} - Tên: ${st.name}\nĐịa chỉ: ${st.address} - SĐT: ${st.phone_Number}\n---\n"
        }
        tvResult.text = text
    }

    private fun clearFields() {
        etId.text.clear()
        etName.text.clear()
        etAddress.text.clear()
        etPhone.text.clear()
    }
}