package com.mksoftware.android.setfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragmentContent  extends AbstractFragment {


   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

      View view = inflater.inflate(R.layout.fragment_second, container, false);
      return view;
   }

   @Override
   public float getFragmentWeight() {
      return 0;
   }

   public static SecondFragmentContent getInstance(int orientation){
      return new SecondFragmentContent();
   }
}
