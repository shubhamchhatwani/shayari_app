package com.swing.Shayarana

import adapters.teaadapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_teascreen.*

class teascreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teascreen)









        val teashayariobjects= mutableListOf<teashayari>()

        teashayariobjects.add(teashayari("ये इश्क़ ओर चाय दोनों का अजीब रिस्ता है..!!\n" +
                "एक को बनाना पड़ता है , दूसरे को मनाना"))
        teashayariobjects.add(teashayari("तस्बीरो के साथ इश्क का बहम पाल रखा है \n" +
                "वो तेरा चाय का झूठा कप आज भी सम्भाल रखा है"))
        teashayariobjects.add(teashayari("ये बारिश का मौसम, और तुम्हारी याद\n" +
                "चलो फिर मिलते है ,एक कप चाय के साथ ☕"))
        teashayariobjects.add(teashayari("लोग कहते है चाय में रखा क्या है\n" +
                "में पूछता हूं कि चाय के\n" +
                "बगैर जिंदगी की क्या है"))
        teashayariobjects.add(teashayari("छोड़ जमाने की फ़िक्र यार,\n" +
                "चल किसी नुक्क्ड़ पे चाय पीते है"))
        teashayariobjects.add(teashayari("कभी कभी लगता है यह दुनिया छोड़कर चला जाऊं,\n" +
                "लेकिन फिर कमबख्त चाय की याद आ जाती है"))
        teashayariobjects.add(teashayari("दूध से कहीं ज्यादा देखे है \n" +
                "मैंने शौक़ीन चाय के."))
        teashayariobjects.add(teashayari("बैठे चाय की प्याली लेकर पुराने किस्से गरम करने\n" +
                "चाय ठंङी होती गई और आँखे नम"))
        teashayariobjects.add(teashayari("एक तेरा ख़्याल ही तो है मेरे पास.\n" +
                "वरना कौन अकेले में बैठे कर चाय पीता है."))
        teashayariobjects.add(teashayari("जब सुबह-सुबह तेरे प्यार के नग्में को गुनगुनाता हूँ,\n" +
                "लब मुस्कुराते है जब चाय का कप उठाता हूँ."))
        teashayariobjects.add(teashayari("एक कप चाय दो दिलों को मिला देती है,\n" +
                "एक कप चाय दिन भर की थकान मिटा देती है."))
        teashayariobjects.add(teashayari("सर्दियों के बस दो ही जलवे,\n" +
                "तुम्हारी याद और चाय"))
        teashayariobjects.add(teashayari("ठंड बहुत है.कोई ज्ञान नहीं बांटेगा, \n" +
                "जिसको बांटनी है चाय बांटो"))
        teashayariobjects.add(teashayari("दो चीजें जिंदगी में अच्छी लगती है\n" +
                "लहजे नरम, चाय गरम"))
        teashayariobjects.add(teashayari("छोड़ जमाने की फ़िक्र यार,\n" +
                "चल किसी नुक्क्ड़ पे चाय पीते है."))
        teashayariobjects.add(teashayari("हाथ में चाय और यादों में आप हो,\n" +
                "फिर उस खुशनुमा सुबह की क्या बात हो."))
        teashayariobjects.add(teashayari("मैं पीसती रही इलायची, अदरख,\n" +
                "दालचीनीपर महक चाय से तेरी यादों की आयी"))




        tearecycleview.adapter = teaadapter(teashayariobjects)
        tearecycleview.layoutManager= LinearLayoutManager(this)





    }



}
