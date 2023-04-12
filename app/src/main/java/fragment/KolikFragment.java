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

public class KolikFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View kolikView = inflater.inflate(R.layout.fragment_kolik, container, false);
        Button back_kolik = kolikView.findViewById(R.id.button_kembali_kolik);
        back_kolik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), R.string.root_fragment, Toast.LENGTH_SHORT).show();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new MainFragment()).commit();
            }
        });
        return kolikView;
    }


//    }
@Override
public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    Fragment mapsFragment = fragment.MapsFragment.newInstance(-7.8039571330070645, 110.30366853467011,"Kolam Ikan Sendowo");
    FragmentTransaction ft = getChildFragmentManager().beginTransaction();
    ft.add(R.id.google_map_kolik, mapsFragment).commit();
    }
}