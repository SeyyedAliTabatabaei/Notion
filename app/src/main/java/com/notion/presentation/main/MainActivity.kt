package com.notion.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.notion.R
import com.notion.databinding.ActivityMainBinding
import com.notion.utils.NotionActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : NotionActivity() {

    lateinit var binding : ActivityMainBinding
    val viewModel : MainViewModel by viewModels()

    private lateinit var navHost: NavHostFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        navHost = supportFragmentManager.findFragmentById(R.id.fcv_main_container) as NavHostFragment
        navHost.findNavController().setGraph(R.navigation.nav_home)

        binding.ivMainShop.setOnClickListener {
            selectItem(BottomNavigationItem.SHOP)
        }

        binding.ivMainChart.setOnClickListener {
            selectItem(BottomNavigationItem.CHART)
        }

        binding.ivMainProfile.setOnClickListener {
            selectItem(BottomNavigationItem.PROFILE)
        }
    }

    private fun selectItem(item : BottomNavigationItem) {
        when(item){
            BottomNavigationItem.SHOP -> {
//                navHost.findNavController().setGraph(R.navigation.nav_home)

                binding.ivMainProfile.setImageDrawable(getDrawable(R.drawable.ic_profile))
                binding.ivMainChart.setImageDrawable(getDrawable(R.drawable.ic_chart))

            }
            BottomNavigationItem.PROFILE -> {
//                navHost.findNavController().setGraph(R.navigation.nav_profile)

                binding.ivMainProfile.setImageDrawable(getDrawable(R.drawable.ic_profile_selected))
                binding.ivMainChart.setImageDrawable(getDrawable(R.drawable.ic_chart))

            }
            BottomNavigationItem.CHART -> {
                navHost.findNavController().setGraph(R.navigation.nav_chart)

                binding.ivMainProfile.setImageDrawable(getDrawable(R.drawable.ic_profile))
                binding.ivMainChart.setImageDrawable(getDrawable(R.drawable.ic_chart_selected))
            }
        }

    }

    enum class BottomNavigationItem{
        SHOP , PROFILE , CHART
    }

}