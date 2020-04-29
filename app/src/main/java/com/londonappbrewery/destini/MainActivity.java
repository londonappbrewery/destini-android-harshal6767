package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
       private Button topButton;
       private Button bottomButton;
       private TextView textView;
       private int storyindex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

       topButton=(Button) findViewById(R.id.buttonTop);
       bottomButton=(Button) findViewById(R.id.buttonBottom);
       textView=(TextView) findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(storyindex==1 || storyindex==2) {
                    textView.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    storyindex=3;
                }
                else
                {
                    textView.setText(R.string.T6_End);
                    topButton.setVisibility(textView.GONE);
                    bottomButton.setVisibility(textView.GONE);

                }


                //  Log.d("destini","button has been pressed");
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(storyindex==1) {
                    textView.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    bottomButton.setText(R.string.T2_Ans2);
                    storyindex=2;}
                else if(storyindex==2) {
                    textView.setText(R.string.T4_End);
                    topButton.setVisibility(textView.GONE);
                    bottomButton.setVisibility(textView.GONE);
                }
                else
                {
                    textView.setText(R.string.T5_End);
                    topButton.setVisibility(textView.GONE);
                    bottomButton.setVisibility(textView.GONE);

                }
               // Log.d("destini","button has been pressed");
            }
        });

    }
}
