package com.example.chefs;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipesActivity extends AppCompatActivity {

    HorizontalScrollView autoImageScroll;
    LinearLayout imageContainer;
    Handler handler = new Handler();
    int currentIndex = 0;
    int imageWidth; // in px
    int totalImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        autoImageScroll = findViewById(R.id.autoImageScroll);
        imageContainer = (LinearLayout) autoImageScroll.getChildAt(0);

        totalImages = imageContainer.getChildCount();

        // convert 380dp + 16dp margin to pixels
        imageWidth = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                396,
                getResources().getDisplayMetrics()
        );

        handler.postDelayed(autoScrollRunnable, 3000); // change every 3s

        ImageView jalebi = findViewById(R.id.jalebi);
        ImageView ikachori = findViewById(R.id.ikachori);
        ImageView Idli = findViewById(R.id.Idli);
        ImageView imgMango = findViewById(R.id.imgMango);
        ImageView Manchurian = findViewById(R.id.imgmanchurian);

        // Buttons
        Button btnManchurian = findViewById(R.id.btnmanchurian);
        Button btnVegSoup = findViewById(R.id.btnvegsoup);
        Button btndosa = findViewById(R.id.btndosa);
        Button btnpoha = findViewById(R.id.btnpoha);
        Button btnkachori = findViewById(R.id.btnkachori);
        Button btnidli = findViewById(R.id.btnidli);
        Button btncake = findViewById(R.id.btncake);
        Button btnsamosa = findViewById(R.id.btnsamosa);
        Button btndhokla = findViewById(R.id.btndhokla);
        Button btnstrawberry = findViewById(R.id.btnstrawberry);

        Button btnpasta = findViewById(R.id.btnpasta);
        Button btnpizza = findViewById(R.id.btnpizza);
        Button btnpaneer = findViewById(R.id.btnpaneer);
        Button btnfriedrice = findViewById(R.id.btnfriedrice);
        Button btnburger = findViewById(R.id.btnburger);
        Button btnnoodles = findViewById(R.id.btnnoodles);
        Button btnparatha = findViewById(R.id.btnparatha);
        Button btnsandwich = findViewById(R.id.btnsandwich);
        Button btncutlet = findViewById(R.id.btncutlet);
        Button btnbiryani = findViewById(R.id.btnbiryani);
        Button btnpaneertikka = findViewById(R.id.btnpaneertikka);
        Button btnspringroll = findViewById(R.id.btnspringroll);
        Button btnsheera = findViewById(R.id.btnsheera);
        Button btncholebhature = findViewById(R.id.btncholebhature);
        Button btnpavbhaji = findViewById(R.id.btnpavbhaji);
        Button btnlassi = findViewById(R.id.btnlassi);
        Button btnlemonade = findViewById(R.id.btnlemonade);
        Button btnbrownie = findViewById(R.id.btnbrownie);
        Button btnicecream = findViewById(R.id.btnicecream);
        Button btnchowmein = findViewById(R.id.btnchowmein);


        // Set click listeners
        jalebi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, JalebifafdaActivity.class);
                startActivity(intent);
            }
        });

        ikachori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, KachoriActivity.class);
                startActivity(intent);
            }
        });

        Idli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, IdliActivity.class);
                startActivity(intent);
            }
        });

        imgMango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, MangoActivity.class);
                startActivity(intent);
            }
        });

        Manchurian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, ManchurianActivity.class);
                startActivity(intent);
            }
        });




        btnManchurian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, ManchurianActivity.class);
                intent.putExtra("recipe_name", "Manchurian");
                startActivity(intent);
            }
        });

        btnVegSoup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, Veg_soupActivity.class);
                intent.putExtra("recipe_name", "Veg Soup");
                startActivity(intent);
            }
        });

        btndosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, DosaActivity.class);
                intent.putExtra("recipe_name", "Dosa Sambar");
                startActivity(intent);
            }
        });

        btnpoha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, PohaActivity.class);
                intent.putExtra("recipe_name", "Poha");
                startActivity(intent);
            }
        });

        btnkachori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, KachoriActivity.class);
                intent.putExtra("recipe_name", "Kachori");
                startActivity(intent);
            }
        });

        btnidli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, IdliActivity.class);
                intent.putExtra("recipe_name", "Idli Sambar");
                startActivity(intent);
            }
        });

        btncake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, CakeActivity.class);
                intent.putExtra("recipe_name", "Cake");
                startActivity(intent);
            }
        });

        btnsamosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, SamosaActivity.class);
                intent.putExtra("recipe_name", "Samosa");
                startActivity(intent);
            }
        });

        btndhokla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, DhoklaActivity.class);
                intent.putExtra("recipe_name", "Dhokla");
                startActivity(intent);
            }
        });

        btnstrawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, StrawberryActivity.class);
                intent.putExtra("recipe_name", "Sreawbwrry shake");
                startActivity(intent);
            }
        });

        btnpasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, PastaActivity.class);
                intent.putExtra("recipe_name", "Pasta");
                startActivity(intent);
            }
        });

        btnpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, PizzaActivity.class);
                intent.putExtra("recipe_name", "Pizza");
                startActivity(intent);
            }
        });

        btnpaneer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, PaneerActivity.class);
                intent.putExtra("recipe_name", "Paneer Masala");
                startActivity(intent);
            }
        });

        btnfriedrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, FriedRiceActivity.class);
                intent.putExtra("recipe_name", "Fried Rice");
                startActivity(intent);
            }
        });

        btnburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, BurgerActivity.class);
                intent.putExtra("recipe_name", "Burger");
                startActivity(intent);
            }
        });

        btnnoodles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, NoodlesActivity.class);
                intent.putExtra("recipe_name", "Noodles");
                startActivity(intent);
            }
        });

        btnparatha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, ParathaActivity.class);
                intent.putExtra("recipe_name", "Aloo Paratha");
                startActivity(intent);
            }
        });

        btnsandwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, SandwichActivity.class);
                intent.putExtra("recipe_name", "Sandwich");
                startActivity(intent);
            }
        });

        btncutlet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, CutletActivity.class);
                intent.putExtra("recipe_name", "Cutlet");
                startActivity(intent);
            }
        });

        btnbiryani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, BiryaniActivity.class);
                intent.putExtra("recipe_name", "Veg Biryani");
                startActivity(intent);
            }
        });

        btnpaneertikka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, PaneerTikkaActivity.class);
                intent.putExtra("recipe_name", "Paneer Tikka");
                startActivity(intent);
            }
        });

        btnspringroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, SpringRollActivity.class);
                intent.putExtra("recipe_name", "Spring Roll");
                startActivity(intent);
            }
        });

        btnsheera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, SheeraActivity.class);
                intent.putExtra("recipe_name", "Sheera");
                startActivity(intent);
            }
        });

        btncholebhature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, CholeBhatureActivity.class);
                intent.putExtra("recipe_name", "Chole Bhature");
                startActivity(intent);
            }
        });

        btnpavbhaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, PavBhajiActivity.class);
                intent.putExtra("recipe_name", "Pav Bhaji");
                startActivity(intent);
            }
        });

        btnlassi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, LassiActivity.class);
                intent.putExtra("recipe_name", "Lassi");
                startActivity(intent);
            }
        });

        btnlemonade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, LemonadeActivity.class);
                intent.putExtra("recipe_name", "Lemonade");
                startActivity(intent);
            }
        });

        btnbrownie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, BrownieActivity.class);
                intent.putExtra("recipe_name", "Brownie");
                startActivity(intent);
            }
        });

        btnicecream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, IceCreamActivity.class);
                intent.putExtra("recipe_name", "Ice Cream");
                startActivity(intent);
            }
        });

        btnchowmein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipesActivity.this, ChowMeinActivity.class);
                intent.putExtra("recipe_name", "Chow Mein");
                startActivity(intent);
            }
        });
    }

    private Runnable autoScrollRunnable = new Runnable() {
        @Override
        public void run() {
            currentIndex++;

            if (currentIndex >= totalImages) {
                currentIndex = 0; // reset to first image
            }

            int scrollToX = currentIndex * imageWidth;
            autoImageScroll.smoothScrollTo(scrollToX, 0);

            handler.postDelayed(this, 3000);
        }
    };
}
