package com.example.chefs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class VideosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        // Find buttons by ID
        Button btnKajumasala = findViewById(R.id.kajumasala);
        Button btnPavbhaji = findViewById(R.id.pavbhaji);
        Button btnManchurian = findViewById(R.id.manchurian);
        Button btnPulao = findViewById(R.id.pulao);
        Button btnVegsoup = findViewById(R.id.vegsoup);
        Button btnMengo = findViewById(R.id.mengo);
        Button btnCake = findViewById(R.id.cake);
        Button btnJalebifafda = findViewById(R.id.jalebifafda);
        Button btnBiryani = findViewById(R.id.biryani);
        Button btnBrownie = findViewById(R.id.brownie);
        Button btnBurger = findViewById(R.id.burger);
        Button btnCholeBhature = findViewById(R.id.cholebhature);
        Button btnChowMein = findViewById(R.id.chowmein);
        Button btnCutlet = findViewById(R.id.cutlet);
        Button btnFriedRice = findViewById(R.id.friedrice);
        Button btnIceCream = findViewById(R.id.icecream);
        Button btnLassi = findViewById(R.id.lassi);
        Button btnLemonade = findViewById(R.id.lemonade);
        Button btnNoodles = findViewById(R.id.noodles);
        Button btnPaneer = findViewById(R.id.paneer);
        Button btnPaneerTikka = findViewById(R.id.paneertikka);
        Button btnParatha = findViewById(R.id.paratha);
        Button btnPasta = findViewById(R.id.pasta);
        Button btnPizza = findViewById(R.id.pizza);
        Button btnSandwich = findViewById(R.id.sandwich);
        Button btnSheera = findViewById(R.id.sheera);
        Button btnSpringRoll = findViewById(R.id.springroll);

        // Set click listeners
        btnKajumasala.setOnClickListener(v -> openWebsite("https://youtu.be/XP41Huw-5H0?si=Ab06UOdMGI8KvT-_"));
        btnPavbhaji.setOnClickListener(v -> openWebsite("https://youtu.be/rSLiOqJ2egU?si=nvwkdP0ITPgujkwD"));
        btnManchurian.setOnClickListener(v -> openWebsite("https://youtu.be/2-uu7l3Qwuo?si=fmMWOHI7HZcd_JBd"));
        btnPulao.setOnClickListener(v -> openWebsite("https://youtu.be/GhHasCLX_9g?si=S8jxxOlYqyAf4s0N"));
        btnVegsoup.setOnClickListener(v -> openWebsite("https://youtu.be/LrKhcvZYFdQ?si=oRrUVbB564835U75"));
        btnMengo.setOnClickListener(v -> openWebsite("https://youtu.be/4YxjzIrB8Kk"));
        btnCake.setOnClickListener(v -> openWebsite("https://youtu.be/w-yg_Ik84j8?si=zBUEuGnonoSYjQS7"));
        btnJalebifafda.setOnClickListener(v -> openWebsite("https://youtu.be/NJ5Blr2oUu0"));
        btnBiryani.setOnClickListener(v -> openWebsite("https://youtu.be/HP2bVwNHJfM?si=RhXYmMnTP_OSBTIe"));
        btnBrownie.setOnClickListener(v -> openWebsite("https://youtu.be/PBdA7jEPMio?si=50BKarOYAZ5_p0jd"));
        btnBurger.setOnClickListener(v -> openWebsite("https://youtu.be/hsF0pzZpXWY?si=jqREIzFLb_r10xx1"));
        btnCholeBhature.setOnClickListener(v -> openWebsite("https://youtu.be/C9xA0KpHfq8?si=X8WKa_1Ts3Nau6FI"));
        btnChowMein.setOnClickListener(v -> openWebsite("https://youtu.be/u3vuq3zaR20?si=RNOeKDg4oLmZP3wD"));
        btnCutlet.setOnClickListener(v -> openWebsite("https://youtu.be/f9bMDCt0ip4?si=astMwLHGHpXjHi1p"));
        btnFriedRice.setOnClickListener(v -> openWebsite("https://youtu.be/P0ullgo0Lnw?si=NhmGIkIIjqd-cpow"));
        btnIceCream.setOnClickListener(v -> openWebsite("https://youtu.be/N6m6JgimUSg?si=AfXMmmp9nGibOxmZ"));
        btnLassi.setOnClickListener(v -> openWebsite("https://youtu.be/SlqpgRCdSyo?si=kxW81HE3eoAPHvcl"));
        btnLemonade.setOnClickListener(v -> openWebsite("https://youtu.be/8ygXBT4P0fg?si=G5dkSiuswheSvERv"));
        btnNoodles.setOnClickListener(v -> openWebsite("https://youtu.be/j5o7RUtyaRw?si=WQ_1W1CcMx7cXXcS"));
        btnPaneer.setOnClickListener(v -> openWebsite("https://youtu.be/bUounn_Bmy4?si=19Tmy61VT_NabD0P"));
        btnPaneerTikka.setOnClickListener(v -> openWebsite("https://youtu.be/ordrthopTvk?si=woemAHnBIADBHVR3"));
        btnParatha.setOnClickListener(v -> openWebsite("https://youtu.be/vz-QsNeFv6Y?si=IJjJFnYcErQY24Cn"));
        btnPasta.setOnClickListener(v -> openWebsite("https://youtu.be/yVDz0Av-s2A?si=nJ287ePNYeqStE7I"));
        btnPizza.setOnClickListener(v -> openWebsite("https://youtu.be/PwlpKt6a05c?si=INqyCe6q5-MeZ1FN"));
        btnSandwich.setOnClickListener(v -> openWebsite("https://youtu.be/BlzJzavriHw?si=Lnh8m0A37S0OwkGM"));
        btnSheera.setOnClickListener(v -> openWebsite("https://youtu.be/q6sGlr9iM5c?si=ckfiXww9dvy7lGnR"));
        btnSpringRoll.setOnClickListener(v -> openWebsite("https://youtu.be/cjtIawbqZQ8?si=txAKe1A0KLpB4dM3"));
    }

    // Method to open a website using an implicit intent
    private void openWebsite(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
