package in.xtremeworkplace.xtremeworkplace.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import in.xtremeworkplace.xtremeworkplace.R;

public class Home_page extends AppCompatActivity {
    ImageView refer_earn,affiliate_m,sign_ups,log_in,cus_log,shop,trem_condition,support,share,web_app;
    CardView latest_deals,web_hosting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        refer_earn = findViewById(R.id.refer_earn);
        affiliate_m = findViewById(R.id.affiliate_m);




        latest_deals = findViewById(R.id.latest_deals);

        sign_ups = findViewById(R.id.sign_ups);
        log_in = findViewById(R.id.log_in);

        cus_log = findViewById(R.id.cus_log);

        shop = findViewById(R.id.shop);

        trem_condition = findViewById(R.id.trem_condition);

        support = findViewById(R.id.support);

        web_hosting = findViewById(R.id.web_hosting);

        web_app = findViewById(R.id.web_app);


        share = (ImageView) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick (View v){
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody="Your Link";
                String shareSUb="You Subject here";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSUb);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myIntent,"Share Using"));


            }

        });



        refer_earn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("Your Link");


            }
        });

        affiliate_m.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("Your Link");


            }
        });


        latest_deals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("Your Link");


            }
        });





        sign_ups.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("Your Link");


            }
        });

        log_in.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("Your Link");


            }
        });

        cus_log.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("Your Link");


            }
        });


        shop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("Your Link");


            }
        });



        trem_condition.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("Your Link");


            }
        });


        support = (ImageView) findViewById(R.id.support);
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(Home_page.this, feedback.class);
                startActivity(streamIntent);
            }
        });





        web_hosting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("Your Link");


            }
        });





        web_app.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("Your Link");


            }
        });




    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}
