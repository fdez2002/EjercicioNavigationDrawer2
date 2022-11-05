package com.example.ejercicionavigationdrawer2.ui.dam;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ejercicionavigationdrawer2.R;
import com.example.ejercicionavigationdrawer2.databinding.FragmentDamBinding;
import com.example.ejercicionavigationdrawer2.ui.asir.AsirViewModel;


public class DamFragment extends Fragment {

    private FragmentDamBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DamViewModel galleryViewModel =
                new ViewModelProvider(this).get(DamViewModel.class);

        binding = FragmentDamBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textViewDamLargo;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}