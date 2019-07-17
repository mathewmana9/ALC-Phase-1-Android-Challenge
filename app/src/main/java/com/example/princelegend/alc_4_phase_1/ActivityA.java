package com.example.princelegend.alc_4_phase_1;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;


public class ActivityA extends AppCompatActivity {
    public Button myprofile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        myprofile = (Button) findViewById(R.id.myprofile);

        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityC.class);
                startActivity(intent);
            }
        });
    }
    public void ActivityB(View view){
        Intent i = new Intent(ActivityA.this,ActivityB.class);
        startActivity(i);
    }
}
