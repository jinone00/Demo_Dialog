package com.example.demo_dialogue

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.demo_dialogue.databinding.ActivityMainBinding
import com.example.demo_dialogue.databinding.DialogBackBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnClick?.setOnClickListener {
            makeDialog()
        }
    }


    private fun makeDialog(){
        binding?.btnClick?.setOnClickListener {

            val customDialog = Dialog(this)
            val dialogBinding =DialogBackBinding.inflate(layoutInflater)
            customDialog.setContentView(dialogBinding.root)
            customDialog.setCanceledOnTouchOutside(false)

            dialogBinding.btnYes.setOnClickListener {
                Toast.makeText(this, "Ok you click Yes", Toast.LENGTH_SHORT).show()
                customDialog.dismiss()
            }

            dialogBinding.btnNo.setOnClickListener {
                Toast.makeText(this, "Ok you click No", Toast.LENGTH_SHORT).show()
                customDialog.dismiss()
            }

            customDialog.show()
        }
    }




}