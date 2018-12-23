package Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.saif.firebaseauthenticationandrtdb.R;

import Utils.FragmentUtilities;

public class MainFragment extends Fragment implements View.OnClickListener {
    private View view;
    private Button btnOTPAuthentication;
    private Button btnEmailPassAuth;
    private Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context=getActivity();
        view=inflater.inflate(R.layout.fragment_main,container,false);

        // Assign Views
        assignViews(view);
        return view;
    }

    private void assignViews(View view) {
        btnOTPAuthentication=view.findViewById(R.id.btnOTPAuthentication);
        btnEmailPassAuth=view.findViewById(R.id.btnEmailPassAuth);

        // Assign Listeners
        assignListeners();


    }

    private void assignListeners() {
        btnOTPAuthentication.setOnClickListener(this);
        btnEmailPassAuth.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnOTPAuthentication:
                PhoneAuthFragment phoneAuthFragment=new PhoneAuthFragment();
                new FragmentUtilities(getActivity()).replaceFragment(R.id.container,phoneAuthFragment);
                break;

            case R.id.btnEmailPassAuth:
                EmailPassAuthFragment emailPassAuthFragment=new EmailPassAuthFragment();
                new FragmentUtilities(getActivity()).replaceFragment(R.id.container,emailPassAuthFragment);
                break;
        }

    }
}
