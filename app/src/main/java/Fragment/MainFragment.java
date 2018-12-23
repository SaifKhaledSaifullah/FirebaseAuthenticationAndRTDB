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
    private Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context=getActivity();
        view=inflater.inflate(R.layout.fragment_main,container,false);
        initializeViewsandAttachListeners(view);
        return view;
    }

    private void initializeViewsandAttachListeners(View view) {
        btnOTPAuthentication=view.findViewById(R.id.btnOTPAuthentication);
        btnOTPAuthentication.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnOTPAuthentication:
                PhoneAuthFragment phoneAuthFragment=new PhoneAuthFragment();
                new FragmentUtilities(getActivity()).replaceFragment(R.id.container,phoneAuthFragment);
                break;
        }

    }
}
