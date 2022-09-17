package fr.marioswitch.clicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val save = getSharedPreferences("fr.marioswitch.clicker", MODE_PRIVATE)
        var totalClicks = save.getInt("clicks", 0)
        click.text = String.format(getString(R.string.clicks), totalClicks)
        val nowLevel:Int
        when(totalClicks){
            in 0..9 -> nowLevel = 0
            in 10..99 -> nowLevel = 1
            in 100..199 -> nowLevel = 2
            in 200..499 -> nowLevel = 3
            in 500..999 -> nowLevel = 4
            in 1000..4999 -> nowLevel = 5
            in 5000..19999 -> nowLevel = 6
            in 20000..99999 -> nowLevel = 7
            in 100000..299999 -> nowLevel = 8
            in 300000..999999 -> nowLevel = 9
            in 1000000..1999999 -> nowLevel = 10
            in 2000000..2999999 -> nowLevel = 11
            in 3000000..4999999 -> nowLevel = 12
            in 5000000..9999999 -> nowLevel = 13
            else -> nowLevel = 14
        }
        when(nowLevel){
            in 0..10 -> level.text = String.format(getString(R.string.level),nowLevel)
            in 11..14 -> level.text = ""
        }
        when(nowLevel){
            11 -> bronze_icon.visibility = View.VISIBLE
            else -> bronze_icon.visibility = View.INVISIBLE
        }
        when(nowLevel){
            12 -> silver_icon.visibility = View.VISIBLE
            else -> silver_icon.visibility = View.INVISIBLE
        }
        when(nowLevel){
            13 -> gold_icon.visibility = View.VISIBLE
            else -> gold_icon.visibility = View.INVISIBLE
        }
        when(nowLevel){
            14 -> diamond_icon.visibility = View.VISIBLE
            else -> diamond_icon.visibility = View.INVISIBLE
        }
        when(nowLevel){
            0 -> nextlevel.text = getString(R.string.nextlevel0)
            1 -> nextlevel.text = getString(R.string.nextlevel1)
            2 -> nextlevel.text = getString(R.string.nextlevel2)
            3 -> nextlevel.text = getString(R.string.nextlevel3)
            4 -> nextlevel.text = getString(R.string.nextlevel4)
            5 -> nextlevel.text = getString(R.string.nextlevel5)
            6 -> nextlevel.text = getString(R.string.nextlevel6)
            7 -> nextlevel.text = getString(R.string.nextlevel7)
            8 -> nextlevel.text = getString(R.string.nextlevel8)
            9 -> nextlevel.text = getString(R.string.nextlevel9)
            10 -> nextlevel.text = getString(R.string.nextlevel10)
            11 -> nextlevel.text = getString(R.string.nextlevel11)
            12 -> nextlevel.text = getString(R.string.nextlevel12)
            13 -> nextlevel.text = getString(R.string.nextlevel13)
            14 -> nextlevel.text = getString(R.string.nextlevel14)
        }
        when(nowLevel){
            in 11..14 -> level_title.text = ""
        }

        val hitbox = findViewById<View>(R.id.hitbox)

        hitbox.setOnClickListener{
            totalClicks++
            save.edit().putInt("clicks",totalClicks).apply()
            click.text = String.format(getString(R.string.clicks), totalClicks)
            val nowLevel:Int
            when(totalClicks){
                in 0..9 -> nowLevel = 0
                in 10..99 -> nowLevel = 1
                in 100..199 -> nowLevel = 2
                in 200..499 -> nowLevel = 3
                in 500..999 -> nowLevel = 4
                in 1000..4999 -> nowLevel = 5
                in 5000..19999 -> nowLevel = 6
                in 20000..99999 -> nowLevel = 7
                in 100000..299999 -> nowLevel = 8
                in 300000..999999 -> nowLevel = 9
                in 1000000..1999999 -> nowLevel = 10
                in 2000000..2999999 -> nowLevel = 11
                in 3000000..4999999 -> nowLevel = 12
                in 5000000..9999999 -> nowLevel = 13
                else -> nowLevel = 14
            }
            when(nowLevel){
                in 0..10 -> level.text = String.format(getString(R.string.level),nowLevel)
                in 11..14 -> level.text = ""
            }
            when(nowLevel){
                11 -> bronze_icon.visibility = View.VISIBLE
                else -> bronze_icon.visibility = View.INVISIBLE
            }
            when(nowLevel){
                12 -> silver_icon.visibility = View.VISIBLE
                else -> silver_icon.visibility = View.INVISIBLE
            }
            when(nowLevel){
                13 -> gold_icon.visibility = View.VISIBLE
                else -> gold_icon.visibility = View.INVISIBLE
            }
            when(nowLevel){
                14 -> diamond_icon.visibility = View.VISIBLE
                else -> diamond_icon.visibility = View.INVISIBLE
            }
            when(nowLevel){
                0 -> nextlevel.text = getString(R.string.nextlevel0)
                1 -> nextlevel.text = getString(R.string.nextlevel1)
                2 -> nextlevel.text = getString(R.string.nextlevel2)
                3 -> nextlevel.text = getString(R.string.nextlevel3)
                4 -> nextlevel.text = getString(R.string.nextlevel4)
                5 -> nextlevel.text = getString(R.string.nextlevel5)
                6 -> nextlevel.text = getString(R.string.nextlevel6)
                7 -> nextlevel.text = getString(R.string.nextlevel7)
                8 -> nextlevel.text = getString(R.string.nextlevel8)
                9 -> nextlevel.text = getString(R.string.nextlevel9)
                10 -> nextlevel.text = getString(R.string.nextlevel10)
                11 -> nextlevel.text = getString(R.string.nextlevel11)
                12 -> nextlevel.text = getString(R.string.nextlevel12)
                13 -> nextlevel.text = getString(R.string.nextlevel13)
                14 -> nextlevel.text = getString(R.string.nextlevel14)
            }
            when(nowLevel){
                in 11..14 -> level_title.text = ""
            }
        }
    }
}