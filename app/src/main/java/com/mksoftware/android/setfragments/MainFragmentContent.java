package com.mksoftware.android.setfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragmentContent extends AbstractFragment {

   private float layout_weight;


   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
         Bundle savedInstanceState) {

      View view = inflater.inflate(R.layout.fragment_main, container, false);
      return view;

   }

   @Override
   public float getFragmentWeight() {
      return 0;
   }

   public static MainFragmentContent getInstance(int orientation){

      //if()
      return new MainFragmentContent();
   }


}
