package com.l3git.armyrankstest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.l3git.armyrankstest.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private var _binding: ActivityResultBinding? = null
    private val binding get() = _binding!!

    var mCurrentPosition: Int = 1
    var mFactsList: ArrayList<Fact>? = null

    lateinit var mAdView: AdView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mFactsList = Constants.getFacts()


        MobileAds.initialize(this) {}

        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)


        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        binding.tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"


        binding.btnFinish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        binding.btnNextFact.setOnClickListener {
            setFact()
        }
    }

    fun setFact(){
        val fact = mFactsList!![mCurrentPosition - 1]

        if (mCurrentPosition == mFactsList!!.size){
            binding.btnNextFact.text = "Start Over"
            mCurrentPosition = 1

        }else{
            binding.btnNextFact.text = "Next Fact"
            mCurrentPosition++
        }

        binding.tvFact.text = fact.fact
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}