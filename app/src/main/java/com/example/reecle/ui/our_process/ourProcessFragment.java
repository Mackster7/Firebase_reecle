package com.example.reecle.ui.our_process;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.reecle.R;

public class ourProcessFragment extends Fragment {

    private ourProcessViewModel galleryViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater ,
                             ViewGroup container , Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(ourProcessViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ourprocess, container , false);

        return root;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }

}