package com.example.ejercicionavigationdrawer2.ui.acercaDe;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ejercicionavigationdrawer2.databinding.FragmentAcercaDeBinding;
import com.example.ejercicionavigationdrawer2.databinding.FragmentAsirBinding;
import com.example.ejercicionavigationdrawer2.ui.asir.AsirViewModel;


public class AcercaDeFragment extends Fragment {

    private FragmentAcercaDeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AcercaDeViewModel galleryViewModel =
                new ViewModelProvider(this).get(AcercaDeViewModel.class);

        binding = FragmentAcercaDeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textViewAcercaDe;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}