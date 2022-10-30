package com.example.medcalc.ui.scales;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.medcalc.R;
import com.example.medcalc.databinding.FragmentScalesBinding;


public class ScalesFragment extends Fragment {

    private FragmentScalesBinding binding;
    class S implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
           GridLayout g = view.findViewById(R.id.scales_grid);
           Button b = new Button(view.getContext());
           b.setText("helloowrld");
           //g.addView(b);
        }
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       ScalesViewModel ScalesViewModel =
                new ViewModelProvider(this).get(ScalesViewModel.class);

        binding = FragmentScalesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Button add = root.findViewById(R.id.add_scale);
        add.setOnClickListener(new S());
        //final TextView textView = binding.textSlideshow;
        //slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onAddClicked(View view) {
        //GridLayout g = view.findViewById(R.id.scales_grid);
        //Button b = new Button(g.getContext());
        //b.setText("helloowrld");
        //g.addView(b);
    }
}
