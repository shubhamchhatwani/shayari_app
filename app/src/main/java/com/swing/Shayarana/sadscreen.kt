package com.swing.Shayarana

import adapters.myAdopter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_sadscreen.*

class sadscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sadscreen)


        val sadshayariobjectss= mutableListOf <sadshayari> ()

        sadshayariobjectss.add(sadshayari("आँखें थक गई है आसमान को देखते देखते\n" +
                "पर वो तारा नहीं टूटता ,जिसे देखकर तुम्हें मांग लूँ"))
        sadshayariobjectss.add(sadshayari("रुठुंगा अगर तुजसे तो इस कदर रुठुंगा की ,,\n" +
                "ये तेरीे आँखे मेरी एक झलक को तरसेंगी !!"))
        sadshayariobjectss.add(sadshayari("तुझसे अच्छे तो जख्म हैं मेरे ।\n" +
                "उतनी ही तकलीफ देते हैं जितनी बर्दास्त कर सकूँ"))
        sadshayariobjectss.add(sadshayari("क्या बात है, बड़े चुपचाप से बैठे हो.\n" +
                "कोई बात दिल पे लगी है या दिल कही लगा बैठे हो."))
        sadshayariobjectss.add(sadshayari("किसी को न पाने से जिंदगी खत्म नहीं होती लेकिन किसी को पाकर खो देने से कुछ बाकी भी नहीं रहता|"))
        sadshayariobjectss.add(sadshayari("सुकून की तलाश में हम दिल बेचने निकले थे खरीददार दर्द भी दे गया और दिल भी ले गया|\n"))
        sadshayariobjectss.add(sadshayari("अजीब सा दर्द है इन दिनों यारों,\n" +
                "न बताऊं तो 'कायर', बताऊँ तो 'शायर'।"))
        sadshayariobjectss.add(sadshayari("मुझसे खुशनसीब हैं मेरे लिखे ये लफ्ज,\n" +
                "जिनको कुछ देर तक पढ़ेगी निगाहे तेरी।"))
        sadshayariobjectss.add(sadshayari("इन्ही पत्थरों पे चल कर अगर आ सको तो आओ,\n" +
                "मेरे घर के रास्ते में कोई कहकशाँ नहीं है।\n" +
                "\n"))
        sadshayariobjectss.add(sadshayari("ज़लज़ले यूं ही बेसबब नहीं आते,\n" +
                "कोई दीवाना तह-ए-खाक तड़पता होगा।"))
        sadshayariobjectss.add(sadshayari("पाया था तुझे मैंने शायद खोने के लिए,\n" +
                "\n" +
                "घटना ही था घटना को हादसा बनने के लिए,\n" +
                "\n" +
                "नहीं समझा कभी भी उसने दिल को मेरे क्योंकि,\n" +
                "\n" +
                "बस खेलना था उसको दिल से मेरे कुछ वक़्त के लिए. "))






        sadrecycleview.adapter = myAdopter(sadshayariobjectss)
        sadrecycleview.layoutManager= LinearLayoutManager(this)

    }
}