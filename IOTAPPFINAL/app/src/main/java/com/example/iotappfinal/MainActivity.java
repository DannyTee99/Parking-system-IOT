package com.example.iotappfinal;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.FirebaseApp;


public class MainActivity extends AppCompatActivity {

    private TextView tvslot1,tvslot2;

    private Button btnrefresh;
    private FirebaseAuth firebaseAuth;
    private DatabaseReference mDatabase;
    private long x;
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference mslot1= firebaseDatabase.getReference().child("Parking Area 1").child("Slot 1").child("Distance");
    private DatabaseReference mslot2= firebaseDatabase.getReference().child("Parking Area 1").child("Slot 1").child("Distance");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(MainActivity.this);
        setContentView(R.layout.activity_main);
        setupUI();
       firebaseAuth = firebaseAuth.getInstance();
       FirebaseApp.initializeApp(this);

        getdistance1();
        getdistance2();

        btnrefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
            }
        });

    }



    private void setupUI()
    {
        tvslot1 =(TextView)findViewById(R.id.tvslot1);
        tvslot2 =(TextView)findViewById(R.id.tvslot2);
        btnrefresh =(Button)findViewById(R.id.btnRefresh);
    }

    private void getdistance1()
    {
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Parking Area 1").child("Slot 1");

        mDatabase.child("Distance").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Long distance  = dataSnapshot.getValue(Long.class);
                    x = distance;
                    if (x>0 && x<500)
                    {
                        tvslot1.setText("Unavailable");
                    }
                    else
                    {
                        tvslot1.setText("available");
                    }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void getdistance2()
    {
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Parking Area 1").child("Slot 1");

        mDatabase.child("Distance").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                Long distance  = dataSnapshot.getValue(Long.class);
               x =  distance;

                if (x>0 && x<500)
                {
                    tvslot2.setText("available");
                }
                else
                {
                    tvslot2.setText("Unavailable");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
