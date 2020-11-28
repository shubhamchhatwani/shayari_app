package com.swing.Shayarana

import adapters.loveadapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_lovescreen.*

class lovescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lovescreen)



        val loveshayariobjects= mutableListOf<loveshayari>()

        loveshayariobjects.add(loveshayari("आप और आपकी हर बात मेरे लिए ख़ास है,\n" +
                "यही शायद प्यार का पहला एहसास है।"))
        loveshayariobjects.add(loveshayari("तुम्हारी खुशियों के ठिकाने बहुत होंगे मगर,\n" +
                "हमारी बेचैनियों की वजह… बस तुम हो।"))
        loveshayariobjects.add(loveshayari("\n" +
                "ये जिंदगी चाहे कितने पल की भी मिले,\n" +
                "बस यही दुआ है बस तेरे संग मिले।"))
        loveshayariobjects.add(loveshayari("तेरे  सिवा  किसी  और  की  चाहत  नहीं\n" +
                "तेरे  सिवा  किसी  और  से  मोहब्बत  नहीं\n"))
        loveshayariobjects.add(loveshayari("नहीं  बस्ती  किसी  और  की  सूरत  अब  इन  आँखों  में\n" +
                "काश  की  हमने  तुझे  इतने  गौर  से  न  देखा  होता"))
        loveshayariobjects.add(loveshayari("\n" +
                "तेरा रूठना भी इतना अच्छा लगता है,\n" +
                "कि दिल करता है दिनभर तुझे छेड़ता ही रहूँ"))
        loveshayariobjects.add(loveshayari("मुस्कुरा जाता हूँ अक्सर गुस्से में भी तेरा नाम सुन कर,\n" +
                "तेरे नाम से इतनी मोहब्बत है तो सोच तुझसे कितनी होगी"))
        loveshayariobjects.add(loveshayari("हमने  देखा  था  खुद  को  तेरी  सूरत  में\n" +
                "आईना  देख  कर  अब  रात  कट  जाती  हैं"))
        loveshayariobjects.add(loveshayari("अजीब सी बेताबी है तेरे बिना,\n" +
                "रह भी लेते है और रहा भी नही जाता…"))
        loveshayariobjects.add(loveshayari("हमारी तडप तो कुछ भी नहीं है हुजुर,\n" +
                "सुना है कि आपके दिदार के लिए तो आइना भी तरसता है"))
        loveshayariobjects.add(loveshayari("पहली मुलाकात थी और हम दोनों ही बेबस थे,\n" +
                "वो अपनी जुल्फें न संभाल पाए और हम खुद को"))
        loveshayariobjects.add(loveshayari("मुझसे जब भी मिलो तो नज़रें उठा के मिला करो,\n" +
                "मुझे पसंद है अपने आप को तेरी आँखों में देखना"))
        loveshayariobjects.add(loveshayari("मै उसको चाँद कह दू ये मुमकिन तो है,\n" +
                "मगर... लोग उसे रात भर देखें ये मुझे गवारा नहीं"))
        loveshayariobjects.add(loveshayari("कुछ खास नहीं इन हाथों की लकीरों में,\n" +
                "मगर तुम हो तो एक लकीर ही काफी है"))
        loveshayariobjects.add(loveshayari("कितनी ख़ूबसूरत हो जाती है दुनिया,\n" +
                "जब कोई अपना कहता है की तुम बहुत याद आ रहे हो"))
        loveshayariobjects.add(loveshayari("क्यू बार बार ताकते हो शीशे को,\n" +
                "नज़र लगाओगे क्या मेरी इकलौती मुहब्बत को"))



        loverecycleview.adapter = loveadapter(loveshayariobjects)
        loverecycleview.layoutManager= LinearLayoutManager(this)




    }
}