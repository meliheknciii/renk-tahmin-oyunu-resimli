package com.melihekinci.renktahminoyunu

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.melihekinci.renktahminoyunu.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding  = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var renklist = arrayListOf<String>("Kırmızı","Beyaz","Siyah","Açık Mor","Koyu Yeşil","Kahverengi","Açık Yeşil","Turuncu","Mavi"+
        "Gri","Açık Mavi","Koyu Mor","Pembe","Sarı")
        var tutulanrenk : String = ""
        var goster = ""


            var randomnums : Int = Random.nextInt(0,15)
             tutulanrenk = renklist[randomnums]
        fun secRenkgosterim(a : String){
            goster = a
            binding.gostersonuc.text = goster
            binding.gostersonuc.visibility = View.VISIBLE
        }


        var secilenrenk:String = ""
        binding.kirmizi.setOnClickListener {
            secilenrenk = "Kırmızı"
            secRenkgosterim(secilenrenk)
        }
        binding.beyaz.setOnClickListener {
            secilenrenk = "Beyaz"
            secRenkgosterim(secilenrenk)
        }
        binding.siyah.setOnClickListener {
            secilenrenk = "Siyah"
            secRenkgosterim(secilenrenk)
        }
        binding.acikmor.setOnClickListener {
            secilenrenk = "Açık Mor"
            secRenkgosterim(secilenrenk)
        }
        binding.koyuyesil.setOnClickListener {
            secilenrenk = "Koyu Yeşil"
            secRenkgosterim(secilenrenk)
        }
        binding.acikyesil.setOnClickListener {
            secilenrenk = "Açık Yeşil"
            secRenkgosterim(secilenrenk)
        }
        binding.kahverengi.setOnClickListener {
            secilenrenk = "Kahverengi"
            secRenkgosterim(secilenrenk)
        }
        binding.turuncu.setOnClickListener {
            secilenrenk = "Turuncu"
            secRenkgosterim(secilenrenk)
        }
        binding.mavi.setOnClickListener {
            secilenrenk = "Mavi"
            secRenkgosterim(secilenrenk)
        }
        binding.gri.setOnClickListener {
            secilenrenk = "Gri"
            secRenkgosterim(secilenrenk)
        }
        binding.acikmavi.setOnClickListener {
            secilenrenk = "Açık Mavi"
            secRenkgosterim(secilenrenk)
        }
        binding.koyumor.setOnClickListener {
            secilenrenk = "Koyu Mor"
            secRenkgosterim(secilenrenk)
        }
        binding.pembe.setOnClickListener {
            secilenrenk = "Pembe"
            secRenkgosterim(secilenrenk)
        }
        binding.sari.setOnClickListener {
            secilenrenk = "Sarı"
            secRenkgosterim(secilenrenk)

        }




        binding.btncheck.setOnClickListener {

            if (secilenrenk == tutulanrenk){
                binding.txtsonuc.text = "Doğru tahmin ettiniz. Tebriklerr "
                binding.txtsonuc.visibility = View.VISIBLE
                binding.btncheck.isEnabled = false
                binding.txttutulan.text = tutulanrenk
                binding.txtsonuc.setTextColor(Color.GREEN)


            }
            else {
                binding.txtsonuc.visibility = View.VISIBLE
                binding.txtsonuc.text = "Hatalı tahmin ettiniz. Yeniden deneyin"
                binding.txtsonuc.setTextColor(Color.RED)
            }

        }
        binding.btnsifirla.setOnClickListener {
            binding.txtsonuc.visibility = View.INVISIBLE
            binding.txttutulan.text = " ? "
            binding.btncheck.isEnabled = true
            tutulanrenk = ""
            var randomnums : Int = Random.nextInt(0,15)
            tutulanrenk = renklist[randomnums]
        }
    }
}