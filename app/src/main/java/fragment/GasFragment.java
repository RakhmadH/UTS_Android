package fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.uts_andro.R;


public class GasFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View gasView = inflater.inflate(R.layout.fragment_gas, container, false);
        Button back_gas = gasView.findViewById(R.id.button_back_gas);
        back_gas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), R.string.root_fragment, Toast.LENGTH_SHORT).show();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new MainFragment()).commit();
            }
        });
        return gasView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Fragment mapsFragment = fragment.MapsFragment.newInstance(-7.8088760429700885, 110.30099701538381,"Toko Pojok Bu Suhadi");
        FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        ft.add(R.id.google_map_gas, mapsFragment).commit();
    }
}