package com.swing.Shayarana

import adapters.birthdayadapters
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_birthdayscreen.*

class birthdayscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdayscreen)


        val birthdayshayariobjects= mutableListOf<birthdayshayari>()

        birthdayshayariobjects.add(birthdayshayari("दुआ \uD83D\uDE4F है आपके जन्मदिन पे हमारी,\n" +
                "ना तूटे कभी दोस्ती हमारी,\n" +
                "सारी जिंदगी देंगे खुशियाँ आपको…\n" +
                "और वो खुशियाँ होगी प्यारी प्यारी…\uD83D\uDE0A\n" +
                "\uD83C\uDF82Happy Birthday To You My Best Friend…\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81”"))
        birthdayshayariobjects.add(birthdayshayari(" \uD83C\uDF89 मुबारक हो तुमको यह \uD83C\uDF82 जन्मदिन तुम्हारा,\n" +
                "  जो मांगो तुम रब से वो मिल जाये तुम्हें  \uD83C\uDF88 सारा.\n" +
                "\n" +
                "   दुखो की कभी काली रात ना आये,\n" +
                "   \uD83C\uDF88 खुशियों से भर जाये घर का आँगन सारा.\n" +
                "   मुबारक हो तुमको यह \uD83C\uDF82  जन्मदिन तुम्हारा."))
        birthdayshayariobjects.add(birthdayshayari(" ऐसी क्या दुआ दूँ आपको❗ \n" +
                "  जो आपके लबों पर ख़ुशी के \uD83C\uDF39 फूल खिला दे❗❗\n" +
                "\n" +
                "   \uD83C\uDF39 बस ये दुआ है मेरी❗\n" +
                "   सितारों सी रौशनी खुदा आपकी तकदीर बना दे❗❗\n" +
                "                                     \uD83C\uDF78 \n" +
                "      \uD83D\uDE00 \uD83C\uDF89  \uD83C\uDF82 HAPPY BIRTHDAY  \uD83C\uDF82  \uD83C\uDF89 "))
        birthdayshayariobjects.add(birthdayshayari("\uD83C\uDF82 ख्वाहिशों के समंदर के सब मोती तेरे नसीब हो❗\n" +
                "  तेरे चाहने वाले हमसफ़र तेरे हरदम करीब हों❗\n" +
                "\n" +
                "   \uD83C\uDF39 कुछ यूँ उतरे तेरे लिए रहमतों का मौसम❗\n" +
                "   कि तेरी हर दुआ, हर ख्वाहिश कबूल हो  ❗❗\n" +
                "  • ═• ═•-⊰ \uD83C\uDF82 जन्म दिन की शुभकामनाएं \uD83C\uDF82  ⊱•═•⊰ •═•"))
        birthdayshayariobjects.add(birthdayshayari("\uD83C\uDF82 तू खुश रहे खुदा करे मेरा दिल यही दुआ करे ❗\n" +
                "  तेरे होंठ मुस्कुराएं सदा तेरी आँख सदा हँसा करे ❗\n" +
                "  \n" +
                " \uD83C\uDF39 आँगन तेरा सदा खुशियों से भरा रहे ❗\n" +
                "  बहार सदा तेरी ही गली रहे, बस यही दुआ मेरी तेरे लिए रहे ❗ ❗\n" +
                "• ═• ═•-⊰ \uD83C\uDF82 जन्म दिन की शुभकामनाएं \uD83C\uDF82  ⊱•═•⊰ •═•"))
        birthdayshayariobjects.add(birthdayshayari("\n" +
                "   ➡ जन्मदिन \uD83C\uDF82 की तो पार्टी \uD83C\uDF78 होनी चाहिए,\n" +
                "  \uD83C\uDF39 Wish तो ⏰ Morning की भी होती है ❗❗\n" +
                "\n" +
                "     ➡  \uD83C\uDF81 \uD83C\uDF88 \uD83D\uDE00 \uD83C\uDF89  \uD83C\uDF82 HAPPY BIRTHDAY \uD83C\uDF89 \uD83C\uDF82  \uD83C\uDF88 \uD83D\uDE00  ⬅"))
        birthdayshayariobjects.add(birthdayshayari(" \uD83C\uDF82 उगता हुआ सूरज दुआ दे आपको,\n" +
                "खिलता हुआ फूल खुशबु दे आपको,\n" +
                "\n" +
                " \uD83C\uDF39मैं तो कुछ दे नहीं सकता, देने वाला लंबी उम्र दे आपको !\n" +
                "• ═• ═•-⊰ \uD83C\uDF82 जन्म दिन की शुभकामनाएं \uD83C\uDF82  ⊱•═•⊰ •═•   "))
        birthdayshayariobjects.add(birthdayshayari("  \uD83C\uDF82 फूलो सा महकता रहे हमेशा जीवन तुम्हारा,\n" +
                " \uD83C\uDF39 खुशिया चूमे कदम तुम्हरे बहुत सारा प्यार और\n" +
                "आशीर्वाद हमारा❗ \n" +
                "• ═• ═•-⊰ \uD83C\uDF82 HAPPY BIRTHDAY  \uD83C\uDF82  ⊱•═•⊰ •═•"))
        birthdayshayariobjects.add(birthdayshayari("  \uD83C\uDF82 आपका जन्म दिन हैं ख़ास ❤️\n" +
                "क्यूँकि आप होते हैं सबके दिल के पास\n" +
                "\n" +
                " \uD83C\uDF39 और आज पूरी हो आपकी हर आस❗\n" +
                "\uD83C\uDF81\uD83D\uDE00 \uD83C\uDF82HAPPY BIRTHDAY\uD83C\uDF82"))




        birthdayrecycleview.adapter = birthdayadapters(birthdayshayariobjects)
        birthdayrecycleview.layoutManager= LinearLayoutManager(this)










    }
}