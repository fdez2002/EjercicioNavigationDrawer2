package com.example.ejercicionavigationdrawer2.ui.daw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ejercicionavigationdrawer2.databinding.FragmentDawBinding;

public class DawFragment extends Fragment {

    private FragmentDawBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DawViewModel slideshowViewModel =
                new ViewModelProvider(this).get(DawViewModel.class);

        binding = FragmentDawBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}