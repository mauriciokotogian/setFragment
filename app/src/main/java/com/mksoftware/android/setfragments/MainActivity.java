package com.mksoftware.android.setfragments;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

   FrameLayout mainContainer;

   FrameLayout secondContainer;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      int orientation = getResources().getConfiguration().orientation;
      mainContainer = findViewById(R.id.mainfragment);
      secondContainer = findViewById(R.id.secondfragment);
      LinearLayout container = findViewById(R.id.container);
      LinearLayout.LayoutParams lParams = (LinearLayout.LayoutParams) container.getLayoutParams();
      mainContainer.setLayoutParams(lParams);
      secondContainer.setLayoutParams(lParams);

      setFragmentContent(MainFragmentContent.getInstance(orientation),
            SecondFragmentContent.getInstance(orientation));
   }

   private <T extends AbstractFragment, S extends AbstractFragment> void setFragmentContent(T main,
         S second) {



      main.getFragmentWeight();

      getFragmentManager().beginTransaction().replace(R.id.mainfragment, main).
            replace(R.id.secondfragment, second).commit();
   }
}
