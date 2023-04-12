package fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.uts_andro.R;

import java.util.Objects;

public class MainFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Button beras = (Button) rootView.findViewById(R.id.button_gas);
        Button gas = (Button) rootView.findViewById(R.id.button_beras);
        Button kolik = (Button) rootView.findViewById(R.id.button_kolik);
        gas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), R.string.beras_fragment, Toast.LENGTH_SHORT).show();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new BerasFragment(),"Fragment Beras").addToBackStack(null).commit();

            }
        });

        beras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), R.string.gas_fragment, Toast.LENGTH_SHORT).show();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new GasFragment(), "Fragment Gas").addToBackStack(null).commit();
            }
        });

        kolik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), R.string.kolik_fragment, Toast.LENGTH_SHORT).show();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new KolikFragment(),"Fragment Kolik").addToBackStack(null).commit();
            }
        });
        return rootView;
    }




}
